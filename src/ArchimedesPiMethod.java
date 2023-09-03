import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
int n = 8;
double b = 360.0/n;
double a = Math.toRadians(1.0 / 2.0 * b);
double s = 2.0 * Math.sin(a);
double p = Math.PI * s;
double pi = p / 2.0;
System.out.println("PI =" + pi);
    }
}
