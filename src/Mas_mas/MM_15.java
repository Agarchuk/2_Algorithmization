package Mas_mas;

import java.util.Scanner;

public class MM_15 {
    public static void main(String[] args) {
        //Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
        System.out.print("Введите размерность матрицы: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.print("Введите диапазон: ");
        int M = in.nextInt();
        Integer[][] array = new Integer[N][N];
        int max = -999;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = (int) (Math.random() * (2 * M) - M);
                System.out.print(array[i][j] + " ");
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            System.out.println();
        }
        System.out.print("максимальный элемент матрицы: " + max+"\n");
        System.out.println("все нечетные элементы заменяем на максимальный");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(Math.abs(array[i][j])%2==1){
                    array[i][j]=max;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
