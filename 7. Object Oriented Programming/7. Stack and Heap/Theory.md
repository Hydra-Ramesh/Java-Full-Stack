### **Stack and Heap Memory in Function/Method Execution**  

When a function (method) is executed in Java, the **JVM (Java Virtual Machine)** uses **Stack and Heap Memory** to manage variables, method calls, and objects efficiently.

---

## **1. How Method Execution Works in Stack and Heap?**
- When a **method is called**, a **stack frame** is created in **Stack Memory**.
- **Local variables and method parameters** are stored in **Stack**.
- **Objects** created inside the method are stored in **Heap**, and their **references** are stored in **Stack**.
- When a method finishes execution, its **stack frame is removed**.
- If an object has no more references, it becomes eligible for **Garbage Collection**.

---

## **2. Example: Method Execution in Stack and Heap**
```java
class Person {
    String name; // Stored in Heap

    // Constructor
    Person(String name) {
        this.name = name;
    }
}

public class MemoryExample {
    static void createPerson() {
        int age = 25; // Stored in Stack
        Person p = new Person("John"); // Object in Heap, reference in Stack
    }

    public static void main(String[] args) {
        createPerson(); // Method call -> New Stack Frame created
    }
}
```
---

## **3. Step-by-Step Execution in Stack and Heap**
### **Step 1: `main()` method starts**
- A **stack frame for `main()`** is created in **Stack**.
- It calls `createPerson()`, so a new **stack frame for `createPerson()`** is created.

### **Step 2: `createPerson()` executes**
- `int age = 25;` → `age` is stored in Stack.
- `Person p = new Person("John");`
  - A **new object** (`Person` with `"John"`) is created in **Heap**.
  - The **reference (`p`) is stored in Stack**.

### **Step 3: `createPerson()` method finishes**
- `createPerson()`'s stack frame is **removed** (cleared from Stack).
- The `p` reference is **lost**.
- If no other references exist, the `Person` object in **Heap** is **garbage collected**.

### **Step 4: `main()` method finishes**
- `main()`'s stack frame is removed.
- Program execution completes.

---

## **4. Stack vs Heap in Method Execution**
| Feature | Stack Memory | Heap Memory |
|---------|-------------|-------------|
| Stores | Method calls, local variables, parameters | Objects, instance variables |
| Access Speed | Fast | Slower |
| Lifetime | Exists only during method execution | Exists until GC removes it |
| Clean-up | Removed automatically when method exits | Cleaned by **Garbage Collector** |
| Example | `int x = 10;` (stored in Stack) | `new Car("BMW");` (object stored in Heap) |

---

## **5. Example: Method Calling Chain in Stack**
```java
public class StackExample {
    static void methodA() {
        int a = 5; // Stored in Stack
        methodB(); // Calls methodB -> New stack frame
    }

    static void methodB() {
        int b = 10; // Stored in Stack
        System.out.println("Inside methodB");
    }

    public static void main(String[] args) {
        methodA(); // Calls methodA -> Stack frame created
    }
}
```
### **Execution in Stack Memory:**
1️⃣ **`main()` starts** → Stack frame for `main()`.  
2️⃣ **`methodA()` is called** → Stack frame for `methodA()`.  
3️⃣ **`methodB()` is called** → Stack frame for `methodB()`.  
4️⃣ **`methodB()` finishes** → Stack frame for `methodB()` is removed.  
5️⃣ **`methodA()` finishes** → Stack frame for `methodA()` is removed.  
6️⃣ **`main()` finishes** → Stack frame for `main()` is removed.  

### **Stack Frame Execution Order (LIFO - Last In, First Out)**
```
| methodB() |  <-- Last (removed first)
| methodA() |
| main()    |  <-- First (removed last)
```
✔ **Each method gets its own stack frame and is removed after execution!**  

---

## **6. Common Errors in Stack and Heap**
### **🔴 StackOverflowError (Infinite Recursion)**
Happens when too many method calls are stored in the Stack, exceeding its limit.
```java
public class StackOverflowExample {
    static void recursiveMethod() {
        recursiveMethod(); // Calls itself infinitely
    }

    public static void main(String[] args) {
        recursiveMethod(); // StackOverflowError
    }
}
```
🛑 **Fix:** Add a **base condition** to stop recursion.

---

### **🔴 OutOfMemoryError (Heap Memory Full)**
Happens when too many objects are created in Heap without being garbage collected.
```java
import java.util.ArrayList;
import java.util.List;

public class HeapErrorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        while (true) {
            list.add("Memory Leak!"); // Keeps adding to Heap
        }
    }
}
```
🛑 **Fix:** Release unused objects, use **Garbage Collection**.

---

## **7. Summary: Stack and Heap in Method Execution**
| Aspect | Stack Memory (Method Calls) | Heap Memory (Objects) |
|--------|-----------------------------|-----------------------|
| Stores | Method calls, local variables | Objects, instance variables |
| Lifetime | Removed when method exits | Exists until GC removes it |
| Example | `int x = 5;` | `new Car("Tesla");` |
| Cleanup | Auto-cleared when method ends | Garbage Collected |

---