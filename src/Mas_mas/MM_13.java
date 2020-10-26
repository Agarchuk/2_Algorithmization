package Mas_mas;

import java.util.Scanner;


public class MM_13 {
    public static void main(String[] args) {
        //Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
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

        for( int j =0; j<N;j++){
            int tmp=0;
            for(int k =0; k<N;k++){
                for(int i=N-1; i>k;i--){
                    if(array[i][j]>array[i-1][j]){
                        tmp = array[i][j];
                        array[i][j] = array[i-1][j];
                        array[i-1][j]=tmp;
                    }
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

        for( int j =0; j<N;j++){
            int tmp=0;
            for(int k =0; k<N;k++){
                for(int i=N-1; i>k;i--){
                    if(array[i][j]<array[i-1][j]){
                        tmp = array[i][j];
                        array[i][j] = array[i-1][j];
                        array[i-1][j]=tmp;
                    }
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
