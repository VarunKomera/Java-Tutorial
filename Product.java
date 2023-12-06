import java.util.Scanner;

public class Product {
    private int prdid;
    private String prddescription;
    private String batchcode;
    private double price;
    private double profit;

    // Method to add product and display its details
    public void addProduct(int prdid, String prddescription, String batchcode, double price) {
        this.prdid = prdid;
        this.prddescription = prddescription;
        this.batchcode = batchcode;
        this.price = price;

        System.out.println("Product details:");
        System.out.println("Product ID: " + prdid);
        System.out.println("Product Description: " + prddescription);
        System.out.println("Batch Code: " + batchcode);
        System.out.println("Price: " + price);
    }

    // Method to calculate profit based on price
    public double calculateProfit() {
        if (price >= 10000 && price <= 100000) {
            profit = 0.10 * price;
        } else if (price > 100000 && price <= 500000) {
            profit = 0.15 * price;
        } else if (price > 500000) {
            profit = 0.20 * price;
        } else {
            profit = 0; // No profit for prices below 10000
        }

        return profit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int prdid = scanner.nextInt();

        System.out.print("Enter Product Description: ");
        String prddescription = scanner.nextLine();

        System.out.print("Enter Batch Code: ");
        String batchcode = scanner.nextLine();

        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();

        Product product = new Product();
        product.addProduct(prdid, prddescription, batchcode, price);

        double calculatedProfit = product.calculateProfit();
        System.out.println("Calculated Profit: " + calculatedProfit);

        scanner.close();
    }
}
