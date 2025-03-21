// Generic Student class with a type parameter T
class Student<T> {
    T obj; // Generic object (Integer, String, Float, etc.)

    // Constructor to initialize the generic object
    public Student(T obj) {
        this.obj = obj;
    }

    // Method to display the type of the data used
    public void display() {
        System.out.println("The type of data used here is: " + obj.getClass().getName());
    }

    // Method to get the value of the object
    public T getObj() {
        return obj;
    }
}

public class Creating {
    // Generic Method Example
    public static <T> void printData(T data) {
        System.out.println("Generic Method Output: " + data);
    }

    public static void main(String[] args) {
        // Creating Student object of type Integer
        Student<Integer> st1 = new Student<>(10);
        st1.display(); // Displaying data type
        System.out.println("Student 1 Data: " + st1.getObj()); // Printing the value

        // Creating Student object of type String
        Student<String> st2 = new Student<>("Rohan");
        st2.display(); // Displaying data type
        System.out.println("Student 2 Data: " + st2.getObj()); // Printing the value

        // Creating Student object of type Double
        Student<Double> st3 = new Student<>(99.99);
        st3.display();
        System.out.println("Student 3 Data: " + st3.getObj());

        // Example of Generic Method usage
        printData("Hello from Generic Method!");
        printData(12345);
        printData(99.99);
    }
}
