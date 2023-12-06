import java.util.Scanner;

public class Student {
    private int idno;
    private String name;
    private String course;
    private double average;

    // Constructor to initialize the student data
    public Student(int idno, String name, String course, double average) {
        idno = idno;
        name = name;
        course = course;
        average = average;
    }

    // Method to read student data
    public void readStudentData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student ID: ");
        idno = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter Student Name: ");
        name = scanner.nextLine();

        System.out.println("Enter Course: ");
        course = scanner.nextLine();

        System.out.println("Enter Average: ");
        average = scanner.nextDouble();

        scanner.close();
    }

    // Method to display student data
    public void displayStudentData() {
        System.out.println("Student ID: " + idno);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {
        Student student = new Student(0, "", "", 0.0); // Create a default student object
        student.readStudentData(); // Read student data from the user
        System.out.println("\nStudent Information:");
        student.displayStudentData(); // Display student data
    }
}
