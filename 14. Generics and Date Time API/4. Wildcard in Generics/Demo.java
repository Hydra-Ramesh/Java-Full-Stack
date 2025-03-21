import java.util.ArrayList;

// Base class
class Human {
    public void sleep() {
        System.out.println("Humans need to sleep well...");
    }
}

// Subclass of Human
class Employee extends Human {
    @Override
    public void sleep() {
        System.out.println("Employees need to sleep well to stay productive...");
    }
}

public class Demo {
    
    // Method to process a list of unknown types (Wildcard)
    public static void processList(ArrayList<?> list) {
        System.out.println("Processing a list of unknown type. List size: " + list.size());
    }

    // Method to process list with upper bound wildcard
    public static void processHumanList(ArrayList<? extends Human> list) {
        System.out.println("Processing Human or its subclass:");
        for (Human h : list) {
            h.sleep(); // Safe because we know it is Human or its subclass
        }
    }

    public static void main(String[] args) {
        // Creating Human and Employee objects
        Human human = new Human();
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        // ArrayList of Human
        ArrayList<Human> humanList = new ArrayList<>();
        humanList.add(human);

        // ArrayList of Employee
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);

        // Example of polymorphism
        human = emp1; // Valid - Employee is a Human
        human.sleep();

        // Trying to assign empList to humanList directly (Not Allowed)
        // humanList = empList; // ❌ Compile-time Error

        // Example of wildcard usage
        ArrayList<?> unknownList = new ArrayList<>();
        unknownList = empList; // ✅ Valid with wildcard
        processList(unknownList);

        // Example of upper bounded wildcard
        processHumanList(humanList);
        processHumanList(empList); // ✅ Accepts subclass collection too

        // Note: We cannot add elements to unknownList (except null)
        // unknownList.add(emp1); // ❌ Compile-time Error
    }
}
