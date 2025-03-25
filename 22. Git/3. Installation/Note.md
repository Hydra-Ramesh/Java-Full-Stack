
---

# ✅ **Git Installation and Setup Guide**

---

## 📥 **Step 1: Download Git**
### ➤ For **Windows**:
- Visit: [https://git-scm.com/download/win](https://git-scm.com/download/win)
- Download the latest Git installer.
- Run the installer and follow these steps:
  - Select **default settings** unless you need customization.
  - Recommended to choose **"Git Bash Here"** for easy access from the right-click menu.
  - Choose **"Use Git from the command line and also from 3rd-party software"**.

---

### ➤ For **macOS**:
- Option 1: Install via Homebrew
  ```bash
  brew install git
  ```
- Option 2: Download from [https://git-scm.com/download/mac](https://git-scm.com/download/mac)

---

### ➤ For **Linux (Ubuntu/Debian)**:
```bash
sudo apt update
sudo apt install git
```
For **Fedora/RHEL**:
```bash
sudo dnf install git
```

---

## 📥 **Step 2: Verify Git Installation**
Open **Terminal / Git Bash** and run:
```bash
git --version
```
✅ Example Output:
```
git version 2.43.0
```

---

## ⚙️ **Step 3: Git Initial Setup (Global Configuration)**
Set your **username** and **email** (these will be used in your commits):
```bash
git config --global user.name "Your Name"
git config --global user.email "youremail@example.com"
```

✅ To check your configuration:
```bash
git config --global --list
```
Example Output:
```
user.name=Your Name
user.email=youremail@example.com
```

---

## 📂 **Step 4: Set Default Text Editor (Optional)**
Example for setting **VS Code** as default editor:
```bash
git config --global core.editor "code --wait"
```
Other options: `nano`, `vim`, `notepad`, `sublime`

---

## 🌐 **Step 5: Set Up GitHub/GitLab/Git Remote (Optional)**
Generate SSH Key (for secure connection):
```bash
ssh-keygen -t rsa -b 4096 -C "youremail@example.com"
```
Add the SSH key to your GitHub or GitLab account.

Check added remotes:
```bash
git remote -v
```

---

## ✅ **Basic Git Setup Summary:**
| Command | Purpose |
|-------- |-------- |
| `git config --global user.name "Your Name"` | Set global username |
| `git config --global user.email "your@email.com"` | Set global email |
| `git config --global core.editor "code --wait"` | Set default editor |
| `git config --global --list` | View all global settings |
| `git --version` | Check Git version |

---