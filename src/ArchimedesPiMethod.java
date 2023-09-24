import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        while(true){
            System.out.print("Please input the amount of sides in your desired polygon: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(n < 1) {
                System.out.println("Cheeky, try again.");
                break;
            }
            System.out.printf("You chose a polygon of %d sides.\n", n);
            double b = 360.0 / n;
            double a = b / 2;
            double s = 2 * Math.sin(Math.toRadians(a));
            double p = n * s;
            System.out.println("You've calculated an estimation of pi resulting to: " + p / 2.0 + ", close, but no cigar!");
        }
    }
}