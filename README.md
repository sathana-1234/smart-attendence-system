
# 🧠 Smart Attendance System

Welcome to the **Smart Attendance System**, a simple command-line-based Java application designed to streamline student attendance management. Ideal for small classrooms or prototype projects, this system allows teachers to securely log in, manage student data, mark attendance, and generate attendance reports.

## 🚀 Features

- ✅ **Login Authentication** for secure access
- 🧍 **Add Student** records (name and roll number)
- 🎯 **Mark Attendance** as Present or Absent
- 📊 **View Attendance Reports**
- 📋 **List All Students**
- ❌ **Exit** the application anytime

## 📦 Tech Stack

- **Language**: Java
- **Tools**: Java Scanner for input
- **Environment**: Command Line Interface (CLI)

## 🔧 Installation & Usage

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/smart-attendance-system.git
   cd smart-attendance-system
   ```

2. **Compile the Code**
   ```bash
   javac Main.java AttendanceSystem.java
   ```

3. **Run the Program**
   ```bash
   java Main
   ```

## 👤 Authentication

Before accessing the system, users must log in with valid credentials. *(Customize login details inside `AttendanceSystem.java`)*

## 📂 Project Structure

```plaintext
smart-attendance-system/
├── Main.java
├── AttendanceSystem.java
└── README.md
```

> Note: You must create and define the `AttendanceSystem` class (with methods like `login`, `addStudent`, `markAttendance`, etc.) separately for full functionality.

## 📸 Sample Output

```
Welcome to Smart Attendance System
Enter Username: admin
Enter Password: admin123

1. Add Student
2. Mark Attendance
3. View Attendance Report
4. View All Students
5. Exit
Choose an option:
```

## 🙌 Contribution

Contributions are welcome! Feel free to fork the repository and submit pull requests to improve or extend the system.

## 📝 License

This project is licensed under the [MIT License](LICENSE).

---
