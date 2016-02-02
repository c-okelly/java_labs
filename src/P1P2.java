import java.util.Scanner;

public class P1P2 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		double subtotal, rate, gratuity, total;
		
		System.out.println("Please give the subtotal");
		subtotal = s.nextDouble();
		System.out.println("Please give the gratuity %");
		rate = s.nextDouble();
		
		rate = rate / 100;
		gratuity = rate * subtotal;
		total = gratuity + subtotal;
		
		System.out.println("The gratuity is " + gratuity);
		System.out.println("The total is " + total);
		
		if (s != null) s.close();
		
	}
}
