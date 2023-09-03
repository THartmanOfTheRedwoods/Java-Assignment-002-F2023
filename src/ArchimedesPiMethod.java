import java.lang.Math;
public class ArchimedesPiMethod {
    public static void main(String[] args) {
        float n = 8;
        float b = 360 / n;
        double a = (1/2.0) * b;
        double newA = Math.toRadians(a);
        double s = 2 * Math.sin(newA);
        double p = n * s;
        double PI = p / 2;
        System.out.println(PI);
    }
}
