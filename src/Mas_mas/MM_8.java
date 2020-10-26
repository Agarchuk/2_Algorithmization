package Mas_mas;

import java.util.Scanner;

public class MM_8 {
    public static void main(String[] args) {
        //В числовой матрице поменять местами два столбца любых столбца,
        // т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
        // а его элементы второго переместить в первый.
        // Номера столбцов вводит пользователь с клавиатуры.
        System.out.print("Введите размерность матрицы: ");
        Scanner in =new Scanner(System.in);
        int N = in.nextInt();
        System.out.print("Введите диапазон: ");
        int M = in.nextInt();
        Integer[][] array = new Integer[N][N];
        for(int i = 0; i<N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = (int) (Math.random() * 2 * M - M);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Введите номера столбцов, которые хотите поменять!");
        System.out.print("Первый: ");
        int row1= in.nextInt();
        System.out.print("Второй: ");
        int row2= in.nextInt();
        int tmp =0;
        for(int i = 0; i<N; i++) {
            tmp = array[i][row1-1];
            array[i][row1-1]=array[i][row2-1];
            array[i][row2-1] = tmp;
        }
        System.out.println("Новый массив: ");
        for(int i = 0; i<N; i++) {
            for (int j = 0; j < N; j++) {
               System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
