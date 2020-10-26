package DEC;

import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.Scanner;

public class D_16 {
    public static int count_odd = 0;


    public static void main(String[] args) {
        //Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
        // Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
        System.out.print("Введите n для n-значного числа: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for(int i = (int)Math.pow(10,(n-1)); i<Math.pow(10,n); i++){
            if(check_odd(i)==true){
                System.out.println("Число с нечетными цифрами: "+ i);
                sum+=i;
            }
        }
        System.out.println("Сумма: "+sum);
        System.out.println("В сумме "+nums_even(sum)+" четных цифр");
    }


    public static boolean check_odd(Integer num){
        count_odd=0;
        int count = 0;
        Integer[] arr = make_arr(num);
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2==1){
                count++;
            }
        }
        if (count==arr.length){
            count_odd++;
            return true;
        } else {
            return false;
        }
    }
    public static int nums_even(Integer num){
        int count_even =0;
        for (int i =num.toString().length()-1; i>0;i--){
            int number = num%10;
            num/=10;
            if(number%2==0){
                count_even++;
            }
        }
        return count_even;
    }

    public static Integer[] make_arr(Integer num){
        Integer[] arr = new Integer[num.toString().length()];
        for(int i = num.toString().length()-1; i>0; i--) {
            arr[i]=num%10;
            num/=10;
        }
        arr[0]=num;
        return arr;
    }
}
