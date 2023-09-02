import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        System.out.println("Please type the number of sides.");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double b =360.0 / n;
        double a = b / 2;
        double baseS = 2 * Math.sin(Math.toRadians(a));
        double perimiterP = n * baseS;
        double pi = (perimiterP / 2);
        System.out.printf("Our pi estimate is: %f",pi);
    }
}
