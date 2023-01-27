import java.util.*;

public class stackLinkedList {
    private LinkedList firstNode;

    public void push(int index) {
        LinkedList newNode = new LinkedList(index, firstNode);
        firstNode = newNode;
    }

    public int pop() {
        if (firstNode == null) {
            System.out.println("Sorry nothing to pop");
            return 0;
        }

        int value = firstNode.head;
        firstNode = firstNode.tail;
        return value;
    }
}