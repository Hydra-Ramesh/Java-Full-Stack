### **Java Naming Conventions** 🚀  
In Java, naming conventions are **best practices** used to make code **readable, maintainable, and consistent**. They help developers quickly understand the purpose of variables, classes, methods, and other elements in the code.  

---

## **1. Naming Conventions for Different Java Elements**
| **Element**      | **Convention** | **Example** |
|-----------------|--------------|------------|
| **Classes**     | PascalCase (Starts with uppercase, no underscores) | `Car`, `EmployeeDetails` |
| **Interfaces**  | PascalCase (Same as classes, often adjectives) | `Runnable`, `Serializable` |
| **Methods**     | camelCase (Starts with lowercase, verbs preferred) | `getName()`, `calculateSalary()` |
| **Variables**   | camelCase (Descriptive, starts with lowercase) | `studentName`, `totalMarks` |
| **Constants**   | UPPER_CASE (Words separated by `_`) | `PI`, `MAX_VALUE` |
| **Packages**    | lowercase (Reverse domain format) | `com.company.project` |
| **Enum Names**  | PascalCase (Singular, descriptive) | `Status`, `Color` |
| **Enum Constants** | UPPER_CASE (All caps) | `RED`, `COMPLETED` |
| **Generic Type Parameters** | Single uppercase letter (T, E, K, V) | `List<T>`, `Map<K, V>` |

---

## **2. Class Naming Convention**
🔹 A **class name** should be a **noun** and follow **PascalCase**.  
🔹 It should be **descriptive** and **avoid abbreviations**.  

✅ **Good Examples:**
```java
class Employee { }
class CarDetails { }
class BankAccount { }
```
❌ **Bad Examples:**
```java
class emp { }      // Not descriptive
class car_details { } // Uses underscores (not standard)
class BANKACCOUNT { } // Shouldn't be all caps
```

---

## **3. Method Naming Convention**
🔹 A **method name** should be a **verb** and follow **camelCase**.  
🔹 It should clearly indicate what the method **does**.  

✅ **Good Examples:**
```java
void getSalary() { }
void calculateInterest() { }
boolean isEligible() { }
```
❌ **Bad Examples:**
```java
void GetSalary() { } // Should start with lowercase
void calcint() { } // Not descriptive
void is_eligible() { } // Underscore not recommended
```

---

## **4. Variable Naming Convention**
🔹 Variables should use **camelCase**.  
🔹 Names should be **meaningful** and **self-explanatory**.  
🔹 Avoid **single-character names** (except loop counters like `i, j, k`).  

✅ **Good Examples:**
```java
int totalMarks;
String customerName;
double accountBalance;
```
❌ **Bad Examples:**
```java
int tm;  // Not descriptive
String CustName;  // Starts with uppercase
double Account_balance;  // Underscore not recommended
```

---

## **5. Constant Naming Convention**
🔹 Constants should be written in **UPPER_CASE** with words separated by `_`.  
🔹 Use `static final` for constants in Java.  

✅ **Good Examples:**
```java
static final int MAX_VALUE = 100;
static final String APP_NAME = "MyApp";
```
❌ **Bad Examples:**
```java
static final int maxValue = 100;  // Should be UPPER_CASE
static final String AppName = "MyApp";  // Should be UPPER_CASE
```

---

## **6. Interface Naming Convention**
🔹 Interface names should follow **PascalCase**.  
🔹 Usually, they represent a **capability** (e.g., `Runnable`, `Serializable`).  

✅ **Good Examples:**
```java
interface Runnable { }
interface PaymentProcessor { }
```
❌ **Bad Examples:**
```java
interface runnable { } // Should start with uppercase
interface payment_processor { } // Underscore not recommended
```

---

## **7. Package Naming Convention**
🔹 **All lowercase** (to avoid conflicts).  
🔹 Should follow the **reverse domain name** convention (`com.companyname.project`).  

✅ **Good Examples:**
```java
package com.example.app;
package org.apache.utils;
```
❌ **Bad Examples:**
```java
package MyPackage; // Should be lowercase
package com.example_App; // Underscore not recommended
```

---

## **8. Enum Naming Convention**
🔹 **Enum names** should be **PascalCase**.  
🔹 **Enum constants** should be **UPPER_CASE**.  

✅ **Good Examples:**
```java
enum Status { SUCCESS, FAILED, PENDING }
enum Day { MONDAY, TUESDAY, WEDNESDAY }
```
❌ **Bad Examples:**
```java
enum status { success, failed, pending }  // Should be PascalCase and UPPER_CASE
```

---

## **9. Generic Type Naming Convention**
🔹 **Single uppercase letters** are used for generic type parameters in classes and methods.  

✅ **Good Examples:**
```java
class Box<T> { }  // T (Type)
class Map<K, V> { }  // K (Key), V (Value)
```
❌ **Bad Examples:**
```java
class Box<type> { } // Should be a single letter
class Map<Key, Value> { } // Too long, should be K, V
```

---

## **10. Naming Conventions in JavaBeans (Getters & Setters)**
🔹 **Getter methods** → `getVariableName()`.  
🔹 **Setter methods** → `setVariableName(value)`.  
🔹 **Boolean getter methods** → Use `isVariableName()`.  

✅ **Good Examples:**
```java
public class Person {
    private String name;

    public String getName() { // Getter
        return name;
    }

    public void setName(String name) { // Setter
        this.name = name;
    }
}
```
❌ **Bad Examples:**
```java
public class Person {
    private String name;

    public String Name() { return name; }  // Should start with "get"
    public void changeName(String n) { name = n; }  // Should start with "set"
}
```

---

## **11. Summary Table**
| Java Element | Naming Convention | Example |
|-------------|-----------------|---------|
| Class | PascalCase | `BankAccount` |
| Method | camelCase (verb) | `calculateTax()` |
| Variable | camelCase (noun) | `customerAge` |
| Constant | UPPER_CASE | `PI`, `MAX_VALUE` |
| Interface | PascalCase | `Runnable`, `Serializable` |
| Enum | PascalCase | `Status` |
| Enum Constants | UPPER_CASE | `SUCCESS`, `FAILED` |
| Generic Types | Single uppercase letter | `T`, `K`, `V` |
| Package | lowercase | `com.company.project` |
| Getters | getVariableName() | `getName()` |
| Setters | setVariableName(value) | `setAge(25)` |
| Boolean Getters | isVariableName() | `isActive()` |

---