
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

public class C11E1Program2Triangle extends GeometricObject
{
	static double s,area,perimeter;
	static double sideone,sidetwo,sidethree;
	boolean valid=true;

	public C11E1Program2Triangle(double side1, double side2, double side3,String color, boolean filled)
	{
		sideone=side1;
		sidetwo=side2;
		sidethree=side3;
		setColor(color);
		setIsFilled(filled);
		
	}  
	 
	public C11E1Program2Triangle() {
		
	}

	/*void validOrNot()throws IOException
	{
		
		if(sideone>=sidetwo+sidethree||sidetwo>sidethree+sideone||sidethree>sideone+sidetwo)
		{
			IOException ex=new IOException();
			throw ex;
		}
		else
		{
			System.out.println("this is a valid triangle");
			area();
			perimeter();
		}
		
	}*/
	void area()
	{
		s=(sideone+sidetwo+sidethree)/2;
		area=Math.sqrt(s*(s-sideone)*(s-sidetwo)*(s-sidethree));
		System.out.println("area of the triangle= "+area);
	}
    void perimeter()
	{
		perimeter=sideone+sidetwo+sidethree;
		System.out.println("perimeter of the triangle= "+perimeter);
	}
	public void GeometricObject(String string, boolean b) {
		// TODO Auto-generated method stub
		
	}


}
