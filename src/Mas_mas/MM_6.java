package Mas_mas;

import java.util.Scanner;

public class MM_6 {
    public static void main(String[] args) {
        //Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        System.out.print("Введите размерность матрицы: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Integer[][] array = new Integer[N][N];
        int N_row = N;
        for (int i = 0; i < N / 2; i++) {
            for (int j = 0; j < N; j++) {
                if (j < i|j>(N-i-1)) {
                    array[i][j] = 0;
                } else{
                    array[i][j] = 1;
                }
            }
        }
        for (int i = N - 1; i > N / 2-1; i--) {
            for (int j = 0; j < N; j++) {
                if (j < (N-i-1)|j>i) {
                    array[i][j] = 0;
                } else{
                    array[i][j] = 1;
                }
            }
        }
     for (int i =0; i<N;i++){
         for(int j=0; j<N;j++){
             System.out.print(array[i][j]+" ");
         }
         System.out.println();
     }
    }
}