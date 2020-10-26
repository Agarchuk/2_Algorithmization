package Odn_mass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OM_8 {
    public static void main(String[] args) {
        //Дана последовательность целых чисел
        // Образовать новую последовательность, выбросив из исходной те члены, которые равны min
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
        int min = 999;
        for (int i=0; i<N; i++){
            if(seq[i]<min){
                min = seq[i];
            }
        }
        System.out.println("min: "+min);
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int i=0; i<N; i++){
            if(seq[i]!=min){
                tmp.add(seq[i]);
            }
        }
        Integer[] new_array = new Integer[tmp.size()];
        for (int i=0; i<tmp.size(); i++){
            new_array[i]=tmp.get(i);
        }
        System.out.println(Arrays.toString(new_array));
    }
}
