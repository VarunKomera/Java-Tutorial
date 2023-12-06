import java.util.Scanner;

public class Bill {
    private int billno;
    private String description;
    private double sales_amount;
    private double discount;
    private double amt_afterdiscount;

    // Method to read bill data from the user
    public void readBill() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Bill Number: ");
        billno = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Description: ");
        description = scanner.nextLine();

        System.out.print("Enter Sales Amount: ");
        sales_amount = scanner.nextDouble();

        scanner.close();
    }

    // Method to calculate the discount and amount after discount
    public void calculateBill() {
        if (sales_amount > 50000) {
            discount = 0.10 * sales_amount;
        } else {
            discount = 0.02 * sales_amount;
        }

        amt_afterdiscount = sales_amount - discount;
    }

    // Method to display bill details
    public void showBill() {
        System.out.println("Bill Number: " + billno);
        System.out.println("Description: " + description);
        System.out.println("Sales Amount: " + sales_amount);
        System.out.println("Discount: " + discount);
        System.out.println("Amount After Discount: " + amt_afterdiscount);
    }

    public static void main(String[] args) {
        Bill bill1 = new Bill();
        Bill bill2 = new Bill();

        System.out.println("Enter details for Bill 1:");
        bill1.readBill();
        bill1.calculateBill();

        System.out.println("\nEnter details for Bill 2:");
        bill2.readBill();
        bill2.calculateBill();

        System.out.println("\nBill 1 Details:");
        bill1.showBill();

        System.out.println("\nBill 2 Details:");
        bill2.showBill();
    }
}
