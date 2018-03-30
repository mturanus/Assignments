package Methods;

public class RectangleProcess {
	
	
	public static void main(String[] args) {
		
		
		Rectangle rec=new Rectangle();
		
		rec.name="Rectang";
		
		rec.edge=4;
		
		
		int recperimeter=rec.perimeter(10, 5);
		
		System.out.println("Rectangle's perimeter is "+recperimeter);
		
		
		int recarea=rec.area(10, 5);
		
		System.out.println("Rectangle's area is "+recarea);
		
		
		
		
		
		
		
		
		
	}
	
	

}
