Here’s your **8.3 - Access Modifiers Summary (Formatted for Notes/Study Material):**

---

## **Access Modifiers in Java**
Access Modifiers define the accessibility (visibility scope) of classes, methods, variables, and constructors. They enforce **encapsulation**, enhance **security**, and control **data access**.

### **Types of Access Modifiers**
| Modifier  | Same Class | Same Package | Subclass (Same/Different Package) | Different Package |
|----------|-----------|-------------|-----------------------------------|-------------------|
| **private** | ✅ Yes | ❌ No | ❌ No | ❌ No |
| **default (no modifier)** | ✅ Yes | ✅ Yes | ✅ Yes (if in same package) | ❌ No |
| **protected** | ✅ Yes | ✅ Yes | ✅ Yes | ❌ No (unless subclass) |
| **public** | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes |

---

## **1. Private Access Modifier**
- Accessible **only** within the class.
- Cannot be accessed by any other class.

### **Example:**
```java
package other;
public class A {
    private int marks = 6;
    private void displayMarks() {
        System.out.println("Marks: " + marks);
    }
    public void show() {
        displayMarks();
    }
}
```
```java
public class Demo {
    public static void main(String[] args) {
        other.A obj = new other.A();
        obj.show();  // Works
        // obj.marks; // Error: private
        // obj.displayMarks(); // Error: private
    }
}
```
✅ **Output:** `Marks: 6`

---

## **2. Default (Package-Private) Access Modifier**
- Accessible within the **same package**.
- Not accessible from **other packages**.

### **Example:**
```java
package other;
public class A {
    int marks = 6;
    void displayMarks() {
        System.out.println("Marks: " + marks);
    }
}
```
```java
package other;
public class B {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.marks); // Works
        obj.displayMarks(); // Works
    }
}
```
```java
public class Demo {
    public static void main(String[] args) {
        other.A obj = new other.A();
        // obj.marks; // Error
        // obj.displayMarks(); // Error
    }
}
```
✅ **Output in B:** `Marks: 6`

---

## **3. Protected Access Modifier**
- Accessible within the package.
- Accessible outside the package **only by subclassing**.

### **Example:**
```java
package other;
public class A {
    protected int marks = 6;
    protected void displayMarks() {
        System.out.println("Marks: " + marks);
    }
}
```
```java
package otherPackage;
import other.A;
public class C extends A {
    public void showMarks() {
        System.out.println(marks); 
        displayMarks(); 
    }
}
```
```java
public class Demo {
    public static void main(String[] args) {
        otherPackage.C obj = new otherPackage.C();
        obj.showMarks(); // Works

        other.A obj2 = new other.A();
        // obj2.marks; // Error
        // obj2.displayMarks(); // Error
    }
}
```
✅ **Output:**  
```
Marks: 6
Marks: 6
```

---

## **4. Public Access Modifier**
- Accessible **everywhere**.

### **Example:**
```java
package other;
public class A {
    public int marks = 6;
    public void displayMarks() {
        System.out.println("Marks: " + marks);
    }
}
```
```java
public class Demo {
    public static void main(String[] args) {
        other.A obj = new other.A();
        System.out.println(obj.marks); // Works
        obj.displayMarks(); // Works
    }
}
```
✅ **Output:**
```
Marks: 6
Marks: 6
```

---

## **Key Points Summary:**
- **private**: Accessible only within the class.
- **default (package-private)**: Accessible within the same package.
- **protected**: Accessible within the same package and outside package **only by subclass**.
- **public**: Accessible from **anywhere**.

---

## **FAQs on Access Modifiers**
**1. What are access modifiers in Java?**  
Keywords that control visibility and access of classes, methods, and variables.

**2. Can a private method be overridden?**  
No. Private methods are not inherited, so they cannot be overridden.

**3. Difference between protected and default?**  
- `protected`: visible in package + subclasses (even outside package).
- `default`: visible only in the same package.

**4. Can we have a private constructor in Java?**  
Yes, used to prevent object creation (e.g., Singleton pattern).

---