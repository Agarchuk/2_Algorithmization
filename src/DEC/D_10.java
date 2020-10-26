package DEC;

import java.util.Arrays;

public class D_10 {
    public static void main(String[] args) {
        // Дано натуральное число N.
        // Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
        Integer N = 12634;
        Integer[] arr= elem(N);
        System.out.println(Arrays.toString(arr));
    }
    public  static Integer[] elem(Integer N){
        String s = N.toString();
        int kol = s.length();
        System.out.println(kol);
        Integer[] arr = new Integer[kol];
        for (int i = kol -1; i>0; i--){
            arr[i]= N%10;
            N/=10;
        }
        arr[0] = N;
        return arr;
    }

}
