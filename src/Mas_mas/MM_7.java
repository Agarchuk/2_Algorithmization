package Mas_mas;

import java.util.Arrays;
import java.util.Scanner;

public class MM_7 {
    public static void main(String[] args) {
        //Сформировать квадратную матрицу порядка N по правилу:
       //и подсчитать количество положительных элементов в ней.
        System.out.print("Введите размерность матрицы: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Double[][] array = new Double[N][N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j]=Math.sin((Math.pow(i,2)-Math.pow(j,2))/N);
                if(array[i][j]>0){
                    count++;
                }
                System.out.print(array[i][j]+"           ");
            }
            System.out.println();
        }
        System.out.println("Количество положительных элементов: "+count);

    }
}
