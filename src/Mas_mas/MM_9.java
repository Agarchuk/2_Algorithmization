package Mas_mas;

import java.util.Scanner;

public class MM_9 {
    public static void main(String[] args) {
        //  Задана матрица неотрицательных чисел.
        //  Посчитать сумму элементов в каждом столбце.
        //  Определить, какой столбец содержит максимальную сумму.
        System.out.print("Введите размерность матрицы: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.print("Введите диапазон: ");
        int M = in.nextInt();
        Integer[][] array = new Integer[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = (int) (Math.random() * (M));
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int max_sum=0;
        int j_max=0;
        for (int j = 0; j < N; j++) {
            int sum = 0;
            System.out.print("Сумма элементов в " + (j + 1) + " столбце ");
            for (int i = 0; i < N; i++) {
                sum += array[i][j];
            }
            System.out.println(sum);
            if(sum>max_sum){
                max_sum=sum;
                j_max = j;
            }
        }
        System.out.println("Столбец № "+(j_max+1)+" содержит максимальную сумму");
    }
}
