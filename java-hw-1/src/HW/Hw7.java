package HW;

public class Hw7 {
    public static double BMI(double a, double b){
        return a/(b*b);
    }

    public static void main(String[] args) {
        double x=BMI(75.5,1.75);
        System.out.println(x);
    }
}
