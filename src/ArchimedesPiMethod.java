/**
 *
 * @author Trevor Hartman
 * @author Cassandra Portlock
 *
 * @since Version 1.0
 *
 */
import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter number of sides for the polygon: ");
        int n = scanner.nextInt();
        System.out.println("The number of sides="+n);
        System.out.println();

        double B = 360.0 / n;
        System.out.print("The angle of B is 360.0/"+n);
        System.out.println("="+B);
        System.out.println();

        double A = B / 2;
        System.out.print("The angle of A is 1/2"+B);
        System.out.println("="+A);
        System.out.println();


        double s = 2 * Math.sin(Math.toRadians(A));
        System.out.print("The length of 1 triangle base is 2*sin("+A);
        System.out.println(")="+s);
        System.out.println();

        double p = n * s;
        System.out.print("The perimeter is "+n);
        System.out.println("*"+s);
        System.out.println("="+p);
        System.out.println();

        double PI = p / 2;
        System.out.print("PI is estimated as "+p);
        System.out.println("/2="+PI);
        System.out.println();
    }
}
