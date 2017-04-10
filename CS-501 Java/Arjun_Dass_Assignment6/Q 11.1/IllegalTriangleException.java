
/*In this code IllegalTriangleException is defined
 * 
 */

import java.io.IOException;

public class IllegalTriangleException extends Exception
{
	C11E1Program2Triangle t5=new C11E1Program2Triangle();
	void validOrNot() throws IllegalTriangleException
	{
	if(t5.sideone>=t5.sidetwo+t5.sidethree||t5.sidetwo>t5.sidethree+t5.sideone||t5.sidethree>t5.sideone+t5.sidetwo)
	{
		IllegalTriangleException ex=new IllegalTriangleException();
		throw ex;
	}
	else
	{
		
		System.out.println("this is a valid triangle");
		t5.area();
		t5.perimeter();
	}
	}
}
