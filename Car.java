import java.util.Scanner;

public class Car
{
  private String make;
  private String model;
  private short year;
  private int price;

   public Car(String make, String model, short year, int price)
   {
     make = make;
     model = model;
     year = year;
     price = price;
   }

   public String getMake()
   {
    return make;
   }
   public String getModel()
   {
    return model;   
   }
   public short getYear()
   {
     return year;
   }
   public int getPrice()
   {
    return price;
   }

	public static void main(String[] args)
	{
	  Scanner scanner = new Scanner(System.in);

	  System.out.println("Enter car details: ");
	  System.out.println("Make: ");
	  String make = scanner.nextLine();
	  System.out.println("Model: ");
	  String model = scanner.nextLine();
	  System.out.println("Year: ");
	  short year = scanner.nextShort();
	  System.out.println("Price: ");
	  int price = scanner.nextInt();

	 Car car = new Car(make, model, year, price);

 	System.out.println("\nCar details: ");
 	System.out.println("Make: " + car.getMake());
 	System.out.println("Model: " + car.getModel());
  	System.out.println("Year: " + car.getYear());
 	System.out.println("Price: " + car.getPrice());

	scanner.close();
	}
   }