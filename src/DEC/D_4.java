package DEC;

import java.util.Scanner;

public class D_4 {
    public static void main(String[] args) {
        //На плоскости заданы своими координатами n точек.
        // Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние.
        // Указание. Координаты точек занести в массив.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество точек: ");
        int n = in.nextInt();
        Integer[][] array = new Integer[n][2];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Координаты " + (i + 1) + " точки: ");
            for (int j = 0; j < 2; j++) {
                array[i][j] = (int) (Math.random() * 2 * 10 - 10);
                if (j == 0) {
                    System.out.print(" X: " + array[i][j]);
                } else {
                    System.out.print(", Y: " + array[i][j]);
                }
            }
            System.out.println();

        }
        //максимальное расстояние между точками
        Double max[][] = max_distance(array);
        System.out.println("Максимальное расстояние между точками: "+max[2][0]);
        System.out.println("Координаты точек: ");
        System.out.println("Первая точка: Х: "+max[0][0]+", Y: "+max[0][1]);
        System.out.println("Вторая точка: Х: "+max[1][0]+", Y: "+max[1][1]);
    }

    public static Double[][] max_distance(Integer[][] arr) {
        double max_d = -999;
        Double[][] couples = new Double[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                double dist = Math.sqrt(Math.pow((arr[i][0] - arr[j][0]), 2) + Math.pow((arr[i][1] - arr[j][1]), 2));
                if (dist > max_d) {
                    max_d = dist;
                    for (int k = 0; k < 2; k++) {
                        couples[0][k] = Double.valueOf(arr[i][k]);
                        couples[1][k] = Double.valueOf(arr[j][k]);
                        couples[2][0]= max_d;
                    }

                }
            }
        }
        return couples;
    }
}
