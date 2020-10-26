package Odn_mass;

import java.util.Arrays;
import java.util.Scanner;

public class OM_7 {
    public static void main(String[] args) {
        // Даны действительные числа n aaa ,,, 2 1  . Найти
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов N: ");
        int N = in.nextInt();
        System.out.print("Введите диапазон чисел: ");
        int M = in.nextInt();
        Double[] seq = new Double[N];
        for (int i = 0; i<N; i++){
            seq[i]=Math.random()*(2*M)-M;
        }
        System.out.println(Arrays.toString(seq));
        //создаем новую послдовательност
        Double[] new_array = new Double[N/2];
        int j = N-1;
        for(int i =0; i<N/2; i++){
                //System.out.println(seq[i]);
                //System.out.println(seq[j]);
            new_array[i] = seq[i]+seq[j];
                j--;
            //System.out.println("new: " +new_array[i]);
            }
        System.out.println(Arrays.toString(new_array));
        Double max = new Double(-999);
        for(int i =0; i<new_array.length; i++){
            if(new_array[i]>max){
                max=new_array[i];
            }
        }
        System.out.println("максимальный элемент "+max);
    }
}
