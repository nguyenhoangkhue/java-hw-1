package HW;

public class Hw6 {
    public static double century(double a) {
        return Math.ceil(a/100);

    }

    public static void main(String[] args) {
        double x=century(2023);
        double y=century(2000);
        System.out.println(x);
        System.out.println(y);
    }
}
