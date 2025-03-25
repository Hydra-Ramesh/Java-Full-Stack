
---

# ✅ **Git diff Command**

## 📌 **What is `git diff`?**
- `git diff` shows the **differences (changes)** between:
  - Your **working directory** and the **staging area**
  - The **staging area** and the **last commit**
  - Two **commits**

It helps you review **what has changed** before committing.

---

## 📥 **Basic Syntax:**
```bash
git diff
```

---

## 🔎 **Use Cases and Examples:**

### ✅ **1. See Changes Not Staged Yet**
Shows the difference between **working directory** and **staging area**:
```bash
git diff
```

### ✅ **2. See Staged Changes Ready to Commit**
Shows the difference between **staging area** and **last commit**:
```bash
git diff --cached
```
or
```bash
git diff --staged
```

### ✅ **3. Compare Two Commits**
Shows the difference between two specific commits:
```bash
git diff <commit1> <commit2>
```

### ✅ **4. See Difference in a Specific File**
```bash
git diff index.html
```

---

## 📂 **Sample Output:**
```diff
- This line was removed
+ This line was added
```
✅ `-` = deleted  
✅ `+` = added

---

## 📌 **Why Use `git diff`?**
- To review changes **before adding or committing**
- To debug or inspect **what exactly changed**
- To check the difference between **versions**

---

## ✅ **Summary Table:**

| Command                       | Description                                       |
|------------------------------ |---------------------------------------------------|
| `git diff`                    | Changes not staged for commit                    |
| `git diff --staged`           | Staged changes ready to commit                   |
| `git diff <commit1> <commit2>`| Compare two commits                              |
| `git diff <file>`             | Difference in a specific file                    |

---
