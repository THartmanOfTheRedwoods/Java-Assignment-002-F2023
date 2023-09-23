import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
    double n = 8.0;
                 double b = 360.0/n;
               double A = (1.0/2.0)* b;
               double s = 2.0* Math.sin(Math.toRadians(A));
                      double  p = n * s;
                               double Pi= p/ 2.0;
        System.out.println(Pi);
        System.out.println("I know this is wrong because Pi actually equals 3.14159 etc. But this is what I got.");
        System.out.print("*finger guns*");

    }
}
