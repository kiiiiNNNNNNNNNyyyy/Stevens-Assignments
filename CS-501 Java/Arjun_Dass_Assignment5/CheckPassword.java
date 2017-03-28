/*This program will ask the String input from the user,
 * and checks for the validity of the password:
 * 1. A password must contain at least 8 characters.
 * 2. A password must contain of only letters and digits.
 * 3. A password must contain at least two digits.
 * If the above conditions are satisfied then it will display that the entered password is valid.
 * Else it will display as Invalid password to user.
 */

import javax.swing.JOptionPane;
public class CheckPassword 

{
	
public static void main(String args[])

{
	System.out.println ("This program will ask the user to check the validity of the Password.\n"
			+ "If the password does not satisfy the password rules,\n"
			+"program propmts the user that it is an invalid password.\n"
			+"The 3 conditions to create a password are:\n"
			+ "1.A password must contain at least 8 characters.\n"
			+ "2.A password must contain only letters and digits.\n"
			+ "3.A password must contain at least two digits.\n");
	
	
	int opt=JOptionPane.YES_OPTION;
	
	while(opt==JOptionPane.YES_OPTION)
	{
		
	try{
		
	     String password=JOptionPane.showInputDialog("Please enter your password");


	    isValidPassword(password);
	    opt=JOptionPane.showConfirmDialog(null, "Valid Password"+"\nDo you want to continue");
	  }
	
		catch(Exception ex)
		{
			String outputString = " Invalid Password: " + 
					ex.getMessage() + 
					"\nDo you want to continue? ";
			opt = JOptionPane.showConfirmDialog(null, outputString);
		}
   }
}


public static void isValidPassword(String strpwd) throws Exception
{
	int count=0;
	if(strpwd.length()==0)
		
	     throw new Exception("The password must not be blank");
	
	if(strpwd.length()<8)
		
		throw new Exception("The password should be of atleast 8 charcaters");

	else
		
	{
		
	
	for(int i=0;i<strpwd.length();i++)
		
	{
		
	
		if(!Character.isLetterOrDigit(strpwd.charAt(i)))
				
			throw new Exception("The password should contain only letters or digits");
		
		
		if(Character.isDigit(strpwd.charAt(i)))
			count++;
		
	}
	
	if(count<2)
		throw new Exception("The password must contain atleast 2 digits");
	
	if(count == strpwd.length())
		throw new Exception("The password must contain both letters and digits.");
	
	}

}


}
 
