public class DynamicArrayQueue {
    private int[] array;
    public int capacity = 10;
    private int firstInQueue;
    private int nextAvailableSpot;
    private boolean queueIsEmpty;

    public DynamicArrayQueue(){
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
            int[] newArray = new int[capacity*2];
            for (int i = 0; i < capacity; i++){
                newArray[i] = array[firstInQueue++];
                if (firstInQueue == capacity)
                    firstInQueue = 0;
            }
            firstInQueue = 0;
            nextAvailableSpot = capacity;
            capacity = capacity * 2;
            array = newArray;
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

