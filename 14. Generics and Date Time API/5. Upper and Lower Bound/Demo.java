import java.util.*;

// Base class
class Human {
    public void sleep() {
        System.out.println("Humans need to sleep well...");
    }
}

// Subclass
class Employee extends Human {
    @Override
    public void sleep() {
        System.out.println("Employees need to sleep well to stay productive...");
    }
}

public class Demo {

    // Method with Upper Bound - accepts Human or any subclass
    public static void invokeSleep(List<? extends Human> list) {
        System.out.println("\n--- Upper Bound Method Called ---");
        for (Human human : list) {
            human.sleep(); // Safe: 'human' is at least a Human
        }
    }

    // Method with Lower Bound - accepts Human or any superclass
    public static void addHuman(List<? super Human> list) {
        System.out.println("\n--- Lower Bound Method Called ---");
        list.add(new Human());   // Allowed
        list.add(new Employee()); // Allowed (Employee extends Human)
        System.out.println("Added Human and Employee objects.");
    }

    public static void main(String[] args) {

        // Create lists
        ArrayList<Human> humanList = new ArrayList<>();
        ArrayList<Employee> empList = new ArrayList<>();
        ArrayList<Object> objList = new ArrayList<>();

        // Add objects to lists
        humanList.add(new Human());
        empList.add(new Employee());

        // --------- Upper Bound Usage ---------
        invokeSleep(humanList);  // Valid
        invokeSleep(empList);    // Valid because Employee extends Human

        // --------- Lower Bound Usage ---------
        addHuman(objList);       // Valid because Object is superclass of Human
        addHuman(humanList);     // Valid because Human is Human

        // ❌ Not valid (uncommenting below line will cause compile error)
        // addHuman(empList);   // Invalid because Employee is not superclass of Human
    }
}
