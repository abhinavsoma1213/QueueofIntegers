public class TestingQueueOfIntegers {

    public static void main(String[] args) {
        QueueOfIntegers queue = new QueueOfIntegers();
        for(int i = 0; i < 10; i++) {
            queue.enqueue(i);

        }
        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();

    }

}




    
