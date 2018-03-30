package Loop;

public class ReverseString {
	public static void main(String[] args) {
		ReverseString.reverse("Muammer"); 
	}
	public static String reverse(String name) {
		
		
		for (int i=name.length()-1;i>=0;i--) {
			
			System.out.print(name.charAt(i));
			
			
		}return name;
	}

}
