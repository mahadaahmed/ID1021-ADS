public class Main {
    
    public static void main(String[] args) {
        doublyNode head = new doublyNode(2);
        doublyLinkedList list = new doublyLinkedList(head);
        list.addAtTheEnd(3);
        list.addAtTheEnd(4);
        list.addAtTheEnd(5);
        list.addAtTheEnd(6);
        list.addAtTheEnd(7);
        System.out.print("The Original List" + ": ");
        doublyLinkedList.printList(list);
        list.remove(list.head.next.next.next.next.next);
        System.out.print("The New List" + ": ");
        doublyLinkedList.printList(list);
    }

    void doublyToFill(){
        doublyLinkedList list = new doublyLinkedList(new doublyNode(1));
    }

  
}
