class TreeHeap{
  Node root;

  class Node{
    int value;
    Node left;
    Node right;
    int numberOfNodesInSubTree;

    public Node(int value){
      this.value = value;
      this.left = null;
      this.right = null;
      numberOfNodesInSubTree = 1;
    }

    Integer add(Integer value) {
      if(value < this.value) {
        Integer tmp = this.value;
        this.value = value;
        value = tmp;
      }
    
      this.numberOfNodesInSubTree += 1;
    
      if (this.left == null) {
        this.left = new Node(value);
        return 1;
      } 
      else if(this.right == null) {
        this.right = new Node(value);
        return 1;
      } 
      else {
        Integer d = this.right.add(value);
        Node tmp = this.right;
        this.right = this.left;
        this.left = tmp;
        return d + 1;
      }
    }

    private Node remove() {
      
      if (this.left == null) {
        return this.right;
      }
      else if (this.right == null) {
        return this.left;
      }
      else if (this.left.value < this.right.value) {
        this.value = this.left.value;
        this.left = this.left.remove();
      } 
      else {
        this.value = this.right.value;
        this.right = this.right.remove();
      }
      this.numberOfNodesInSubTree -=1;
      return this;
    }
  }
  public Integer enqueue(Integer prio) {
    if (root != null) {
      return root.add(prio);
    }
    root = new Node(prio);
    return 0;
  }

  Integer dequeue(Integer prio) {
  if (root != null) {
    Integer ret = root.value;
    root = root.remove();
    return ret;
  } 
  else {
    return null;
  }
}
  

  // public void add(int value){
  //   Node newNode = new Node (value, null, null);
  //   if (root == null){
  //     root = newNode;
  //     return;
  //   }

  //   Node current = root;
  //   while (current != null){
  //     if (current.value > value){
  //       int temp = current.value;
  //       current.value = value;
  //       value = temp;
  //     }
  //   }
  // }
  
}