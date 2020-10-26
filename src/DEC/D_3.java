package DEC;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class D_3 {
    public static void main(String[] args) {
        // Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину стороны шестиугольного треугольника: ");
        int a = in.nextInt();
        double s = square(a);
        System.out.println("Площадь шестиугольника: "+s);
    }
    public static double square(int a){
        return Math.pow(a,2)*Math.sqrt(3)*6/4;
    }
}
