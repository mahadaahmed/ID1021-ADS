
import java.util.Random;


public class benchLinkedLists {

    public static void main(String[] args) {

        int[] sizes = { 100, 200, 400, 800, 1600, 3200, 6400 };
        int[] array;
        int runs = 1000;
        double min = 0;
        double max = 0;
        double sum = 0;
        System.out.println("# Different operations on a linked list, time in ns");
        System.out.printf("#%7s\t%9s\t%9s\t%9s\n", "n", "Append dynamic", "Append fixed", "Building the list");

        //for (int n : sizes) {
         //System.out.printf("%8d\t", n);

            // min = Double.POSITIVE_INFINITY;

            // for (int k = 0; k < runs; k++) {
            //     LinkedList listA = new LinkedList(0, null);
            //     LinkedList listB = new LinkedList(0, null);

            //     for (int i = 1; i <= 3200; i++) {
            //         listA.append(new LinkedList(i, null)); // Byt till listB om du vill bencha list B
            //     }

            //     long t0 = System.nanoTime();
            //     listB.append(listB);
            //     long t1 = (System.nanoTime() - t0);
            //     sum += t1;
            // }
            // System.out.println(sum / runs);

            
       // }

    for(int k = 0; k < runs; k++){

    
       int arr1[] = new int[100];
        int arr2[] = new int[6400];
        
        for(int i = 0; i< arr1.length; i++){
            arr1[i]= i;
        }

        for(int j = 0; j< arr2.length; j++){
            arr2[j]= j;
        }

        long t0 = System.nanoTime();
        arrayAppend(arr1, arr2);
        long t1 = System.nanoTime()-t0;
        sum += t1;
    }
    System.out.println(sum/runs);
    }
    // min = Double.POSITIVE_INFINITY;
    // max = 0;
    // sum = 0;
    // int z = 0;
    // for (int i = 0; i < runs; i++) {
    // LinkedList first = filledList(100);
    // LinkedList second = filledList(z);
    // long t0 = System.nanoTime();
    // first.append(second);
    // long t1 = System.nanoTime();
    // double t = (t1 - t0);
    // if (t < min)
    // min = t;
    // else if (t > max)
    // max = t;
    // sum += t;
    // }
    // System.out.printf("%9.0f\t\t\t", min);

    // min = Double.POSITIVE_INFINITY;
    // max = 0;
    // sum = 0;
    // int f = 0;
    // for (int i = 0; i < runs; i++) {
    // long t0 = System.nanoTime();
    // LinkedList first = filledList(f);
    // long t1 = System.nanoTime();
    // double t = (t1 - t0);
    // if (t < min)
    // min = t;
    // else if (t > max)
    // max = t;
    // sum += t;
    // }
    // }

    public static LinkedList filledList(int numberOfCells) {
        LinkedList listToFill = new LinkedList(0, null);
        for (int i = 0; i <= numberOfCells; i++)
            listToFill.append(new LinkedList(i, null));
        return listToFill;
    }

    public static int[] filledArray(int numberOfElements) {
        Random rnd = new Random();
        int[] arrayToFill = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++)
            arrayToFill[i] = rnd.nextInt(1000);
        return arrayToFill;
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