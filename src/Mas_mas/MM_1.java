package Mas_mas;

import java.util.Arrays;
import java.util.Scanner;

public class MM_1 {
    public static void main(String[] args) {
        //Дана матрица.
        // Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
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
        //System.out.println(Arrays.deepToString(array));
        System.out.println("все нечетные столбцы, у которых первый элемент больше последнего: ");
        //идем по столбцам
        for(int j = 0; j<N; j+=2){
            if(array[0][j]>array[N-1][j]){
                System.out.println("Столбец"+(j+1));
                for (int i =0; i<N; i++){
                    System.out.println(array[i][j]);
                }

            }
            }
    }
}
