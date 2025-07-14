import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AttendanceSystem system = new AttendanceSystem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Smart Attendance System");
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (!system.login(username, password)) {
            System.out.println("Invalid credentials. Exiting...");
            return;
        }

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Mark Attendance");
            System.out.println("3. View Attendance Report");
            System.out.println("4. View All Students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt(); scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Roll No: ");
                    String rollNo = scanner.nextLine();
                    system.addStudent(name, rollNo);
                    break;

                case 2:
                    System.out.print("Enter Roll No: ");
                    String roll = scanner.nextLine();
                    System.out.print("Is Present (yes/no): ");
                    String present = scanner.nextLine();
                    system.markAttendance(roll, present.equalsIgnoreCase("yes"));
                    break;

                case 3:
                    system.viewAttendanceReport();
                    break;

                case 4:
                    system.listStudents();
                    break;

                case 5:
                    System.out.println("Thank you! Exiting...");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
