
class Main {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.add(8,105);
        tree.add(2,101);
        tree.add(10,107);
        tree.add(11,103);
        tree.add(4,108);
        tree.add(9,106);
      
        tree.add(3,102);
        for (int i : tree)
            System.out.println("next value " + i);


       /* ArrayQueue arrayQueue = new ArrayQueue();

        for(int i = 0; i < 5; i++)
        {
            arrayQueue.add(i);
        }

        System.out.println(arrayQueue.remove());
        System.out.println(arrayQueue.remove());
        System.out.println(arrayQueue.remove());

        for(int i = 0; i < 8; i++)
        {
            arrayQueue.add(i + 5);
        }

        for(int i = 0; i < 10; i++)
        {
            System.out.println(arrayQueue.remove());
        }

        /*DynamicArrayQueue dynamicArrayQueue = new DynamicArrayQueue();

        for(int i = 0; i < 5; i++)
        {
            dynamicArrayQueue.add(i);
        }

        System.out.println(dynamicArrayQueue.remove());
        System.out.println(dynamicArrayQueue.remove());
        System.out.println(dynamicArrayQueue.remove());

        for(int i = 0; i < 8; i++)
        {
            dynamicArrayQueue.add(i + 5);
        }

        for(int i = 0; i < 10; i++)
        {
            System.out.println(dynamicArrayQueue.remove());
        }

        System.out.println("Stack capacity " + dynamicArrayQueue.capacity);
    }*/
}
}
