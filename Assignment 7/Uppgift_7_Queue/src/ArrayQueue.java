public class ArrayQueue {
    private int[] array;
    private int capacity = 10;
    private int firstInQueue;
    private int nextAvailableSpot;
    private boolean queueIsEmpty;

    public ArrayQueue(){
        array = new int[capacity];
        nextAvailableSpot = 0;
        firstInQueue = 0;
        queueIsEmpty = true;
    }

    public void add(int newInQueue){
        array[nextAvailableSpot] = newInQueue;
        nextAvailableSpot++;
        queueIsEmpty = false;

        if (nextAvailableSpot == capacity)
            nextAvailableSpot = 0;
        if (nextAvailableSpot == firstInQueue){
            System.out.println("The stack is now full, if you add another number, you will overwrite the first one in the queue");
        }
    }

    public int remove(){
        if(queueIsEmpty)
            return 0;

        int temp = array[firstInQueue];
        array[firstInQueue] = 0;
        firstInQueue++;

        if (firstInQueue == capacity)
            firstInQueue = 0;
        if (nextAvailableSpot == firstInQueue)
            queueIsEmpty = true;

        return temp;

    }
}
