
/*this program defines class named MyRectangle2D that contains
 *
 * two double data fields named x and y that specify the center of the rectangle
 * with getter and setter methods.
 * the data fields width and height with getter and setter methods
 * a no-argument constructor that creates a default rectangle with (0,0) for (x,y)
 * and 1 for both width and height
 * a constructor that creates a rectangle with the specified x,y,width and height.
 * a method getArea(0 that returns the area of the rectangle.
 * a method getPerimeter() that returns the perimeter of the rectangle.
 * a method contains(double x,double y)that returns true if the specified point(x,y)
 * is inside this rectangle
 * a method contains(MyRectangle2D r) that returns true if the specified rectangle is inside
 * this rectangle
 * a method overlaps(MyRectangle2D r) that returns true if the specified rectangle
 * overlaps with this rectangle
 * 
 *
 */
public class C10E13Program1MyRectangle2DImplementation
{
public static void main(String[] args)
{
	String input5="this program defines class named MyRectangle2D that contains"+
			  "\ntwo double data fields named x and y that specify the center of the rectangle"+
			  "\nwith getter and setter methods."+
			  "\nthe data fields width and height with getter and setter methods"+
			  "\na no-argument constructor that creates a default rectangle with (0,0) for (x,y)"+
			  "\nand 1 for both width and height"+
			  "\nit also defines a constructor that creates a rectangle with the specified x,y,width and height."+
			  "\nit also defines a method getArea(0 that returns the area of the rectangle."+
			  "\nit also defines a method getPerimeter() that returns the perimeter of the rectangle."+
			  "\nit also defines a method contains(double x,double y)that returns true if the specified point(x,y)"+
			 "\nis inside this rectangle"+
			 "\nit also defines a method contains(MyRectangle2D r) that returns true if the specified rectangle is inside"+
			 "\nthis rectangle"+
			 "\nit also defines a method overlaps(MyRectangle2D r) that returns true if the specified rectangle"+
			 "\noverlaps with this rectangle";
	int repeat=1;
	int choice = 0;
	double xcenter,ycenter;
	double xpoint,ypoint;
	double basewidth,baseheight;
	double xcontain,ycontain;
	
	double xoverlaps,yoverlaps;
	double widhtoverlaps,heightoverlaps;
	
	double widthcontain,heightcontain;
	
	
	
	java.util.Scanner input7=new java.util.Scanner(System.in);
	while(repeat==1)
	{
	System.out.println(input5);
	boolean pointValue;
	boolean containvalue;
	boolean overlapvalue;
	
	C10E13Program2MyRectangle2D r1=new C10E13Program2MyRectangle2D();
	System.out.println("\nenter the center(x,y) of the base rectangle with one space between them ");
	xcenter=input7.nextDouble();
			ycenter=input7.nextDouble();
	r1.setCenter(xcenter, ycenter);
	System.out.println("\nenter the width and height of the base rectangle with one space between them");
	basewidth=input7.nextDouble();
	baseheight=input7.nextDouble();
	r1.setWidthAndHeight( basewidth,baseheight);
	r1.formRectangle();
	r1.caluculateArea();
	r1.caluculatePerimeter();
	
	
	System.out.println("\nenter the co-ordinates of the POINT to be checked whether the POINT is in base rectangle or no");
	
	System.out.println("enter the x and y with one space between them");
	xpoint=input7.nextDouble();
	ypoint=input7.nextDouble();
	pointValue=r1.pointInOrOut(xpoint,ypoint);
	if(pointValue==true)
	{
	System.out.println("\nPOINT ("+xpoint+","+ypoint+") IS INSIDE THE RECTANGLE");
	}
	else
	{
		System.out.println("\nPOINT ("+xpoint+","+ypoint+") IS OUTSIDE THE RECTANGLE");
	}
	
	
	
	
	
	System.out.println("\nenter the center,width and height to check if this rectangle lies(CONTAINS) inside the base rectangle");
	System.out.println("enter the center(x,y)  with a space between them");
	xcontain=input7.nextDouble();
			ycontain=input7.nextDouble();
			System.out.println("enter the widht and height of the rectangle with one space between them");
			widthcontain=input7.nextDouble();
			heightcontain=input7.nextDouble();
	
	C10E13Program2MyRectangle2D r2=new C10E13Program2MyRectangle2D(xcontain,ycontain,widthcontain,heightcontain);
	containvalue=r2.contains(r2);
	System.out.println("\n"+containvalue);
	if(containvalue==true)
	{
		System.out.println("RECTANGLE with center(x,y)=("+xcenter  +","+ycenter   +") and width="+basewidth  +"and height="+baseheight+  " CONTAINS THE RECTANGLE with center(x,y)=("+xcontain+","+ycontain+") and width="+widthcontain+" and height="+heightcontain);
	}
	else
	{
		System.out.println("RECTANGLE with center(x,y)=("+xcenter  +","+ycenter   +") and width="+basewidth  +"and height="+baseheight+  " DOESNT CONTAINS THE RECTANGLE with center(x,y)=("+xcontain+","+ycontain+") and width="+widthcontain+" and height="+heightcontain);
	}
	
	
	
	
	
	
	
	
	
	
	System.out.println("\nenter the center,width and height to check if this rectangle OVERLAPS the base rectangle");
	System.out.println("enter the center(x,y)  with a space between them");
	xoverlaps=input7.nextDouble();
			yoverlaps=input7.nextDouble();
			System.out.println("enter the widht and height of the rectangle with one space between them");
			widhtoverlaps=input7.nextDouble();
			heightoverlaps=input7.nextDouble();
	C10E13Program2MyRectangle2D r5=new C10E13Program2MyRectangle2D(xoverlaps,yoverlaps,widhtoverlaps,heightoverlaps);
	overlapvalue=r5.overlaps(r5);
	System.out.println("\n"+overlapvalue);
	if(overlapvalue==true)
	{
		System.out.println("RETANGLE OVERLAPS");
	}
	else
	{
		System.out.println("RECTANGLE DOESNT OVERLAP");
	}
	
	
	
	
	
	
	
	
	
	
	
	System.out.println("\nto run the program with different values pleasee press 1 or to exit anything other than 1");
	repeat=input7.nextInt();
	}
	System.out.println("exit of the program\nThank You");
}
}
