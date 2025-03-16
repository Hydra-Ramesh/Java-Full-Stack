### **JDK, JRE, and JVM in the Context of OOPs**  

When working with **Object-Oriented Programming (OOP) in Java**, the **JDK (Java Development Kit), JRE (Java Runtime Environment), and JVM (Java Virtual Machine)** play crucial roles in **compiling, running, and executing Java programs**.  

---

## **1. JVM (Java Virtual Machine)**
The **JVM** is the heart of Java’s platform independence and execution model. It provides the environment to **execute Java bytecode**.

### **Role in OOPs:**
- **Encapsulation**: JVM enforces access control (private, protected, etc.).
- **Inheritance & Polymorphism**: JVM handles method calls dynamically using method dispatch.
- **Abstraction**: JVM hides the internal memory management from developers.

### **JVM Workflow:**
1. Java code (`.java` file) → Compiled by **Javac** → Generates **bytecode (`.class` file)**.
2. Bytecode is loaded and executed by JVM.
3. JVM performs **Just-In-Time (JIT) Compilation** to optimize execution.

### **Example:**
```java
class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, JVM!");
    }
}
```
🔹 The JVM **loads, verifies, and executes** this program.

---

## **2. JRE (Java Runtime Environment)**
The **JRE** provides the necessary environment to run Java programs.

### **Role in OOPs:**
- It **executes Java bytecode** by interacting with JVM.
- Supports **OOP principles like encapsulation, polymorphism, and inheritance** by ensuring Java classes execute correctly.

### **JRE Includes:**
✅ JVM  
✅ Java Libraries (Collections, IO, Multithreading, etc.)  
✅ Runtime libraries (`rt.jar`)  

🚀 **If you only want to run Java programs (not develop them), JRE is enough!**  

---

## **3. JDK (Java Development Kit)**
The **JDK** is the complete package required for **Java development**.

### **Role in OOPs:**
- **Encapsulation**: JDK provides the Java API to encapsulate data in classes.
- **Inheritance & Polymorphism**: Allows writing modular, reusable Java applications.
- **Abstraction**: Provides high-level APIs to interact with system resources.

### **JDK Includes:**
✅ JRE  
✅ Compiler (`javac`)  
✅ Debuggers  
✅ Development tools (Javadoc, Jar tool, etc.)  

🔹 **If you are developing Java applications, you need the JDK.**

---

## **4. Key Differences:**
| Feature  | JDK (Java Development Kit) | JRE (Java Runtime Environment) | JVM (Java Virtual Machine) |
|----------|----------------------------|--------------------------------|----------------------------|
| Purpose  | Develop & Run Java Programs | Run Java Programs | Executes Java Bytecode |
| Includes | JRE + Compiler, Debugger | JVM + Libraries | Just the runtime engine |
| Needed for | Java Development | Running Java Apps | Running Bytecode |

---

## **5. How They Work Together in OOPs?**
1. **Write Java Code** (`.java`) → Encapsulate & Design with OOP  
2. **Compile it using JDK** (`javac`) → Generates `.class` bytecode  
3. **JRE loads and runs it using JVM** → Handles memory, garbage collection, method calls  

---