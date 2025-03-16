### **Class and Object Theory in Java**
In Java, **classes and objects** are fundamental concepts of **Object-Oriented Programming (OOP)**. They help in designing and structuring programs in a modular and reusable way.

---

## **1. What is a Class in Java?**
A **class** is a blueprint or template that defines the structure and behavior (properties and methods) of objects.

- It defines **attributes (fields/variables)** and **behaviors (methods)**.
- Objects are created based on a class.
- A class does not consume memory until an object is created.

### **Example of a Class:**
```java
class Car {
    // Attributes (fields)
    String brand;
    int speed;

    // Behavior (method)
    void showDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}
```

---

## **2. What is an Object in Java?**
An **object** is an instance of a class. It has a **state (data) and behavior (methods)**.

- When an object is created, memory is allocated for it.
- Multiple objects of the same class can exist.

### **Creating an Object**
To create an object in Java, use the `new` keyword.

```java
public class Main {
    public static void main(String[] args) {
        // Creating an object of Car
        Car myCar = new Car();

        // Assigning values to object properties
        myCar.brand = "Tesla";
        myCar.speed = 200;

        // Calling object method
        myCar.showDetails();
    }
}
```

### **Output:**
```
Car Brand: Tesla
Speed: 200 km/h
```

---

## **3. Class vs Object - Key Differences**
| Feature  | Class | Object |
|----------|--------------------------|--------------------------|
| Definition | Blueprint or template for objects | Instance of a class |
| Memory Allocation | No memory allocated until an object is created | Memory is allocated when an object is instantiated |
| Usage | Defines properties and methods | Can use properties and methods of the class |
| Example | `class Car {}` | `Car myCar = new Car();` |

---

## **4. Real-Life Analogy**
- **Class**: A **Car blueprint** that describes what a car is.
- **Object**: A **Tesla Model S**, which is an actual car based on that blueprint.

---

## **5. Constructors in Java**
A **constructor** is a special method used to initialize objects when they are created.

### **Example of Constructor:**
```java
class Car {
    String brand;
    int speed;

    // Constructor
    Car(String b, int s) {
        brand = b;
        speed = s;
    }

    void showDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects using the constructor
        Car car1 = new Car("BMW", 220);
        Car car2 = new Car("Audi", 240);

        car1.showDetails();
        car2.showDetails();
    }
}
```

### **Output:**
```
Car Brand: BMW
Speed: 220 km/h
Car Brand: Audi
Speed: 240 km/h
```

---

## **6. Important OOP Concepts Related to Classes & Objects**
1. **Encapsulation** – Wrapping data and methods into a single unit (class).
2. **Inheritance** – A child class can inherit properties/methods from a parent class.
3. **Polymorphism** – Ability to take multiple forms (method overloading & overriding).
4. **Abstraction** – Hiding implementation details and exposing only necessary information.
