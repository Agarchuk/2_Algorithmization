package Sort;

import java.util.Arrays;

public class S_8 {
    public static void main(String[] args) {
        //.Даны дроби
        // Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания
        Integer[] p = new Integer[]{1, 2, 4, 7, 23, 4, 5, 11};
        Integer[] q = new Integer[]{3, 8, 4, 1, 6, 1, 3, 4};
        //находим общий знаменатель
        //1. находим максимальный знаменатель
        int max = -999;
        for (int i = 0; i < q.length; i++) {
            if (q[i] > max) {
                max = q[i];
            }
        }
        //2. Проверяем, делится ли это число на каждый из остальных знаменателей.
        int count = 0;
        int l = 1;
        int max_tmp = 0;
        for (int i = 0; i < q.length; i++) {
            max_tmp = max * l;
            if (max_tmp % q[i] != 0) {
                System.out.println(max_tmp + " не НОЗ");
                l++;
                i = 0;
            }
        }
        System.out.println("НОЗ: " + max_tmp);
        //подтягиваем числитель к НОЗ
        for (int i = 0; i < q.length; i++) {
            //находим число, на которое нужно домножить числитель
            int num = max_tmp / q[i];
            p[i] *= num;
            System.out.print(p[i]+"/"+max_tmp+" ");
        }
        System.out.println();
        //отсортируем q методом вставки
        for (int i = 1; i < p.length; i++) {
            int temp = p[i];
            int index = search(p, 0, i - 1, temp);
            for (int j =i; j>index;j-- ){
                p[i]=p[i-1];
            }
            p[index]=temp;

        }
        for (int i = 0; i < q.length; i++) {
            System.out.print(p[i] + "/" + max_tmp + " ");
        }

    }

    public static int search(Integer[] array, int index1, int index2, int tmp) {
        int index = 0;
        while (index1 < index2) {
            int middle_index = (index1 + index2) / 2;
            if (array[middle_index] < tmp) {
                index1 = middle_index + 1;
                index = index1;
            } else if (array[middle_index] > tmp) {
                index2 = middle_index;
                index = index2;
            } else if (array[middle_index] == tmp) {
                index = middle_index - 1;
                return index;
            }

        }
        if(array[index]<tmp){
            index++;
        }
        return index;
    }
}
