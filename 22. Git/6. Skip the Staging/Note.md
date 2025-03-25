### ✅ **Git: Skipping the Staging Area**  

By default, Git follows a **two-step process** for saving changes:  
1️⃣ `git add <file>` → Add changes to the **staging area**  
2️⃣ `git commit -m "message"` → Save the staged changes  

However, you can **skip the staging area** and commit changes directly using the `-a` flag.

---

## 🚀 **Skipping the Staging Area Using `git commit -a`**  

```bash
git commit -a -m "Commit message"
```

### 📌 **How It Works:**
- Automatically stages **modified & deleted files** before committing.  
- **New (untracked) files are NOT included**—they still need `git add` first.

---

## 🔎 **Example Usage**  

### 🔹 **Normal Commit (With Staging Area)**
```bash
git add file1.txt
git commit -m "Updated file1"
```

### 🔹 **Skipping Staging Area**
```bash
git commit -a -m "Updated multiple files"
```
✅ **Effect:** All modified & deleted files are staged and committed in one step.

---

## ⚠️ **Important Notes**
- `git commit -a` **does not add new files** (use `git add` first for new files).
- Useful for quick commits when you don’t need to review staged files.

---

## ✅ **Alternative: Using `git commit --amend`**  
If you forgot to stage some changes, you can modify the last commit without creating a new one:
```bash
git commit --amend -m "Updated commit message"
```

---
