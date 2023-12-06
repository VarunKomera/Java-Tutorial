package com.anudip.learning;

public class Car{

  private String make, model;
  private short year;
  private int price;

   public Car(String make, String Model, Short year, int price){

   make = make;
   model = model;
   year = year;
   price = price;
   }

	protected void showdata(){
	
	System.out.println("Make : "+ make);
	System.out.println("Car Model : "+ model);
	System.out.println("year of manufacturing : "+ year);
	System.out.println("Price of Car : "+ price);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Car Details: ");

		Car car1 = new Car("maruti Suziki", "santro", (short)(2006), 600000);
	}
	}