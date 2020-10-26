package DEC;

import java.util.Scanner;

public class D_8 {
    public static void main(String[] args) {
        // Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
        // Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m
        Scanner in = new Scanner(System.in);
        System.out.print("Задайте длину массива кратную 3: ");
        int n = in.nextInt();
        Integer[] seq = new Integer[n];
        for (int i = 0; i < n; i++) {
            seq[i] = (int) (Math.random() * 2 * 10 - 10);
            System.out.print(seq[i] + " ");
        }
        System.out.println();
        //вычисляем суммы триплетов
        for (int i =0; i<n; i+=3){
            int sum = sum3(seq, i);
            System.out.println("Сумма триплета \""+(seq[i])+", "+seq[i+1]+", "+seq[i+2]+"\" равна: "+sum);
        }

    }

    public static int sum3(Integer[] array, int index) {
        int sum = 0;
        for (int i = index; i<index+3; i++){
            sum+=array[i];
        }
    return sum;
    }

}
