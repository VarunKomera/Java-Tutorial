import java.util.Scanner;

public class StudentRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudents = 10;
        int[] rollno = new int[numStudents];
        String[] name = new String[numStudents];
        double[] averageMarks = new double[numStudents];

        // Read and store student records
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Roll Number: ");
            rollno[i] = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Name: ");
            name[i] = scanner.nextLine();

            System.out.print("Average Marks: ");
            averageMarks[i] = scanner.nextDouble();
        }

        // Display all student records
        System.out.println("\nStudent Records:");
        displayStudentRecords(rollno, name, averageMarks);

        // Display student records with average marks above 60
        System.out.println("\nStudents with Average Marks above 60:");
        displayAbove60(rollno, name, averageMarks);

        scanner.close();
    }

    // Function to display all student records
    public static void displayStudentRecords(int[] rollno, String[] name, double[] averageMarks) {
        for (int i = 0; i < rollno.length; i++) {
            System.out.println("Roll Number: " + rollno[i]);
            System.out.println("Name: " + name[i]);
            System.out.println("Average Marks: " + averageMarks[i]);
            System.out.println("-----------------------------");
        }
    }

    // Function to display student records with average marks above 60
    public static void displayAbove60(int[] rollno, String[] name, double[] averageMarks) {
        for (int i = 0; i < rollno.length; i++) {
            if (averageMarks[i] > 60) {
                System.out.println("Roll Number: " + rollno[i]);
                System.out.println("Name: " + name[i]);
                System.out.println("Average Marks: " + averageMarks[i]);
                System.out.println("-----------------------------");
            }
        }
    }
}
