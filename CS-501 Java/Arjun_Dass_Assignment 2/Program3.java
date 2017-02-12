import java.io.*;
import java.util.*;

import java.util.Scanner;

public class Program3{

    public static void main (String[] args){
      
    	System.out.print("This Program  prompts the user to enter the latitude and longitude of two points on the earth in degrees and displays its great circle distance\n");
        double constant = 6371.01;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double lat1 = in.nextDouble();
        double long1 = in.nextDouble();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double lat2 = in.nextDouble();
        double long2 = in.nextDouble();

        double Latitude =  Math.toRadians(lat2 - lat1);
        double Longitude =  Math.toRadians(long2 - long1);
        
        lat1 =  Math.toRadians(lat1);
        lat2 =  Math.toRadians(lat2);
        
        double a = Math.pow(Math.sin(Latitude / 2),2) + Math.pow(Math.sin(Longitude / 2),2) * Math.cos(lat1) * Math.cos(lat2);
        double result = 2 * Math.asin(Math.sqrt(a));
        
        double answer = constant * result;
        
        System.out.printf("The distance between the two points is %f km.%n", answer);    
    }
    
}