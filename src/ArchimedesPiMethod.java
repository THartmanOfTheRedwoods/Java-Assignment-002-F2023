import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.println("Please insert N: ");

        String nStr = x.nextLine();
        int n = Integer.parseInt(nStr);

        System.out.println(n);

        int b = 360/n;

        double a = 0.5 * b;

        System.out.println(a);

        double convert = Math.toRadians(a);

        System.out.println(convert);

        double s = 2 * Math.sin(convert);

        System.out.println(s);

        double p = n * s;

        System.out.println(p);

        double pi = p/2;

        System.out.println("PI Estimate: "+ pi );

}
}