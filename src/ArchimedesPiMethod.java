import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the number of sides for a polygon: ");
        int numSides = Integer.parseInt(s.nextLine());
        double B = 360.0 / numSides;
        double A = B / 2;
        double side = 2 * Math.sin(Math.toRadians(A));
        double p = numSides * side;
        double myPI = p / 2;
        System.out.printf("My estimate for PI: %.10f, myPI, Math.PI");
    }
