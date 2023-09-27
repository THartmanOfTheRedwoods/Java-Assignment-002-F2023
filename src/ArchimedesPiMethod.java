import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Please type in the number of sides");
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            if (n < 1) {
                break;
            }

            double b = 360.0 / n;
            double A = (1.0 / 2.0) * b;
            double s = 2.0 * Math.sin(Math.toRadians(A));
            double p = n * s;
            double Pi = p / 2.0;
            System.out.print("My Pi estimate is ");
            System.out.println(Pi);
            System.out.println("The higher the number suggested, the more accurate the estimate of Pi");

        }
    }
}
