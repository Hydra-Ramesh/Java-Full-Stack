
---

# ✅ **Git Commands - `status`, `add`, `commit`, `log`**

---

## 📌 **1. `git status`**
### ➤ **Definition:**  
Shows the current status of the working directory and staging area. Helps you see:
- Which files are **modified**
- Which files are **staged** for commit
- Which files are **untracked**

### ➤ **Syntax:**  
```bash
git status
```

### ➤ **Example Output:**
```
On branch main
Changes not staged for commit:
  modified: index.html
Untracked files:
  style.css
```

---

## 📌 **2. `git add`**
### ➤ **Definition:**  
Adds changes (new or modified files) to the **staging area** in preparation for a commit.

### ➤ **Syntax:**  
```bash
git add <file-name>      # Add a specific file
git add .                # Add all changes in the directory
```

### ➤ **Example:**
```bash
git add index.html
git add .   # Adds everything
```

---

## 📌 **3. `git commit`**
### ➤ **Definition:**  
Records the staged changes in the local repository history with a **commit message**.

### ➤ **Syntax:**  
```bash
git commit -m "Your commit message"
```

### ➤ **Example:**
```bash
git commit -m "Added homepage layout"
```

✅ **Result:**  
Saves the current state of the project with your message.

---

## 📌 **4. `git log`**
### ➤ **Definition:**  
Shows the history of commits made in the repository (author, date, message, commit hash).

### ➤ **Syntax:**  
```bash
git log
```

### ➤ **Example Output:**
```
commit 9a0efcb891f74f2346c9b879a3eec3aa5ac76b5e
Author: Your Name <you@example.com>
Date:   Mon Mar 25 12:34:56 2024 +0530

    Added homepage layout
```

✅ Use `q` to quit the log view.

---

## ✅ **Flow Summary:**
| Step | Command | Purpose |
|----- |-------- |-------- |
| 1️⃣ | `git status` | Check file changes |
| 2️⃣ | `git add .` or `git add <file>` | Stage changes |
| 3️⃣ | `git commit -m "Message"` | Save changes |
| 4️⃣ | `git log` | View commit history |

---
