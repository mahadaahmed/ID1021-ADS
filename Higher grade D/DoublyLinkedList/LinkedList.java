public class LinkedList {
    int head;
    LinkedList tail;
    private LinkedList firstNode;

    public LinkedList(int item, LinkedList list) {
        head = item;
        tail = list;
    }

    public int head() {
        return this.head;
    }

    public LinkedList tail() {
        return this.tail;
    }

    public void append(LinkedList b) {
        LinkedList nxt = this;
        while (nxt.tail != null) {
            nxt = nxt.tail;
        }
        nxt.tail = b;
    }

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


    public void add(LinkedList node) {
		int temporary = head;
		node.tail = tail;
		head = node.head;
		tail = node;
		node.head = temporary;

    }
    
    public void remove(LinkedList nodeToRemove){
        LinkedList curr = this;
        if(nodeToRemove == null){
           return;
        }

        if(curr.head == nodeToRemove.head){
            curr.head = curr.tail.head;
            curr.tail = curr.tail.tail;
        }

        while (curr.tail != null) {
			// If it is the last element
			if (curr.tail.tail == null && curr.tail.head == nodeToRemove.head) {
				curr.tail = null;
				break;
			}
			else if (curr.tail.head == nodeToRemove.head) {
				curr.tail = curr.tail.tail;
			}
			curr = curr.tail;
		}

    }

}