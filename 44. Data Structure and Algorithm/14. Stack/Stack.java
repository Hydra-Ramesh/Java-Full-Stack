class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1; // Stack is initially empty
    }

    // Push operation (adds element to the top)
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        arr[++top] = value;
    }

    // Pop operation (removes and returns the top element)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop from an empty stack.");
            return -1;
        }
        return arr[top--];
    }

    // Top operation (returns the top element without removing it)
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return arr[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Display the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the Stack
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("After pushing elements:");
        stack.display();

        System.out.println("Top element: " + stack.top());

        System.out.println("Popped element: " + stack.pop());
        stack.display();

        System.out.println("Popped element: " + stack.pop());
        stack.display();

        System.out.println("Popped element: " + stack.pop());
        stack.display();

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
