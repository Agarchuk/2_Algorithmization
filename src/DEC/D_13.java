package DEC;

import java.util.Scanner;

public class D_13 {
    public static void main(String[] args) {
        //Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
        // Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
        // Для решения задачи использовать декомпозицию
        Scanner in = new Scanner((System.in));
        System.out.print("Введите n для отрезка чисел [n, 2n]: ");
        int n = in.nextInt();
        Integer[] arr = new Integer[n+1];
        arr = make_arr(n, arr);
        search(arr);

    }
    public static Integer[] make_arr(int n, Integer[] arr){
        for (int i = 0; i<(arr.length); i++){
            arr[i]=n;
            n++;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return arr;
    }
    public static void search(Integer[] arr){
        for (int i = 0; i<arr.length; i++){
            int count =0;
            System.out.print("Пара близнец для "+arr[i]+": ");
            for (int j = 0; j<arr.length; j++){
                if((arr[j]-arr[i])==2){
                    System.out.println(arr[j]);
                    count++;
                }
            }
            if(count==0){
                System.out.println("Нет");
            }
        }

    }
}
