package Mas_mas;

import java.util.Scanner;

public class MM_2 {
    public static void main(String[] args) {
        // Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
        System.out.print("Введите размерность матрицы: ");
        Scanner in =new Scanner(System.in);
        int N = in.nextInt();
        System.out.print("Введите диапазон: ");
        int M = in.nextInt();
        Integer[][] array = new Integer[N][N];
        for(int i = 0; i<N; i++){
            for (int j = 0; j<N; j++){
                array[i][j]=(int)(Math.random()*2*M-M);
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Диагональные элементы: ");
        int j =0;
        for(int i = 0; i<N; i++) {
            System.out.print(array[i][j]+" ");
            j++;
        }
    }
}
