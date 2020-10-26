package DEC;

import java.util.Arrays;
import java.util.Scanner;

public class D_14 {
    public static void main(String[] args) {
        //Натуральное число, в записи которого n цифр, называется числом Армстронга,
        // если сумма его цифр, возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
        // Для решения задачи использовать декомпозицию.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число k, до которого производить поиск числ Армстронга: ");
        Integer k = in.nextInt();
        search(k);
    }

    public static Integer[] make_arr(Integer num) {
        Integer[] arr = new Integer[num.toString().length()];
        for (int i = num.toString().length() - 1; i > 0; i--) {
            arr[i] = num % 10;
            num /= 10;
        }
        arr[0] = num;
    //    System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void search(Integer k){

        for (Integer i =1; i<k; i++){
            int sum = 0;
            int sum_pow = 0;
            //System.out.println("Число: "+ i);
            Integer[] arr = make_arr(i);
            for (int j =0; j<arr.length; j++){
               int num_pow = (int) Math.pow(arr[j], arr.length);
                sum_pow+=num_pow;
            }
            //System.out.println("Сумма: "+sum);
            //System.out.println("n: "+i.toString().length());

            //System.out.println("sum^n: "+num_pow);
            if(sum_pow==i){
                System.out.println(i+" - число Армстронга");
            }

        }
    }

}
