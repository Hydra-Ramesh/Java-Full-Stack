import java.util.ArrayList;

// Custom Student class
class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Custom Employee class
class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Demo {

    public static void main(String[] args) {
        // Example 1: Generics with Collection - String Type
        ArrayList<String> nameList = new ArrayList<>();  // Using Diamond Operator (<>)
        nameList.add("Rohan");
        nameList.add("Rahul");
        nameList.add("Remi");
        // nameList.add(10);  // ❌ Compile-time error if uncommented

        // Accessing elements without type casting
        for (String name : nameList) {
            System.out.println(name.toUpperCase());  // Printing in uppercase
        }

        System.out.println("-----------------------------");

        // Example 2: Generics with Custom Class - Student
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Rohan"));
        studentList.add(new Student(2, "Aarav"));
        // studentList.add(new Employee(1, "Harsh")); // ❌ Compile-time error: Employee is not a Student

        // Printing student names
        for (Student st : studentList) {
            System.out.println("Student Name: " + st.getName());
        }

        System.out.println("-----------------------------");

        // Example 3: Non-Generic Collection (Not Recommended)
        ArrayList nonGenericList = new ArrayList(); // Raw type, no type safety
        nonGenericList.add(10);
        nonGenericList.add("Shami");
        nonGenericList.add(9822244441111L);

        for (Object obj : nonGenericList) {
            System.out.println("Non-Generic List Item: " + obj);
        }

        System.out.println("-----------------------------");

        // Example 4: Generics with Integer Type
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        // intList.add("String"); // ❌ Compile-time error

        for (Integer num : intList) {
            System.out.println("Integer Value: " + num);
        }

        // Note: Generics do not support primitive types directly (int, char), use wrapper classes instead
        // ArrayList<int> primitiveList = new ArrayList<>(); // ❌ Not allowed
    }
}
