import java.lang.Math;
public class ArchimedesPiMethod {
    public static void main(String[] args) {
        int n = 8;
        int b = 360 / n;
        int a = (1/2) * b;
        double newA = Math.toRadians(a);
        double s = 2 * Math.sin(newA);
        double p = n * s;
        double PI = p / 2;
        System.out.println(PI);
    }
}
