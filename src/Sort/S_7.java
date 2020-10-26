package Sort;

import java.util.Arrays;

public class S_7 {
    public static void main(String[] args) {
        // Пусть даны две неубывающие последовательности действительных чисел
        //Требуется указать те места, на которые нужно вставлять элементы последовательности в первую последовательность так,
        // чтобы новая последовательность оставалась возрастающей.
        //первая последовательность
        Integer[] seq1 = new Integer[]{1, 3, 5, 7, 9};
        //вторая последовательность
        Integer[] seq2 = new Integer[]{0, 2, 6, 9, 10};
        //новая последовательность
        Integer[] seq_new = new Integer[seq1.length + seq2.length];
        int j = 0;
        int k = 0;
        int i = 0;
        while (i < seq1.length) {
            if (seq2[j] < seq1[i]) {
                seq_new[k] = seq2[j];
                k++;
                j++;
            } else if (seq1[i] < seq2[j]) {
                seq_new[k] = seq1[i];
                i++;
                k++;
            } else {
                seq_new[k] = seq1[i];
                k++;
                i++;
                seq_new[k] = seq2[j];
                k++;
                j++;
            }
        }
        while (j < seq2.length) {
            seq_new[k] = seq2[j];
            k++;
            j++;
        }


        System.out.println(Arrays.toString(seq_new));
    }


}

