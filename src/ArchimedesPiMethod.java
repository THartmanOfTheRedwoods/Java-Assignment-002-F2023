import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        int n = 8;
        double totalDegree = 360.0;
        double angleB = (totalDegree / n);
        double angleA = (double) 1 / 2 * angleB;
        double s = Math.toRadians(angleA) * 2;
        double p = n * s;
        double PI =p / 2;
        System.out.println("This is an estimate of PI: "+PI);
    }
}

