import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
    int n = 8;
    double angleB = 360.0 / n;
        System.out.println("Angle B for a " + n + "-sided polygon is: " + angleB + " degrees");
    double angleA = 0.5 * angleB;
        System.out.println("Angle A is: " + angleA + " degrees");
        double s = 2.0 * Math.sin(Math.toRadians(angleA));
        System.out.println("Length of the triangle base (s) is: " + s);
        class PolygonPerimeterCalculator {
            public static void main(String[] args) {
                int n = 6;
                double s = 0.7653668647301796;
                double perimeter = n * s;

                System.out.println(n * s);
            }
        }

    }
}
