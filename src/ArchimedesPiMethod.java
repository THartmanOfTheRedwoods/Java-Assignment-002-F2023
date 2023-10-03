/**
 *
 * @author Trevor Hartman
 * @author Miranda Arnett
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            while (true) {
                System.out.print("Please enter the number of sides for a polygon: ");
                int numSides = Integer.parseInt(s.nextLine());
                if (numSides == -1) {
                    break;
                }
                double B = 360.0 / numSides;
                double A = B / 2;
                double side = 2 * Math.sin(Math.toRadians(A));
                double p = numSides * side;
                double myPI = p / 2;
                System.out.printf("My estimate for PI: %.15f Real PI: %.15f", myPI, Math.PI);
                System.out.println();
            }


    }
}
