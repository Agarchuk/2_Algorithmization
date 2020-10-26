package Odn_mass;

import java.util.Arrays;
import java.util.Scanner;

public class OM_10 {
    public static void main(String[] args) {
        //Дан целочисленный массив с количеством элементов п.
        // Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
        // Примечание. Дополнительный массив не использовать.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов N: ");
        int N = in.nextInt();
        System.out.print("Введите диапазон чисел: ");
        int M = in.nextInt();
        Integer[] seq = new Integer[N];
        for (int i = 0; i < N; i++) {
            seq[i] = (int) (Math.random() * (2 * M) - M);
        }
        System.out.println(Arrays.toString(seq));
        int index = 1;
        for (int i = 2; i < N; i += 2) {
            if (index < N / 2) {
                seq[index] = seq[i];
                index++;
            }
        }
        for (int k = N / 2; k < N; k++) {
            seq[k] = 0;


        }
        System.out.println(Arrays.toString(seq));
    }
}
