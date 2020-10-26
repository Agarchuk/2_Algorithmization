package Mas_mas;

import java.util.Scanner;

public class MM_14 {
    public static void main(String[] args) {
        //. Сформировать случайную матрицу m x n,
        // состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.
        System.out.print("Введите число столбцов матрицы: ");
        Scanner in = new Scanner(System.in);
        int N_row = in.nextInt();
        System.out.print("Введите число строк матрицы: ");
        int N_str = in.nextInt();
        Integer[][] array = new Integer[N_row][N_str];
        for (int j = 0; j < N_str; j++) {
            for (int i = 0; i < N_row; i++) {
                if(i>=j){
                    array[i][j] = 1;
                }else{
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
