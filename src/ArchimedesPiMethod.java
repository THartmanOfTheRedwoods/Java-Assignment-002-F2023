import java.util.Scanner;

/**
 * @author Trevor Hartman
 * @author MJ Fracess
 *
 * @since Version 1.0
 */
public class ArchimedesPiMethod {
    public static void main(String[] arg){
        while(true){
            System.out.println("Please Enter the number of sides.");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(n < 1) {
                break;
            }
            double b = 360.0 / n;
            double a = b / 2;
            double s = 2 * Math.sin(Math.toRadians(a));
            double p = n * s;
            double pi = p / 2;
            System.out.printf("Our PI estimate is: %.10f%n", pi);
            System.out.println(pi);
    }



    }
}
