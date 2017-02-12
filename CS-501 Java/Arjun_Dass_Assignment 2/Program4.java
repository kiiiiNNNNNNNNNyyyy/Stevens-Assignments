public class Program{

     private static final double constant = 6371.01;

    public static void main(String[] args) {

        double atlantaY = -84.3879824;
        double atlantaX = 33.7489954;

        double orlandoY = -81.3792364999;
        double orlandoX = 28.5383355;

        double SavannahY = -81.09983419999998;
        double SavannahX = 32.0835407;

        double charlotteY = -80.84312669999997;
        double charlotteX = 35.2270869;

        // Getting sides for 2 triangles
        double t1s1 = distance(atlantaX, atlantaY, SavannahX, SavannahY);
        System.out.println("Distance between Atlanta and Savannah : "+ t1s1);
      
        double t1s2 = distance(SavannahX, SavannahY, charlotteX, charlotteY);
        System.out.println("Distance between Savannah and Charlotte : "+ t1s2);      
        double t1s3 = distance(charlotteX, charlotteY, atlantaX, atlantaY);
        System.out.println("Distance between Charlotte and Atlanta : " +  t1s3);

        double t2s1 = distance(atlantaX, atlantaY, orlandoX, orlandoY);
      System.out.println("Distance between Atlanta and Orlando : " +  t2s1);
        double t2s2 = distance(orlandoX, orlandoY, SavannahX, SavannahY);
      System.out.println("Distance between Orlando and Savannah : " + t2s2);
        double t2s3 = distance(SavannahX, SavannahY, atlantaX, atlantaY);
      System.out.println("Distance between Savannah and Atlanta : " + t2s3 + "\n");

        // Testing to see if both triangles are real triangles
        boolean isTriangle1 = isTriangle(t1s1, t1s2, t1s3);
        boolean isTriangle2 = isTriangle(t2s1, t2s2, t2s3);


        // If they are a triangle, add both areas to get
        // total area
        if (isTriangle1 && isTriangle2) {
            double area1 = area(t1s1, t1s2, t1s3);
            double area2 = area(t2s1, t2s2, t2s3);
            System.out.printf("\nTriangle 1 Coordinates (Atlanta, Savannah, Charlotte): \n" + t1s1 + "  " + t1s2 + "  " + t1s3 + "  and \n\n its area is : " + area1 + "\n");
            
            System.out.printf("\nTriangle 2 Coordinates (Atlanta, Orlando, Savannah) : \n" + t2s1 + "  " + t2s2 + "  " + t2s3 + "  and \n\n its area is : " + area2 + "\n");
            double totalArea = area1 + area2;
            System.out.println("\nThe total area covered by these cities is : " + totalArea);
        } else {
            System.out.println("Sorry the coordinates are incorrect");
        }

    }

    public static double distance(double x1, double y1, double x2, double y2) {

        double distance = constant *
                Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
                        Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));

        return distance;
    }

    public static double area(double side1, double side2, double side3) {

        double s = (side1 + side2 + side3) / 2.0;
        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }

    public static boolean isTriangle(double side1, double side2, double side3) {

        return  ((side1 + side2 > side3) &&
                (side1 + side3 > side2) &&
                (side3 + side2 > side1));

    }

}
