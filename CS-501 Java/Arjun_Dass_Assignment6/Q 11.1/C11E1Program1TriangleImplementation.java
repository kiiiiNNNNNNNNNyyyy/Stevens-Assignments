
/*class named Triangle is created that extends GeometricObject
 * this class contains-
 * 
 * three double data fields named side1,side2 and side3 with default
 * values 1.0 to denote three sides of the triangle.
 * 
 * a no-argument constructor that creates a default triangle
 * 
 * a constructor that creates a triangle with the specified side1,side2 and side3.
 * 
 * the accessory methods for all three data fields
 * 
 * a method named getArea(0 that returns the area of the triangle
 * 
 * a method named getPerimeter(0 that returns the perimeter of this triangle
 * 
 * a method named toString() that returns a string description for the triangle
 * 
 * 
 */
import java.io.IOException;
import java.util.Scanner;

public class C11E1Program1TriangleImplementation
{
	public static void main(String args[]) throws IllegalTriangleException
	{
		String input5="class named Triangle is created that extends GeometricObject"+
                         "\nthis class contains-"+
  
  "\nthree double data fields named side1,side2 and side3 with default"+
  "\nvalues 1.0 to denote three sides of the triangle."+
 
  "\na no-arguement constructor that creates a default triangle"+
  
  "\na constructor that creates a triangle with the specified side1,side2 and side3."+
  
   "\nthe accessor methods for all thre data fields"+
  
  "\na method named getArea() that retunrs the area of the triangle"+
  
  "\na method named getPerimeter() that returns the perimeter of this triangle"+
 
  "\na method named toString() that returns a string description for the triangle";
 
  
 
		
		double side1=1,side2=1,side3=1;
		int repeat=1;
		
	Scanner input=new Scanner(System.in);
	
	while(repeat==1)
	{
	try
	{
	System.out.println(input5);	
	System.out.println("\nenter the side1 of the triangle");
	side1=input.nextInt();
	System.out.println("enter the side2 of the triangle");
	side2=input.nextInt();
	System.out.println("enter the side3 of the triangle");
	side3=input.nextInt();
	
	C11E1Program2Triangle t1=new C11E1Program2Triangle(side1,side2,side3,"white",true);
	IllegalTriangleException t5=new IllegalTriangleException ();
	t5.validOrNot();
		
	
	System.out.println(t1.toString());
	
	
	}
	
	
	
	catch(IllegalTriangleException ex)
	{
		System.out.println("these sides doesnt form the triangle ");
		System.out.println("please enter the valid sides");
	}
	System.out.println("\nto try the output with different sides please press 1 or to exit press anything other than 1");
	repeat=input.nextInt();
	}
	System.out.println("exit of the program\nThank You");
	}
	
}
