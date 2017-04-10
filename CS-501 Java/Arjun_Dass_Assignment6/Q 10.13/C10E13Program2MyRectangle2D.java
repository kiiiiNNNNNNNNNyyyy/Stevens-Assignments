
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
 */
public class C10E13Program2MyRectangle2D
{
	static double x,y,xcenter,ycenter,width,height;
	static double x1,y1,x2,y2,x3,y3,x4,y4;
	static double tempx,tempy;
	static double tempxmid,tempymid;
	static double specifiedPointX;
	static double specifiedPointY;
	static double areaOfRectangle;
	static double perimeterOfRectangle;
	static double done,dtwo,dthree;
	static double dfour,dfive,dsix;
	static double dseven,deight,dnine;
	static double dten,deleven,dtweleve;
	static double sone,stwo,sthree,sfour;
	static double areaOfPart1,areaOfPart2,areaOfPart3,areaOfPart4;
	static double containscenterX,containscenterY;
	static double containswidth,containsheight;
	static double containstempx;
	static double containstempy;
	static double containsy1;
	static double containsx1;
	static double containsx2;
	static double containsy2;
	static double containsx3;
	static double containsy3;
	static double containsx4;
	static double containsy4;
	static double overlapstempx=height/2;
	static double overlapstempy=width/2;
	static double overlapsy1;
	static double overlapsx1;
	static double overlapsx2;
	static double overlapsy2;
	static double overlapsx3;
	static double overlapsy3;
	static double overlapsx4;
	static double overlapsy4;
	static double dummycontainsX;
	static double dummycontainsY;
	static double arearounding;
	static double arearounding1;
	static double overlapstempheight;
	static double overlapstempwidth;
	boolean contains=true;
	boolean overlaps=true;
	static double containstempheight;
	static double containstempwidth;
	boolean pointInOrOut=true;
	
public C10E13Program2MyRectangle2D(double xFormalParameter, double yFormalParameter, double widthFormalParameter, double heightFormalParameter)
{
	containscenterX=xFormalParameter;
	containscenterY=yFormalParameter;
	containswidth=widthFormalParameter;
	containsheight=heightFormalParameter;
	}
public C10E13Program2MyRectangle2D() 
{
	}
void setCenter(double xFormalParameter,double yFormalParameter)
{
	xcenter=xFormalParameter;
	ycenter=yFormalParameter;
	System.out.println("\nCenter is set with values \n(xcenter,ycenter)=("+xcenter+","+ycenter+")");
}
void setWidthAndHeight(double widthFormalParameter,double heightFormalParameter)
{
	width=widthFormalParameter;
	height=heightFormalParameter;
	System.out.println("\nwidth and height is set with values \nwidth="+width+"\nheight="+height);
}	
void formRectangle()
{
	tempx=height/2;
	tempy=width/2;
	y1=ycenter-tempx;
	x1=xcenter-tempy;
	x2=xcenter+tempy;
	y2=ycenter-tempx;
	x3=xcenter+tempy;
	y3=ycenter+tempx;
	x4=xcenter-tempy;
	y4=ycenter+tempx;
}
void caluculateArea()
{
	areaOfRectangle=height*width;
	System.out.println("\nArea of the base rectangle ="+areaOfRectangle);
}
void caluculatePerimeter()
{
	perimeterOfRectangle=2*(height+width);
	System.out.println("\nPerimeter of the base rectangle="+perimeterOfRectangle);
}
boolean pointInOrOut(double pointXFormalParameter,double pointYFormalParameter)
{
	x=pointXFormalParameter;
	y=pointYFormalParameter;
	done=Math.sqrt(Math.pow(x-x4,2)+Math.pow(y-y4,2));
	dtwo=Math.sqrt(Math.pow(x4-x1,2)+Math.pow(y4-y1,2));
	dthree=Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1,2));
	sone=(done+dtwo+dthree)/2;
	areaOfPart1=           Math.sqrt(sone*(sone-done)*(sone-dtwo)*(sone-dthree));
	dfour=Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1,2));
	dfive=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
	dsix=Math.sqrt(Math.pow(x-x2,2)+Math.pow(y-y2,2));
	stwo=(dfour+dfive+dsix)/2;
	areaOfPart2=           Math.sqrt(stwo*(stwo-dfour)*(stwo-dfive)*(stwo-dsix));
	dseven=Math.sqrt(Math.pow(x-x2,2)+Math.pow(y-y2,2));
	deight=Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
	dnine=Math.sqrt(Math.pow(x-x3,2)+Math.pow(y-y3,2));
	sthree=(dseven+deight+dnine)/2;
	areaOfPart3=           Math.sqrt(sthree*(sthree-dseven)*(sthree-deight)*(sthree-dnine));
	dten=Math.sqrt(Math.pow(x-x3,2)+Math.pow(y-y3,2));
	deleven=Math.sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3,2));
	dtweleve=Math.sqrt(Math.pow(x-x4,2)+Math.pow(y-y4,2));
	sfour=(dten+deleven+dtweleve)/2;
	areaOfPart4=           Math.sqrt(sfour*(sfour-dten)*(sfour-deleven)*(sfour-dtweleve));
	arearounding=areaOfPart1+areaOfPart2+areaOfPart3+areaOfPart4;
	arearounding1=areaOfRectangle;
	double roundOff = Math.round(arearounding * 100.0) / 100.0;
	double roundOff2=Math.round(arearounding1 * 100.0) / 100.0;
	if((roundOff2)==((roundOff)))
	{
		return pointInOrOut;
	}
	else
	{
		pointInOrOut=false;
		return pointInOrOut;
	}
}
boolean contains(C10E13Program2MyRectangle2D r)
{
	 containstempheight = containsheight/2;
	 containstempwidth = containswidth/2;
	dummycontainsX = containscenterX;
	dummycontainsY=containscenterY;
	containsx1=dummycontainsX-containstempwidth;
	containsy1=dummycontainsY-containstempheight;
	containsx2=dummycontainsX+containstempwidth;
	containsy2=dummycontainsY-containstempheight;
	containsx3=dummycontainsX+containstempwidth;
	containsy3=dummycontainsY+containstempheight;
	containsx4=dummycontainsX-containstempwidth;
	containsy4=dummycontainsY+containstempheight;
	if(containsx1>x1&&containsy1>y1&&containsx2<x2&&containsy2>y2&&containsx3<x3&&containsy3<y3&&containsx4>x4&& containsy4<y4 )
	{
		return contains;
	}
	else
	{
		contains=false;
		return contains;
	}
}
boolean overlaps(C10E13Program2MyRectangle2D r)
{
	overlapstempheight = containsheight/2;
	 overlapstempwidth = containswidth/2;
	dummycontainsX = containscenterX;
	dummycontainsY=containscenterY;
	overlapsx1=dummycontainsX-overlapstempwidth;
	overlapsy1=dummycontainsY-overlapstempheight;
	overlapsx2=dummycontainsX+overlapstempwidth;
	overlapsy2=dummycontainsY-overlapstempheight;
	overlapsx3=dummycontainsX+overlapstempwidth;
	overlapsy3=dummycontainsY+overlapstempheight;
	overlapsx4=dummycontainsX-overlapstempwidth;
	overlapsy4=dummycontainsY+overlapstempheight;
	if(overlapsx1>x1||overlapsy1>y1||overlapsx2<x2||overlapsy2>y2||overlapsx3<x3||overlapsy3<y3||overlapsx4>x4|| overlapsy4<y4 )
	{
		return overlaps;
	}
	
	else
	{
	overlaps=false;
		return overlaps;
	}
}
}













