class CircularQueue {
    private int[] arr;
    private int front, rear, size, capacity;

    // Constructor to initialize the circular queue
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = rear = -1;
        size = 0;
    }

    // Enqueue operation (adds an element to the queue)
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Circular Queue Overflow! Cannot enqueue " + value);
            return;
        }
        if (isEmpty()) front = 0;
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
    }

    // Dequeue operation (removes and returns the front element)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Circular Queue Underflow! Cannot dequeue.");
            return -1;
        }
        int value = arr[front];
        front = (front + 1) % capacity;
        size--;
        if (size == 0) front = rear = -1; // Reset when empty
        return value;
    }

    // Peek operation (returns the front element without removing it)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Circular Queue is empty!");
            return -1;
        }
        return arr[front];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Display the circular queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Circular Queue is empty!");
            return;
        }
        System.out.print("Circular Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    // Main method to test the Circular Queue
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        System.out.println("After enqueue operations:");
        cq.display();

        System.out.println("Front element: " + cq.peek());

        System.out.println("Dequeued element: " + cq.dequeue());
        cq.display();

        System.out.println("Dequeued element: " + cq.dequeue());
        cq.display();

        System.out.println("Dequeued element: " + cq.dequeue());
        cq.display();

        System.out.println("Is circular queue empty? " + cq.isEmpty());

        // Testing wrap-around condition
        cq.enqueue(40);
        cq.enqueue(50);
        cq.enqueue(60);
        cq.enqueue(70);
        cq.enqueue(80);
        System.out.println("After adding elements to the circular queue:");
        cq.display();

        System.out.println("Dequeued element: " + cq.dequeue());
        System.out.println("Dequeued element: " + cq.dequeue());
        cq.display();
    }
}
