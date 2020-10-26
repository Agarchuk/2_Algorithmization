package Sort;

import java.util.Arrays;

public class S_2 {
    public static void main(String[] args) {
        // Даны две последовательности
        //Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
        // Примечание. Дополнительный массив не использовать.
        //первая последовательность
        Integer[] seq1 = new Integer[]{1,3,5,7,9};
        //вторая последовательность
        Integer[] seq2 = new Integer[]{2, 4, 6, 8, 10};
        //новая последовательность
        Integer[] seq_new = new Integer[seq1.length+seq2.length];
        int tmp =0;
        System.arraycopy(seq1,0, seq_new, 0, seq1.length);
        System.arraycopy(seq2, 0, seq_new, seq1.length, seq2.length);
        //сортировка по возрастанию
        for(int i=0; i<seq_new.length; i++){
            for(int j =seq_new.length-1; j>i;j--){
                if(seq_new[j]<seq_new[j-1]){
                    tmp = seq_new[j];
                    seq_new[j] = seq_new[j-1];
                    seq_new[j-1]=tmp;
                }
            }
        }
        System.out.println(Arrays.toString(seq_new));
    }
}
