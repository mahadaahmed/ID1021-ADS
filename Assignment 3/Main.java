import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*
         * Random rnd = new Random();
         * 
         * int[] arr = new int[100];
         * for (int i = 0; i < arr.length; i++)
         * arr[i] = rnd.nextInt(50);
         */

        // create a sorted array
        int[] sortedArray = sorted(200);
        int[] sortedArray2 = sorted(200);

        // betterAccess(sortedArray, sortedArray2);
        nLognAccess(sortedArray, sortedArray2);

        // binary_search(sortedArray, rnd.nextInt(10000));

        // search_unsorted(arr, 20);
    }

    public static boolean search_unsorted(int[] array, int key) {

        long t0 = System.nanoTime();
        for (int index = 0; index < array.length; index++) {
            if (array[index] == key) {
                System.out.println(System.nanoTime() - t0 + "ns");
                return true;
            }
        }
        return false;
    }

    private static int[] sorted(int n) {
        Random rnd = new Random();
        int[] array = new int[n];
        int nxt = 0;
        for (int i = 0; i < n; i++) {
            nxt += rnd.nextInt(10) + 1;
            array[i] = nxt;
        }
        return array;
    }

    public static boolean binary_search(int[] array, int key) {

        int first = 0;
        int last = array.length - 1;
        // long t0 = System.nanoTime();
        while (true) {
            // jump to the middle
            int index = (first + last) / 2;
            if (array[index] == key) {
                // System.out.println(System.nanoTime() - t0 + "ns");
                return true;
            }
            if (array[index] < key && index < last) {
                // The index position holds something that is less than
                // what we're looking for, what is the first possible page?
                first = index + 1;
                continue;
            }
            if (array[index] > key && index > first) {
                // The index position holds something that is larger than
                // what we're looking for, what is the last possible page?
                last = index - 1;
                continue;
            }
            // item does not exist in target array.
            break;
        }
        return false;
    }

    private static double betterAccess(int[] array, int[] keys) {
        int indexfirst = 0;
        int indexsecond = 0;

        int sum = 0;
        double t_total = 0;

        // fill the array with with random number from 0 to 10*n

        long t0 = System.nanoTime();
        while (indexfirst < keys.length && indexsecond < array.length) {
            if (array[indexsecond] < keys[indexfirst]) {
                indexsecond++;
            } else if (array[indexsecond] == keys[indexfirst]) {
                sum++;
                indexfirst++;
            } else if (array[indexsecond] > keys[indexfirst]) {
                indexfirst++;
            }
        }
        t_total += (System.nanoTime() - t0);
        System.out.println(t_total + "ns");

        return t_total;
    }

    private static double access(int[] array, int[] keys) {
        int indexFirst = 0;
        int indexSecond = 0;

        int sum = 0;
        double t_total = 0;

        // fill the array with with random number from 0 to 10*n

        long t0 = System.nanoTime();

        while (indexFirst < keys.length) {
            if (indexSecond == array.length) {
                indexSecond = 0;
                indexFirst++;
            } else if (array[indexSecond] < keys[indexFirst])
                indexSecond++;

            else if (array[indexSecond] == keys[indexFirst]) {
                sum++;
                indexSecond = 0;
                indexFirst++;
            } else if (array[indexSecond] > keys[indexFirst]) {
                indexSecond = 0;
                indexFirst++;
            }

        }
        t_total += (System.nanoTime() - t0);
        System.out.println(t_total + "ns");

        return t_total;
    }

    public static double nLognAccess(int[] array, int[] keys) {
        int duplicated = 0;
        double t_total = 0;
        long t0 = System.nanoTime();

        for (int i = 0; i < keys.length; i++) {
            if (binary_search(array, keys[i]) == true) {
                duplicated++;
            }
        }

        t_total += (System.nanoTime() - t0);
        System.out.println(t_total + "ns");

        return t_total;
        // return duplicated;
    }
}
