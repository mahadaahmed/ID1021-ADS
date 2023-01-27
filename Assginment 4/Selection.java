public class Selection {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            // let's set the first candidate to the index itself
            int cand = i;
            for (int j = i; j < array.length ; j++)
                    // If the element at position j is smaller than the value
                    // at the candidate position - then you have a new candidate
                    // posistion.
                    if (array[j] < array[cand])
                        cand = j;
            // Swap the item at position i with the item at the candidate position.
            int temp = array[i];
            array[i] = array[cand];
            array[cand] = temp;
        }
    }
}
