package Sort;

import java.util.Arrays;

public class S_3 {
    public static void main(String[] args) {
        // Сортировка выбором.
        // Дана последовательность чисел
        // Требуется переставить элементы так, чтобы они были расположены по убыванию.
        // Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место,
        // а первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется.
        // Написать алгоритм сортировки выбором.

        //возрастающая последовательность
        Integer[] seq1 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        //сортировка выбором

        for (int j = 0; j < seq1.length; j++) {
            int max = -999;
            int index_max = 0;
            for (int i = j; i < seq1.length; i++) {
                if (seq1[i] > max) {
                    max = seq1[i];
                    index_max = i;
                }
 //               System.out.println("max: "+max);
            }
            seq1[index_max] = seq1[j];
            seq1[j] = max;
        }
        System.out.println(Arrays.toString(seq1));
    }
}
