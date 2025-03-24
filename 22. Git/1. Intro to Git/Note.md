
---

# 📌 **Git, GitHub, GitLab, GitBucket, DVCS, CVCS, LVCS**

## ✅ **What is Git?**
- **Git** is a **Distributed Version Control System (DVCS)** created by **Linus Torvalds** in **2005**.
- It tracks changes in source code during software development.
- Helps in **collaboration**, **version tracking**, and **backup**.
- Allows multiple people to work on the same project without interfering with each other's work.
- Command-based tool used mostly in the terminal or integrated with IDEs.

---

## ✅ **What is GitHub?**
- **GitHub** is a **web-based hosting platform** for Git repositories.
- Owned by **Microsoft**.
- Provides features like:
  - Pull Requests
  - Issues and bug tracking
  - Collaboration tools
  - GitHub Actions (CI/CD)
- Mostly used for **open-source projects** and **collaborative development**.

---

## ✅ **What is GitLab?**
- **GitLab** is also a **web-based Git repository manager**.
- Provides **CI/CD pipelines**, issue tracking, and DevOps lifecycle tools.
- Can be self-hosted or used on the cloud.
- Competes directly with GitHub but focuses heavily on **DevOps automation**.

---

## ✅ **What is GitBucket?**
- **GitBucket** is an **open-source Git platform** written in **Scala**.
- Provides GitHub-like features and is often **self-hosted**.
- Features include:
  - Git repository hosting
  - Wiki, Issues, Pull Requests
  - Plugin system for additional functionality
- Lightweight and easy to set up for **small teams or organizations**.

---

## ✅ **Version Control System (VCS) Types in Git Context**

### 📌 **1. CVCS - Centralized Version Control System**
- All files and history are stored on a **central server**.
- Example tools: **Apache Subversion (SVN)**, **Perforce**
- **Disadvantages:**
  - Single point of failure
  - Slower access due to dependency on the server

---

### 📌 **2. DVCS - Distributed Version Control System**
- Every developer has the **full history (repository)** of the project on their local machine.
- **Examples:** Git, Mercurial
- **Advantages:**
  - No dependency on the central server
  - Faster operations
  - Work offline easily
  - Better branching and merging

---

### 📌 **3. LVCS - Local Version Control System**
- Version control done **locally** on the developer’s machine.
- **Example:** Simple tools like **RCS**
- **Disadvantages:**
  - No collaboration support
  - No remote backup

---

## ✅ **Summary Table**

| Term       | Description                                             | Example |
|----------- |-------------------------------------------------------- |-------- |
| **Git**    | DVCS tool to track changes and manage code              | Git CLI |
| **GitHub** | Web-based Git repo hosting with collaboration tools     | github.com |
| **GitLab** | Web-based Git repo hosting + DevOps tools               | gitlab.com |
| **GitBucket** | Lightweight, self-hosted GitHub clone in Scala      | gitbucket.github.io |
| **CVCS**   | Centralized version control                             | SVN |
| **DVCS**   | Distributed version control                             | Git |
| **LVCS**   | Local version control                                   | RCS |

---
