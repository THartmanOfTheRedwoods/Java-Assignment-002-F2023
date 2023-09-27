import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Please enter the number of sides for a polygon: ");
            int numSides = Integer.parseInt(s.nextLine()); // n = numSides, n = 8 was not right
            double angleB = 360.0 / numSides;
            double angleA = angleB / 2;
            double side = 2 * Math.sin(Math.toRadians(Math.toRadians(angleA))); // side = s
            double p = numSides * side; // p = perimeter
            double myPI= p / 2;
            System.out.printf("My estimate for PI: %.15f Real PI: %.15f%n", myPI, Math.PI);

        } catch(NumberFormatException nfe) {
            System.out.println("You need to enter a number.");
        }
            }
        }
