package Odn_mass;

import java.util.Arrays;

import static java.util.Collections.replaceAll;
import static java.util.Collections.sort;

public class OM_2 {
    public static void main(String[] args) {
        int n =10;
        int a = 1;
        Integer[] sequence = new Integer[n];
        for(int i = 0; i<n; i++){
            sequence[i]=a;
            a++;
        }
        //вывод массива
        System.out.println(Arrays.toString(sequence));
        int k =5;
        for(int i = 0; i<n; i++){
            if(sequence[i]>k){
                sequence[i]=k;
            }
        }
        System.out.println(Arrays.toString(sequence));



    }
}
