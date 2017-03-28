
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Count 
  {
    	public static void main(String[] args) 
	     {			
    		boolean repeat=true;
    	    while(repeat)
    	     {
    	    	System.out.println("This program counts and displays the number of\n"
    	         		+ "characters, words and lines in a given input file.");
    	    	System.out.println("Please enter the filename: ");
		        Scanner input = new Scanner(System.in);
		        String fileName = input.nextLine();
		        FileReader fReader;
		        try
		           {
		                fReader = new FileReader(fileName);
		                BufferedReader reader = new BufferedReader(fReader);
		                String position; 
		                String content = "";
		                int lines = 0;
		                int words = 0;
		                int chars = 0;
		                while((position = reader.readLine()) != null)
		                  {
		                    // count lines
		                    lines += 1;
		                    content += position;
		     
		                    // count words
		                    String []_words = position.split(" ");
		                    for( String w : _words)
		                     {
		                        words++;        
		                     }
		                   }
		                  chars = content.length();
	                      System.out.println("File " + fileName + " has ");
	                      System.out.println(chars + " Characters");
	                      System.out.println(words + " words\n" + lines + " lines");
	   		         } 
		           catch (FileNotFoundException ex) 
		             {
		                // Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		                System.out.println("File not found!");
		             } 
		           catch (IOException ex) 
		             {
		                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		                 System.out.println("An error has occured: " + ex.getMessage());
		            }
		        System.out.println("Do you want to repeat the program ? Press Y to repeat  Press N to exit");
		        Scanner input2 = new Scanner(System.in);
		        String option = input2.next();
		        if (option.equals("Y") || option.equals("y") )
		         {
			       repeat = true;
		         }
		        else if (option.equals("N") || option.equals("n"))
		         {
			       repeat = false;
		         }
		        else
		         {
			       System.out.println("The input is not valid. Program exiting.");
			       repeat = false;
		         }
		     }
		}
  }