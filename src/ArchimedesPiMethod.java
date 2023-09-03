import java.util.Scanner;
public class ArchimedesPiMethod {
    public static void main(String[] args) {
        System.out.println("Input the number of sides");
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();

        double b = 360.0 / n;
        double a = b / 2;
        double baseS = 2 * Math.sin(Math.toRadians(a));
        double perimeterP = n * baseS;
        double pi = (perimeterP / 2);

        System.out.printf("The pi estimate is %f" ,pi);

    }
}
