import java.util.Scanner;

public class Occurances {

	static boolean cont = true;

	public static void main(String[] args) {
		System.out.println("This program count the number of occurances of a character in a string. User is asked to"
				+ " input a string and the charater whose occurance is to be found.\n");
		Scanner scan = new Scanner(System.in);
		while (cont) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a string: ");
			String s = input.nextLine();
			System.out.print("Enter a character: ");
			char ch = input.next().charAt(0);

			System.out.println("The number of occurrences of \'" + ch + "\' in \"" + s + "\" is " + count(s, ch));
			System.out.println("Do you wanna continue? : Enter yes or no");
			String userInput = scan.next();
			if(userInput.equals("Yes") || userInput.equals("yes")){
				cont  = true;
			}else if(userInput.equals("No") || userInput.equals("no")){
				System.out.println("Thank you!!");
				cont = false;
				break;
			}else{
				System.out.println("Invalid Input \n Exiting Program!!");
				break;
			}
		}
		
	}

	public static int count(String str, char a) {

		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == a)
				count++;
		}

		return count;
	}
}