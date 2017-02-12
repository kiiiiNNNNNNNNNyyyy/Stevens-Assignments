import java.io.*;
import java.util.*;

class Program1{
	public static void main(String[] args) {
		
		Double a,b,c,d,e,f,x,y;
		
		System.out.println("\n ***** This Program solves the linear equation with appropriate if statement ********** \n");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value for : a, b, c, d, e ,f Separated by an line break/Enter:  ");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		d = scan.nextDouble();
		e = scan.nextDouble();
		f = scan.nextDouble();
		
		System.out.println("\n The equation according to the input is: \n");
		System.out.println("Equation 1:\t" + a + "x + " + b + "y" + " = " + e);
		System.out.println("Equation 2:\t" + c + "x + " + d + "y" + " = " + f);
		
		x = ((e*d) - (b*f))/((a*d) - (b*c));
		y = ((a*f) - (e*c))/((a*d) - (b*c));
		
		if(((a*d) - (b*c)) == 0){
			System.out.println("\n This equation has no solution \n");
		}else{
			System.out.println("\nValue of X: " + x);
			System.out.println("Value of Y: " + y);
		}
		
	}
}