package Odn_mass;

import java.util.Arrays;
import java.util.Scanner;

public class OM_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность массива N: ");
        int N = in.nextInt();
        System.out.println("Введите диапазон чисел M: ");
        int M = in.nextInt();
        int a = -M;
        int b = M;
        Integer[] sequence = new Integer[N];
        for (int i = 0; i < N; i++) {
            sequence[i] = (int) (Math.random() * (b - a) + a);
        }
        System.out.println(Arrays.toString(sequence));
        int n_neg=0;
        int n_zero=0;
        int n_pos=0;
        for (int i = 0; i < N; i++) {
            if(sequence[i]<0){
                n_neg++;
            } else if(sequence[i]==0){
                n_zero++;
            } else{
                n_pos++;
            }
        }
        System.out.println("Количство отрицательных элементов: "+n_neg);
        System.out.println("Количство нулевых элементов: "+n_zero);
        System.out.println("Количство положительных элементов: "+n_pos);
    }
}
