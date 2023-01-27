public class Queue {
    Node head;
    Node end;

    public class Node {
        public BinaryTree.Node binNode;
        public Node tail;

        public Node(BinaryTree.Node item, Node list) {
            this.binNode = item;
            this.tail = list;
        }
    }

    public Queue() {
        head = null;
        end = null;
    }
    public void add(BinaryTree.Node binNode) {
        if (head == null){
            Node first = new Node(binNode, null);
            head = first;
            end = first;
        }
        else {
            end.tail = new Node(binNode, null);
            end = end.tail;
        }

    }

    public BinaryTree.Node remove() {
        Node temp = head;
        head = head.tail;
        return temp.binNode;
    }
}