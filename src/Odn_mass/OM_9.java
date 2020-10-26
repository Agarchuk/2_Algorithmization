package Odn_mass;

import java.util.Arrays;
import java.util.Scanner;

public class OM_9 {
    public static void main(String[] args) {
        // В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
        // Если таких чисел несколько, то определить наименьшее из них.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов N: ");
        int N = in.nextInt();
        System.out.print("Введите диапазон чисел: ");
        int M = in.nextInt();
        Integer[] seq = new Integer[N];
        for (int i = 0; i<N; i++){
            seq[i]=(int)(Math.random()*(2*M)-M);
        }
        System.out.println(Arrays.toString(seq));
        int count = 0;
        int freq_number = 0;
        for(int i =0; i<N;i++){
            int current_count=0;
            for(int j = 0; j<N; j++){
                if(seq[j]==seq[i]){
                    current_count++;
                }
            }
            if(current_count>count){
                count=current_count;
                freq_number=seq[i];
            }else if(current_count==count){
                if(seq[i]<freq_number){
                    freq_number=seq[i];
                }
            }

        }
        System.out.println("Наиболее часто встречающееся чилос: "+freq_number);
        System.out.println("Число "+freq_number+" встречается "+ count+" раз");
    }
}
