class LinkedListPrioRemove{
  Node first;
  Node last;

  public void add(int value){
    Node newNode = new Node(value, null);
    if (first == null){
      first = newNode;
      last = newNode;
      return;
    }
    if (first.next == null){
      if (value < first.value){
        Node temp = first;
        first = newNode;
        first.next = temp;
      }
      else {
        first.next = newNode;
      }
      last = first.next;
      return;
    }
    if (first.value > value){
      newNode.next = first;
      first = newNode;
      return;
    }
    
    Node curr = first;
    while(curr.next != null){
      if (curr.value <= value && curr.next.value >= value){
        newNode.next = curr.next;
        curr.next = newNode;
        return;
      }
      curr = curr.next;
    }
    last.next = newNode;
    last = newNode;
  }

  public int remove(){
    if (first == null)
      return 0;

    int temp = first.value;
    first = first.next;

    return temp;
  }
}