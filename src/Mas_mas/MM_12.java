package Mas_mas;

import java.util.Scanner;

public class MM_12 {
    public static void main(String[] args) {
        //Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
        System.out.print("Введите размерность матрицы: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.print("Введите диапазон: ");
        int M = in.nextInt();
        Integer[][] array = new Integer[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = (int) (Math.random() * (2*M)-M);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("после сортировки по возрастанию");
        int tmp=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <N; j++) {
                for(int k = N-1; k>j;k--)
                if (array[i][k] < array[i][k - 1]) {
                    tmp = array[i][k];
                    array[i][k] = array[i][k - 1];
                    array[i][k - 1] = tmp;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("после сортировки по убыванию");
        tmp=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <N; j++) {
                for(int k = N-1; k>j;k--)
                    if (array[i][k] > array[i][k - 1]) {
                        tmp = array[i][k];
                        array[i][k] = array[i][k - 1];
                        array[i][k - 1] = tmp;
                    }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
