package Odn_mass;

import java.util.Arrays;
import java.util.Scanner;

public class OM_5 {
    public static void main(String[] args) {
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
        for (int i = 0; i<N; i++){
            if(seq[i]>i){
                System.out.print(seq[i]+" ");
            }
        }
        //System.out.println(Arrays.toString(seq));
    }
}
