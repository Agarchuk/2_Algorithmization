package Mas_mas;

import java.util.Scanner;

public class MM_11 {
    public static void main(String[] args) {
        // Матрицу 10x20 заполнить случайными числами от 0 до 15.
        // Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
        int M = 15;
        Integer[][] array = new Integer[10][20];
        for (int i = 0; i < 10; i++) {
            System.out.print("строка "+(i+1)+": ");
            for (int j = 0; j < 20; j++) {
                array[i][j] = (int) (Math.random() * M);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Строки, в которых число 5 встречается три и более раз: ");
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < 20; j++) {
                if (array[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.println((i + 1));
            }
        }
    }
}
