import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides does your polygon have? ");
        int nPolygonSides = Integer.parseInt(scanner.nextLine().trim());
        double topAngle = 360/nPolygonSides;
        double congruentAngle = (360 - topAngle)/2;
        System.out.println("Your polygon of " + nPolygonSides + " can be divided into " + nPolygonSides + " triangles,");
        System.out.println("whose angles are " + topAngle + ", " + congruentAngle + ", and " + congruentAngle);

    }
}
