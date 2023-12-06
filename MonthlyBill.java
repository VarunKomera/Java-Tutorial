import java.util.Scanner;

public class MonthlyBill {
	

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter Data Consumed by the Subscriber : ");
		int data_consumed=obj.nextInt();
		int basic_charge = 300;
		
		if (data_consumed <10) {
			
			System.out.println("Bill Amount is : " + basic_charge);
		}
		else if (data_consumed >10 & data_consumed <30)
		{
			int amount = basic_charge + 5* (data_consumed - 10);
			System.out.println("Bill Amount is : " + amount);
		}
		else {
			
		
			int amount1 = 400 + 3 *(data_consumed - 30);
			System.out.println("Bill Amount is : " + amount1);
		}
 }
}