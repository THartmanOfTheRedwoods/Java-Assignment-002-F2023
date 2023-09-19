import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
       int n = 8;
       double B = 360.0 / n;
       double A = 0.5 * B;
       double AInRadians = Math.toRadians(A);
       double s = 2 * Math.sin(AInRadians);
       double p = n * s;
       double piEstimate = p / 2;
        System.out.println("Number of sides (n): " + n);
        System.out.println("Angle B: " + B + " degrees");
        System.out.println("Angle A: " + A + " degrees");
        System.out.println("Length of 1 triangle base (s): " + s);
        System.out.println("Polygon perimeter (p): " + p);
        System.out.println("Estimated value of Pi (PI): " + piEstimate);
    }
}
