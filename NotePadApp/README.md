# 📝 NotePadApp – Java I/O Project

A simple console-based notepad application in Java using File I/O. This app lets you create and save text files by typing content directly into the console, and stores them in a user-defined folder and filename.

---

 ## 📋 Features

- 📂 Allows custom folder path and filename input
- 🧠 Automatically creates folder if it doesn't exist
- 🖋️ Accepts multi-line content
- 💾 Saves file as `.txt` using `BufferedWriter`
- 🛑 Type `exit` to finish writing and save

---

 # 🧠 Concepts Used

- Java `Scanner` for user input
- `File`, `FileWriter`, and `BufferedWriter` from `java.io`
- File/folder creation and path handling
- Basic exception handling with `try-with-resources`

---

 ## **▶️ How to Run**

1. **Compile:**
```bash
javac NotePadApp.java
```

2. **Run:**
```bash
java NotePadApp
```

3. **Follow prompts:**
- Enter folder path (e.g., notes/)<br>
- Enter file name (e.g., mytext)<br>
- Start typing your notes<br>
- Type exit on a new line to save and quit<br>

💡 **Sample Output**
```bash
Enter the folder path to save (e.g., src/Java.Basics/IO/notes): notes
Enter  the filename (without extension): todo
Start typing your content (type 'exit' to save & quit):
- Buy groceries
- Study Java I/O
exit
📝 File saved successfully at: notes/todo.txt
```

🚧 **Notes:** <br>
If the folder doesn't exist, it is automatically created.
This is a beginner-friendly demonstration of file handling in Java.

👨‍💻 **Author:**
**Kamalesh TGK**<br>
Learning Java & Cybersecurity 💻🔐
