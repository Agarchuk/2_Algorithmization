package DEC;

import java.util.Arrays;

public class D_12 {
    public static void main(String[] args) {
        //Даны натуральные числа К и N.
        // Написать метод(методы) формирования массива А,
        // элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
        int K= 16;
        int N = 5;
        int len = K/N;
        if(K%N!=0){
            len++;
        }
        Integer[] arr = new Integer[len];
        arr= make_new_arr(K, N, len);
        System.out.println(Arrays.toString(arr));
    }
    public static Integer[] make_new_arr(int K, int N, int len){

        System.out.println("len: "+len);
        Integer[] arr = new Integer[len];
        for(int i = 0; i<len; i++){
            if(K>N){
                arr[i]=N;
                K-=N;
            } else{
                arr[i]=K;
            }
            System.out.println(arr[i]);
        }

        return arr;

    }
}
