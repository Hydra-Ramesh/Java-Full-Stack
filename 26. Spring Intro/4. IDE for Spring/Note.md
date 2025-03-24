
---

## 💻 **Setting Up IDEs for Spring Development**

### 🔧 **1. JDK Installation (Mandatory)**
- Install **Java Development Kit (JDK)** (Version 17+ recommended).
- Download from: [Oracle JDK](https://www.oracle.com/java/technologies/downloads/)
- Verify installation:
```bash
java -version
```

---

### 💻 **2. Popular IDE Options for Spring Development**
| IDE                | Notes                                                             |
|--------------------|-------------------------------------------------------------------|
| **Visual Studio Code (VS Code)** | Lightweight with Java & Spring extensions |
| **IntelliJ IDEA (Community Edition - Free)** | Advanced features, popular for Java |
| **Spring Tool Suite (STS)** | Eclipse-based, pre-configured for Spring |
| **Eclipse IDE**    | Classic Java IDE, extendable with Spring tools |

---

## 🚀 **3. Setting Up Spring in Different IDEs**

---

### ✅ **a) Visual Studio Code (VS Code)**
1. Install **VS Code** → [Download Here](https://code.visualstudio.com/)
2. Install **Java Extension Pack**:
   - Extensions > Search `Java Extension Pack` > Install
   - Adds support for Java, Maven, Debugging, Spring Boot
3. Install **Spring Boot Extension Pack**
4. **Create a Spring Boot Project**:
   - Press `Ctrl + Shift + P`
   - Select `Spring Initializr: Generate a Maven Project`
   - Choose project settings (Group, Artifact, Dependencies, Java version)

---

### ✅ **b) IntelliJ IDEA (Community Edition - Free)**
1. Download and install **IntelliJ IDEA** → [Download Here](https://www.jetbrains.com/idea/)
2. **Create a Spring Boot Project**:
   - Go to `File > New > Project`
   - Select **Spring Initializr**
   - Configure project settings and dependencies
3. **Optional**: Install Spring plugins if missing:
   - `File > Settings > Plugins`
   - Search `Spring Boot` > Install
4. **Run** the project by clicking the green `Run` button.

---

### ✅ **c) Spring Tool Suite (STS)**
1. Download and install **STS** → [Download Here](https://spring.io/tools)
2. **Create a Spring Boot Project**:
   - `File > New > Spring Starter Project`
   - Use the wizard to select dependencies
3. Install additional plugins via **Eclipse Marketplace** (for testing, ORM, etc.)

---

### ✅ **d) Eclipse IDE**
1. Install **Eclipse IDE** → [Download Here](https://www.eclipse.org/downloads/)
2. Add **Spring Tools Support**:
   - `Help > Eclipse Marketplace`
   - Search `Spring Tools (STS)` → Install
3. **Create a Spring Boot Project**:
   - `File > New > Spring Starter Project`
   - Configure dependencies and project details

---

## 📂 **4. General Steps to Start a Spring Project (Any IDE)**
1. **Generate Project** using [Spring Initializr](https://start.spring.io/) (or built-in IDE wizard)
   - Choose: `Spring Web`, `Spring Data JPA`, `Thymeleaf`, `Spring Security`, etc.
2. **Import Project**:
   - **Eclipse/STS**: `File > Import > Existing Maven Project`
   - **IntelliJ**: Open project as Maven/Gradle project
3. **Run the Project**:
   - **Eclipse/STS**: `Right-click > Run As > Spring Boot App`
   - **IntelliJ**: Click **Run** button on the toolbar

---

## ✅ **5. Recommended**
- **Maven / Gradle** setup for dependency management
- **Git integration** for version control
- **Postman / REST Client** for API testing
- **Database connection setup** (MySQL/PostgreSQL)

---

💡 **Pro Tip:** Start simple — build a Spring Boot app with just `Spring Web`. Once comfortable, explore JPA, Security, and REST APIs.

---