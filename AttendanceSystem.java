import java.util.*;
import java.time.LocalDate;

public class AttendanceSystem {
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin123";

    private List<Student> students = new ArrayList<>();
    private List<Attendance> attendanceRecords = new ArrayList<>();

    public boolean login(String username, String password) {
        return ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password);
    }

    public void addStudent(String name, String rollNo) {
        students.add(new Student(name, rollNo));
        System.out.println("Student added successfully.\n");
    }

    public void markAttendance(String rollNo, boolean isPresent) {
        attendanceRecords.add(new Attendance(rollNo, LocalDate.now(), isPresent));
        System.out.println("Attendance marked.\n");
    }

    public void viewAttendanceReport() {
        System.out.println("\n--- Attendance Report ---");
        for (Attendance record : attendanceRecords) {
            System.out.println("Roll No: " + record.getRollNo() +
                    " | Date: " + record.getDate() +
                    " | Present: " + (record.isPresent() ? "Yes" : "No"));
        }
        System.out.println();
    }

    public void listStudents() {
        System.out.println("\n--- Registered Students ---");
        for (Student s : students) {
            System.out.println("Name: " + s.getName() + " | Roll No: " + s.getRollNo());
        }
        System.out.println();
    }
}

