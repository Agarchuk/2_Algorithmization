package DEC;

public class D_9 {
    public static void main(String[] args) {
        // Даны числа X, Y, Z, Т — длины сторон четырехугольника.
        // Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой
        double X = 3;
        double Y = 2.6;
        double Z = 3.6;
        double T = 1.6;
        double s = square(X, Y, Z, T);
        System.out.println("Площадь: "+s);
    }
    public static double square(double X, double Y, double Z, double T){
        double s1 = X*Y/2;
        double c = Math.sqrt((Math.pow(X,2))+Math.pow(Y,2));
        double p = (Z+T+c)/2;
        double s2 = Math.sqrt(p*(p-Z)*(p-T)*(p-c));
        double s = s1+s2;
        return s;
    }
}
