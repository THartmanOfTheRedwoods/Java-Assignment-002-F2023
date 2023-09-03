import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        System.out.println("Please type the number of sides. ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double b = 360.0 / n;
        double a = b / 2;
        double s = 2 * Math.sin(Math.toRadians(a));
        double p = n * s;
        double pi = p / 2;
        System.out.println("Out pi estimate is:" + pi);
    }
}