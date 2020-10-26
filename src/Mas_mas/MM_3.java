package Mas_mas;

import java.util.Scanner;

public class MM_3 {
    public static void main(String[] args) {
        //Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
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
        System.out.print("Какую строку вывести? ");
        int num_str = in.nextInt();
        for (int j =0; j<N; j++){
            System.out.print(array[num_str-1][j]+" ");
        }
        System.out.println();
        System.out.println("Какой столбец вывести? ");
        int num_row = in.nextInt();
        for(int i =0; i<N; i++){
            System.out.println(array[i][num_row-1]);
        }
    }
}
