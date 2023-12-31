import static java.lang.Math.PI;

public class a32_codingExercise8AreaCalculator {
    public static void main (String[] args) {
        System.out.println(area(-1));
        System.out.println((area(-1.0,4.0)));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return radius * radius * PI;
    }

    public static double area(double x, double y) {
        if((x < 0) || (y < 0)) {
            return -1.0;
        }
        return x * y;
    }
}
