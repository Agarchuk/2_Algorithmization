package Odn_mass;

import java.util.Arrays;
import java.util.Scanner;

public class OM_6 {
    public static void main(String[] args) {
        // Задана последовательность N вещественных чисел. Вычислить сумму чисел,
        // порядковые номера которых являются простыми числами.
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
        double sum=0;

        for(int i = 0; i<N; i++){
            int count = 0;
            for (int j =1; j <10; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2|count==1){
                System.out.println("Простое число: "+seq[i]);
                sum+=seq[i];
            }
        }
        System.out.println("Сумма: "+sum);

     }
}
