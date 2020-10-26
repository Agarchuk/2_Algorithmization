package DEC;

import java.util.Arrays;
import java.util.Scanner;

public class D_15 {
    public static void main(String[] args) {
        //Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789).
        // Для решения задачи использовать декомпозицию.
        System.out.print("Введите n для n-значного числа: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer init = (int) Math.pow(10, (n - 1));
        for (Integer i = init; i < Math.pow(10, n); i++) {
            String s = check(n, i);
            if(s!=null){
                System.out.println(s);
            }

        }


    }

    public static Integer[] make_arr(int n, Integer i) {
        Integer[] arr = new Integer[n];
        int tmp = 0;
        int z = i.toString().length() - 1;
        tmp = i;
        for (int j = i.toString().length() - 1; j > 0; j--) {
            arr[j] = i % 10;
            i /= 10;
        }
        arr[0] = i;
        return arr;
    }

    public static String check(int n, Integer i) {
        int count = 0;
        Integer[] arr = make_arr(n, i);
        for (int k = 0; k < arr.length - 1; k++) {
            if (arr[k] < arr[k + 1]) {
                count++;
            }
        }
        if (count == (arr.length - 1)) {
            return Arrays.toString(arr);
        } else {
            return null;
        }
    }

}

