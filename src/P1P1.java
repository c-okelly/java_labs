import java.util.Scanner;

public class P1P1 {
	public static void main(String[] args) 
		{
		Scanner s = new Scanner(System.in);
		double radius, area, pi, length, volume;
		pi = Math.PI;
		
		
		System.out.println("Please insert a number for the radius");
		radius = s.nextDouble();
		System.out.println("Please insert a number for the length");
		length = s.nextDouble();
		
		if (radius >= 0 && length >= 0) {
		
		area = pi * (Math.pow(radius, 2));
		volume = area * length;
		
		
		System.out.println("The area of the circle is " + area);
		System.out.println("The volume of the circle is " + volume);
		}
		else {
			System.out.println("The radius or length is negative");
		}
		
		if (s != null) s.close(); 
		}
}
