import java.util.Scanner;

public class Invoice {
    private String invoiceId;
    private double invoicePrice;
    private String vendorName;
    private String invoiceName;
    private String location;

    // Default constructor
    public Invoice() {
        this.invoiceId = "";
        this.invoicePrice = 0.0;
        this.vendorName = "";
        this.invoiceName = "";
        this.location = "";
    }

    // Method to add an invoice (read from the user)
    public void addInvoice() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Invoice ID: ");
        this.invoiceId = scanner.nextLine();

        System.out.print("Enter Invoice Price: ");
        this.invoicePrice = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Vendor Name: ");
        this.vendorName = scanner.nextLine();

        System.out.print("Enter Invoice Name: ");
        this.invoiceName = scanner.nextLine();

        System.out.print("Enter Location: ");
        this.location = scanner.nextLine();
    }

    // Method to display the invoice details
    public void displayInvoice() {
        System.out.println("Invoice ID: " + this.invoiceId);
        System.out.println("Invoice Price: " + this.invoicePrice);
        System.out.println("Vendor Name: " + this.vendorName);
        System.out.println("Invoice Name: " + this.invoiceName);
        System.out.println("Location: " + this.location);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of invoices: ");
        int n = scanner.nextInt();

        // Create an array of Invoice objects
        Invoice[] invoices = new Invoice[n];

        // Initialize and add invoices to the array
        for (int i = 0; i < n; i++) {
            invoices[i] = new Invoice();
            System.out.println("\nEnter details for Invoice " + (i + 1) + ":");
            invoices[i].addInvoice();
        }

        // Display all invoices
        System.out.println("\nDisplaying Invoice Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nDetails for Invoice " + (i + 1) + ":");
            invoices[i].displayInvoice();
        }

        scanner.close();
    }
}
