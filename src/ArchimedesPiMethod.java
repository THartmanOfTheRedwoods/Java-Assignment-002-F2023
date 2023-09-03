import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        System.out.println("Insert number of sides");
        Scanner sc= new Scanner (System.in);
int n = sc.nextInt();
double b = 360.0 / n;
double a = (1.0 / 2.0 * b);
double s = 2.0 * Math.sin(Math.toRadians(a));
double p = Math.PI * s;
double pi = p / 2.0;
System.out.println("PI =" + pi);
    }
}
