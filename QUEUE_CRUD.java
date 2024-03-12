import java.util.LinkedList;

class Queue {
    LinkedList<Integer> queue = new LinkedList<>();

    // Enqueue
    void enqueue(int val) {
        queue.addLast(val);
    }

    // Dequeue
    int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.removeFirst();
    }

    // Peek
    int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.getFirst();
    }

    // Check if queue is empty
    boolean isEmpty() {
        return queue.isEmpty();
    }
}

public class queue_CRUD {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Dequeued element: " + queue.dequeue());

        System.out.println("Front element: " + queue.peek());

        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}
