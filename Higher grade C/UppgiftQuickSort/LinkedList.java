public class LinkedList{
  Node head;
  Node last;

  class Node{
    public int value;
    public Node next;
    
    public Node (int value, Node next){
      this.value = value;
      this.next = next;
    }
  }

  public void add (int value){
    if (head == null){
      head = new Node(value, null);
      last = head;
    }
    else{
      Node current = head;
      while (current.next != null)
        {
          current = current.next;
        }
      current.next = new Node(value, null);
      last = current.next;
    }
  }
}