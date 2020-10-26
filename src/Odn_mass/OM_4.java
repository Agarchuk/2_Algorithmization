package Odn_mass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OM_4 {
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
        int min = 999;
        int num_min =0;
        int max = -999;
        int num_max=0;
        for(int i =0; i<N; i++){
            if(seq[i]<min){
                min = seq[i];
                num_min = i;
            }
            if(seq[i]>max){
                max = seq[i];
                num_max=i;
            }
        }
//        System.out.println("min "+min);
//        System.out.println("num min "+num_min);
//        System.out.println("num max "+num_max);
//        System.out.println("max " +max);
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int i = 0; i<N; i++){
            //System.out.println("i " +i);
            if(i==num_min){
                //System.out.println("i=num_min");
                tmp.add(max);
            } else if (i == num_max) {
                tmp.add(min);
            }else{
                tmp.add(seq[i]);
            }
            //System.out.println(tmp.get(i));
        }
        Integer[] new_seq = tmp.toArray(new Integer[N]);
        System.out.print(Arrays.toString(new_seq));
    }
}
