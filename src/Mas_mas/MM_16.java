package Mas_mas;

import java.util.Arrays;
import java.util.Scanner;

public class MM_16 {
    public static void main(String[] args) {
        //Магическим квадратом порядка n называется квадратная матрица размера nxn,
        // составленная из чисел 1, 2, 3, ..., 2 n так, что суммы по каждому столбцу,
        // каждой строке и каждой из двух больших диагоналей равны между собой.
        // Построить такой квадрат. Пример магического квадрата порядка 3:

        //создаем массив n*n
        Scanner in = new Scanner(System.in);
        System.out.print("Введите порядок магического квадрата: ");
        int n = in.nextInt();
        Integer[][] arr0 = make_arr(n);
        print_arr(arr0);

        //создаем магический квадрат
        if(n%2==1){
            Integer[][] arr1 = make_magic_arr(arr0);
            System.out.println("Магический квадрат: ");
            print_arr(arr1);
        } else{
            Integer[][] arr1 = make_magic_arr_even(arr0);
            System.out.println("Магический квадрат: ");
            print_arr(arr1);
        }

    }

    public static Integer[][] make_arr(int n){
        Integer[][] arr = new Integer[n][n];
        for (int i = 0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j]=i*n+(j+1);
            }

        }
        return arr;


    }

    public static Integer[][] make_magic_arr_even(Integer[][] arr0){
        Integer[][] arr_magic = new Integer[arr0.length][arr0.length];
        for (int i =0; i<arr0.length; i++){
            for (int j =0; j<arr0.length; j++){
                if(i!=j & i!=((arr0.length-1)-j)){
                    arr_magic[i][j]=arr0[(arr0.length-1)-i][(arr0.length-1)-j];
                } else
                    arr_magic[i][j]=arr0[i][j];
            }
        }
        return arr_magic;
    }

    public static Integer[][] make_magic_arr(Integer[][] arr0){
        Integer[][] arr_magic = new Integer[arr0.length][arr0.length];
        int n_str_i = arr0.length/2;
        int n_row_i = arr0.length/2+1;

        for (int i =0; i<arr0.length; i++){
           int n_row_j = n_row_i;
            int n_str_j = n_str_i;
            for (int j = 0; j<arr0.length; j++){
                arr_magic[n_str_j][n_row_j]= arr0[i][j];
                //System.out.println(arr0[n_str_j][n_row_j]);
                n_str_j--;
                n_row_j++;
                if(n_str_j==(-1)){
                    n_str_j = arr0.length-1;}

                if(n_row_j==(arr0.length)){
                    n_row_j = 0;
                }
            }
            n_str_i++;
            n_row_i++;
            if(n_str_i==(-1)){
                n_str_i= arr0.length-1;
            } else if(n_str_i==arr0.length){
                n_str_i=0;
            }
            if(n_row_i==(arr0.length)){
                n_row_i = 0;
            }
        }
        return arr_magic;
    }

    public static void print_arr(Integer[][] arr){
        for (int i = 0; i<arr.length;i++){
            for (int j =0; j<arr.length; j++){
                if(arr[i][j]<10){
                    System.out.print(arr[i][j]+"  ");
                } else{
                    System.out.print(arr[i][j]+" ");
                }

            }
            System.out.println();
        }
    }
}
