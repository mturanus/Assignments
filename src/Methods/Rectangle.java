package Methods;

public class Rectangle {
	
	String name;
	
	int edge;
	
	
	
	public int perimeter(int x, int y) {
		
		System.out.println("Lenght and witdh return to perimeter of the rectangle. ");
		
		return 2*(x+y);
		
	}
	
	public int area(int x , int y) {
		
		System.out.println("Lenght and witdh return to area of the rectangle.");
		
		return x*y;
		
	}

}
