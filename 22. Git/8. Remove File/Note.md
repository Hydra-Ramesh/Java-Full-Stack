
---

## 📌 **What is `git rm`?**
- `git rm` is used to **remove files** from:
  - The **working directory** (your folder)
  - The **staging area** (index)
- The removal is **tracked by Git** and will be recorded in the next commit.

---

## 📥 **Basic Syntax:**
```bash
git rm <file-name>
```

---

## 🔎 **Example:**
```bash
git rm index.html
git commit -m "Removed index.html"
```
✅ Result: `index.html` is deleted from your project **and** Git tracks this change.

---

## ✅ **Common Use Cases:**

### 1️⃣ **Remove a File from the Project and Stage the Deletion:**
```bash
git rm style.css
```
👉 Deletes the file from your folder and stages the deletion.

---

### 2️⃣ **Remove the File from Git Only (Keep Locally):**
If you want to stop tracking the file but **keep it in your folder**:
```bash
git rm --cached secrets.txt
```
✅ Useful for removing sensitive files accidentally added.

---

### 3️⃣ **Remove Multiple Files:**
```bash
git rm file1.txt file2.txt
```

---

## ⚠️ **Important Notes:**
- After `git rm`, run `git commit` to finalize the file removal in the repo history.
- `git rm` **only works on tracked files**. For untracked files, just delete manually.

---

## ✅ **Summary Table:**

| Command                      | Action                                 |
|----------------------------- |----------------------------------------|
| `git rm <file>`              | Removes the file from folder & stages deletion |
| `git rm --cached <file>`     | Removes the file from Git only, keeps it locally |
| `git commit -m "Removed file"` | Finalizes the file removal in Git history |

---