
---

## 🌟 **Inversion of Control (IoC)**
### **Definition:**
Inversion of Control (IoC) is a design principle where the control of object creation, configuration, and management is handed over from the application code to a container or framework (like **Spring**). This allows developers to focus solely on writing business logic while the framework handles the object's lifecycle and dependencies.

### **Example with `Laptop` and `Alien` Classes:**
- Without IoC, the **Alien** class creates its own `Laptop` object:
```java
public class Alien {
    Laptop laptop = new Laptop();  // Alien is responsible for creating Laptop

    public void code() {
        laptop.compile();
    }
}
```
This is **tightly coupled** — changes in `Laptop` would require changing `Alien`.

- **With IoC (Spring Framework):**
```java
@Component
public class Alien {
    @Autowired
    Laptop laptop;  // Alien is no longer responsible for creating Laptop

    public void code() {
        laptop.compile();
    }
}
```
Here, the **Spring container controls** the creation of the `Laptop` object and injects it into the `Alien`. This is **IoC in action** — the control is inverted from the developer to the framework.

---

## 🌟 **Dependency Injection (DI)**
### **Definition:**
Dependency Injection is a specific way of achieving IoC. It means **injecting dependent objects** (dependencies) from outside the class instead of the class creating them itself. This promotes **loose coupling**, better testability, and easier maintenance.

### **Types of Dependency Injection in Spring:**
1. **Constructor Injection**
2. **Setter Injection**
3. **Field Injection (shown in the example with `@Autowired`)**

---

### **Example with `Laptop` and `Alien`:**
```java
@Component
public class Laptop {
    public void compile() {
        System.out.println("Compiling...");
    }
}

@Component
public class Alien {
    @Autowired
    Laptop laptop;  // Dependency Injection happens here

    public void code() {
        laptop.compile();  // Alien uses Laptop without creating it
    }
}
```
✅ **Spring automatically injects the Laptop instance into Alien.**  
✅ **Alien doesn't know how Laptop is created.** It just uses it — leading to better modularity and easier testing.

---

## ✅ **Summary (Clarified for better understanding):**
| Concept            | Description |
|--------------------|------------|
| **IoC (Inversion of Control)** | A principle where the framework controls object creation, configuration, and lifecycle instead of the application code. |
| **DI (Dependency Injection)** | A design pattern and specific implementation of IoC where dependencies are **injected** into a class by the framework rather than being created inside the class. |

💡 **Key takeaway:**  
`Alien` **needs** a `Laptop`, but it doesn’t **create** a `Laptop`. Instead, **Spring provides (injects)** the `Laptop` when `Alien` is created — **that's Dependency Injection, fulfilling the IoC principle.**

---