import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      String nStr= s.nextLine();
      int n = Integer.parseInt(nStr) ;
      System.out.println(n);
      double b = 360.0 / n;
      double a = b * 1/2;
      a = Math.toRadians(a);
      double baseS = 2 * Math.sin(a);
      double p = n * baseS;
      double answer = p /2;

      System.out.println(answer);

    }
}
