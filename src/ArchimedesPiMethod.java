public class ArchimedesPiMethod {

    public static void main(String[] args) {

        int n = 8;

        int b = 360/n;

        System.out.println(b);

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
