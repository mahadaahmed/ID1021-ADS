public class BinaryTree {
    
    public class Node {
        public Integer key;
        public Integer value;
        public Node left, right;

            public Node(Integer key, Integer value) {
                this.key = key;
                this.value = value;
                this.left = this.right = null;
            }
    }

    Node root;

    public BinaryTree() {
    root = null;
    }

    void add(Integer k, Integer value){}

    void delete(Integer k){}

    void lookup(Integer k)
}