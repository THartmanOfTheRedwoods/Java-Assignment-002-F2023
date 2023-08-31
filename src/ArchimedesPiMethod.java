import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        //Step 1: Read into an integer the number of sides for our polygon: $n = 8$
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides does your polygon have? ");
        int nPolygonSides = Integer.parseInt(scanner.nextLine().trim());

        //Step 2: Calculate the angle $B = {360.0 \over n}$
        int b = 360/nPolygonSides;
        int a = b/2;

        //Step 3: Calculate the angle $A = {1 \over 2} * B$


        //Step 4: Calculate the length of 1 triangle base $s = 2 * sin(A)$ HINT: YOU NEED TO CONVERT A to RADIANS


        //Math.sin(), and Math.toRadians() will be your friends.


        //Step 5: Get the polygon perimeter $p = n * s$


        //Step 6: Estimate PI: $PI = {p \over 2}$

    }
}
