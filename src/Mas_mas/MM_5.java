package Mas_mas;

import java.util.Scanner;

public class MM_5 {
    public static void main(String[] args) {
        //Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        System.out.print("Введите размерность матрицы: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Integer[][] array = new Integer[N][N];
        int N_row = N;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j >= N_row) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = i + 1;
                }
                System.out.print(array[i][j] + " ");
            }
            N_row--;
            System.out.println();
        }
    }
}
