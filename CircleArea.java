package Java_100_Program;

public class CircleArea {
  
	public static void main(String[] args) {
		 
		// declaring double to radius and area because PI is a real value constant
		double area=0, r=10;
		
		//area of a circle is PI*r^2
		area = Math.PI*Math.pow(r, 2);
		
		System.out.println(area);
		
	}
}
