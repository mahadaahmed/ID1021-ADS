class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    int[] array = {7,8,3,4,10,9};
    sort(array, 0, 5);

    for (int x: array)
      System.out.println(x);

    LinkedList list = new LinkedList();
    list.add(7);
    list.add(8);
    list.add(3);
    list.add(4);
    list.add(10);
    list.add(9);

    sortLinked(list.head, list.last);
    LinkedList.Node temp = list.head;
    System.out.println(temp.value);
    while (temp.next != null){
      System.out.println(temp.next.value);
      temp = temp.next;
    }
  }

  public static void sort (int[] array, int first, int last){
    if (first >= last)
      return;

    int middle = partition(array, first, last);

    sort(array, first, middle - 1);
    sort(array, middle + 1, last);
  }
  public static int partition (int[] array, int first, int last){
    int i = last + 1;
    int pivot = array[first];

    for (int j = last; j >= 0; j--){
      if (array[j] > pivot){
        i--;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
    i--;
    int temp = array[i];
    array[i] = array[first];
    array[first] = temp;

    return i;
    
    
  }
  
  public static void sortLinked (LinkedList.Node first, LinkedList.Node last){
    if (first == null || last == null || first == last)
      return;

    LinkedList.Node middle = partitionLinked(first, last);

    sortLinked(first, middle);
    sortLinked(middle.next, last);
  }
  public static LinkedList.Node partitionLinked (LinkedList.Node first, LinkedList.Node last){
    if (first == null || last == null || first == last)
      return null;
    
    LinkedList.Node prev = first;
    LinkedList.Node current = first;
    int pivot = last.value;

    while (first != last){
      if (first.value < pivot){
        prev = current;
        int temp = current.value;
        current.value = first.value;
        first.value = temp;
        current = current.next;
      }
      first = first.next;
    }
    int temp = current.value;
    current.value = pivot;
    last.value = temp;

    return prev;
  }
}