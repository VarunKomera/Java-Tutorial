
public class Rectangle {
	
	int length, width, area; //data member
	
	Rectangle(int l, int w) //constructor
	{
		length=l;
		width=w;
	}
	 void findarea()
	 {
		 area=length*width;
	 }
	
	

	public static void main(String[] args) {
		
		Rectangle r1, r2;
		
		r1= new Rectangle(3,4);
		r2= new Rectangle(4,3);
		
		r1.findarea();
		r2.findarea();
		
		/*if(r1.area>r2.area)
			System.out.println("Rectnagle1 > Rectangle2");
		else if(r1.area<r2.area)
			System.out.println("Rectnagle1 < Rectangle2");
		else
			System.out.println("They are equal");*/
		
	String message;
	
	message = (r1.area>r2.area) ? "Rectnagle1 > Rectangle2" : (r1.area<r2.area) ? "Rectnagle1 < Rectangle2" : "They are equal";
	System.out.println(message);
	

	}

}