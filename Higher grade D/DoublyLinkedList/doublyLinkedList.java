public class doublyLinkedList{

doublyNode head;


doublyLinkedList(doublyNode head){

    this.head = head;
}


void addAtTheStart(int data){
    doublyNode node = new doublyNode(data);

    if(head == null){
        head = node;
    }
    else{
        node.next = head;
        head.prev = node;
        head = node;
    }
    
}

public void addAtTheEnd(int data){
    doublyNode node = new doublyNode(data);
    if (head == null){
        head = node;
    }

    doublyNode curr = head;
    while(curr.next != null){
        curr = curr.next;
    }
    curr.next = node;
    node.prev = curr;
}


public void remove(doublyNode nodeToBeRemoved){

    // If head is null then there is no list
    if(head == null){
        System.out.println("Nothing here to remove");
    }
    //if nodeToBeRemoved is null then
    //is nothing to remove
    if(nodeToBeRemoved == null){
        System.out.println("No node detected");
    }
    //Case if we want to remove the head
    if(head == nodeToBeRemoved){
       head = head.next;
    }
    //Case if we want to remove a node that is not the last node
    if(nodeToBeRemoved.next != null){
        nodeToBeRemoved.next.prev = nodeToBeRemoved.prev;
    }
    //Case if we want to remove a node that is not the head
    if(nodeToBeRemoved.prev != null){
        nodeToBeRemoved.prev.next = nodeToBeRemoved.next;
    }
    return;
}

    public static void printList(doublyLinkedList list){
        doublyNode curr = list.head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

}