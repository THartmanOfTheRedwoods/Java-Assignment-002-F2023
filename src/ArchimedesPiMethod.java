import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        System.out.println("Enter number of sides of Polygon: ");
        Scanner s = new Scanner(System.in);
        int value = Integer.parseInt( s.nextLine());
        double B = 360.0/value;
        double A = B * (1.0/2.0);
        double sinA = 2.0 * Math.sin(Math.toRadians(A));
        double P = value * sinA;
        double Pi = P/2.0;
        System.out.println(Pi);
    }
}
