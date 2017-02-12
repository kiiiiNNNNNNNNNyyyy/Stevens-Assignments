import java.util.*;
public class Program2{
  
public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter x and y coordinates: ");
        double xCoordinate = input.nextDouble();
        double yCoordinate = input.nextDouble();

        double slope = -0.5D;
        double y1 = yCoordinate + -xCoordinate * slope;

        if ((xCoordinate > 200.0D) || (xCoordinate < 0.0D) || (yCoordinate > 100.0D) || (yCoordinate < 0.0D)) {
            System.out.println("The point is not in the triangle.");
        } else {

            if ((y1 <= 100.0D)) {
                System.out.println("The point is in the triangle");
            } else {
                System.out.println("The point is not in the triangle.");
            }
        }


    }
  
}
