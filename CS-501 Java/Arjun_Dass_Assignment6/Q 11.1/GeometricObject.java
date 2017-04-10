
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
import java.util.Date;
public class GeometricObject 
{
	private String color;
	private boolean filled;
	private Date dateCreated;
	
	public GeometricObject()
	{
		color = "White";
		filled = false;
		dateCreated = new Date();
	}
	public GeometricObject(String color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
		dateCreated = new Date();
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public boolean isFilled()
	{
		return filled;
	}
	public void setIsFilled(boolean filled)
	{
		this.filled = filled;
	}
	public Date getDateCreated()
	{
		return dateCreated;
	}
	public String toString(){
		return "Filled = " + filled + " color = " + color +" date-created = " + dateCreated;
	}
}
