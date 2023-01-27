public class Insertion {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // for each element from i towards 1, swap the item found with the
            // item before it if it is smaller
            for (int j = i; j > 0 && array[j] < array[j-1]; j--) {
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }
        }
    }
}
