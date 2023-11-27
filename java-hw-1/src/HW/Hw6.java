package HW;

public class Hw6 {
    public static double year(double a){
        return Math.ceil(a/100);
    }

    public static void main(String[] args) {
        double x=year(2023);
        double y=year(2000);
        System.out.println(x);
        System.out.println(y);
    }
}
