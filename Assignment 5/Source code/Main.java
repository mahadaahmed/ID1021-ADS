
public class Main {
    public static void main(String[] args) {
        // long t0 = System.nanoTime();
        /*
         * int runs = 1000;
         * long sum = 0;
         * for (int j = 0; j < runs; j++) {
         * 
         * LinkedList listA = new LinkedList(0, null);
         * LinkedList listB = new LinkedList(0, null);
         * 
         * for (int i = 0; i <= 1600; i++) {
         * listB.append(new LinkedList(i, null));
         * }
         * 
         * for (int i = 0; i <= 100; i++) {
         * listA.append(new LinkedList(i, null));
         * }
         * long t0 = System.nanoTime();
         * listA.append(listB);
         * long t1 = System.nanoTime() - t0;
         * sum += t1;
         * 
         * // System.out.println((System.nanoTime() - t0) + "ns");
         * }
         * System.out.println(sum / runs);
         */

        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr2 = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        int[] myArray = arrayAppend(arr1, arr2);
        for (int i = 0; i <= myArray.length; i++) {
            // System.out.println(Arrays.toString(myArray));
        }

        LinkedList listC = new LinkedList(0, null);
        for (int i = 1; i <= 10; i++) {
            listC.append(new LinkedList(i, null));
        }
        for (int i = 1; i <= 10; i++) {
            // System.out.println(listC.head + i);
        }

        listC.push(5);
        listC.push(14);
        listC.push(15);
        listC.push(225);
        listC.push(3335);

        int value = listC.pop();
        System.out.println(value);
    }

    public static int[] arrayAppend(int arr1[], int arr2[]) {

        int[] completeArray = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            completeArray[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            completeArray[arr1.length + i] = arr2[i];
        }
        return completeArray;
    }
}