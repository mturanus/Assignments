package Methods;

public class Plane {
	
	String name;
	String model;
	int speed;
	int rotationdegree;
	boolean engineIsON;
	
	
	public void newspeed(int spd) {
	
	speed=spd;
	}
	
	public String turn (String Sout, String West) {
		
		System.out.println("Plane turning to this way");
		
		return "Southwest";
		
		
	}
	


}
