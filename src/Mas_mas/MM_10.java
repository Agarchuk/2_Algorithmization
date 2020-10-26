package Mas_mas;

import java.util.Scanner;

public class MM_10 {
    public static void main(String[] args) {
        // Найти положительные элементы главной диагонали квадратной матрицы.
        System.out.print("Введите размерность матрицы: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.print("Введите диапазон: ");
        int M = in.nextInt();
        Integer[][] array = new Integer[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = (int) (Math.random() * (2*M)-M);
                System.out.print(array[i][j] + "        ");
            }
            System.out.println();
        }
        System.out.println("положительные элементы главной диагонали: ");
        int j =0;
        for (int i = 0; i < N; i++) {
            if(array[i][j]>0){
                System.out.print(array[i][j] + " ");
            }
            j++;
        }
    }
}
