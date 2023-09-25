import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        int n = 376;
        int B = 360;
        double A = .5;
        int s = 2;
       System.out.println(B/n);
       System.out.println(A*B);
       System.out.println(n*(Math.toRadians(s*Math.sin(A)))/2);
    }
}
