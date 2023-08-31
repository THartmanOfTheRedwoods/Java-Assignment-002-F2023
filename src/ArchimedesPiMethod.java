import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        //Step 1: Read into an integer the number of sides for our polygon
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides does your polygon have? ");
        int PolygonSidesInt = Integer.parseInt(scanner.nextLine().trim());
        //double PolygonSidesDouble = (double) PolygonSidesInt;

        //Step 2: Calculate the angle b
        double b = 360/((double) PolygonSidesInt);
        System.out.println("Your " + PolygonSidesInt + "-sided polygon is comprised of " + PolygonSidesInt + " equal isosceles triangles\n" +
                        "that each have one angle of " + b + "° and two congruent angles of " + (180-b)/2 + "°.");  //test point

        //Step 3: Calculate the angle a
        double a = b/2;
        System.out.println("\nEach isosceles triangle is comprised of two right triangles with angles " + a + "°, " + (90-a) + "°, and 90°." );      //test point

        //Step 4: Calculate the length of 1 triangle base
        a = Math.toRadians(a);
        System.out.println("a = " + a);      //test point
        double s = 2 * Math.sin(a);
        System.out.println("The sin of " + a + "° is " + s);      //test point

        //Step 5: Get the polygon perimeter
        double polygonPerimeter = s * ((double) PolygonSidesInt);
        System.out.println("The perimeter of a " + PolygonSidesInt + "-sided polygon inscribed in a unit circle is "
                + polygonPerimeter + " units.");

        //Step 6: Estimate PI
        double polygonSemiPerimeter = polygonPerimeter/2;
        System.out.println("The  semiperimeter is " + polygonSemiPerimeter);
        double percentageAccuracy = (polygonSemiPerimeter/Math.PI)*100;
        System.out.println("This Archimedian estimation of π is " + percentageAccuracy + "% accurate.");
    }
}
