public class QueueOfIntegers {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;

    public QueueOfIntegers() {
        this(DEFAULT_CAPACITY);
    }
    public QueueOfIntegers(int capacity) {
        elements = new int[capacity];

    }
    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }
    public boolean empty() {
        return size == 0;
    }
    public int getSize() {
        return size;
    }
    public int dequeue() {
        int temporary = elements[0];
        for(int i = 0; i < size; i++) {
            elements[i] = elements[i+1];
        }
        size--;

        return temporary;



    }
}