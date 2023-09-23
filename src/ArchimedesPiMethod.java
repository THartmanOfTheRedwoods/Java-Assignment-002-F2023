import java.util.Scanner;
public class ArchimedesPiMethod {
    public static void main(String[] args) {
        // Creates scanner object, intakes the next integer typed by user
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of sides: ");
        int numSides = scan.nextInt();
        // Calculates value of angle B
        int angleB = 360/numSides;
        System.out.println("Angle B = " + angleB);
        // Calculates value of angle A
        double angleA = angleB * 0.5;
        System.out.println("Angle A = " + angleA);
        // Converts angle A to radians
        double angleAR = Math.toRadians(angleA);
        // Calculates value of triangle base s
        double baseS = 2.0 * Math.sin(angleAR);
        System.out.println("Base s = " + baseS);
        // Calculates the perimeter
        double perimeter = baseS * numSides;
        System.out.println("Polygon perimeter = " + perimeter);
        // Calculates approximate value of Pi
        double piEst = perimeter/2.0;
        System.out.println("Estimate of PI = " + piEst);
    }
}
