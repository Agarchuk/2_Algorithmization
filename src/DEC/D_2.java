package DEC;

import java.util.Scanner;

public class D_2 {
    public static void main(String[] args) {
        // Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
        Scanner in = new Scanner((System.in));
        System.out.print("Введите первое число: ");
        int first = in.nextInt();
        System.out.print("\nВведите второе число: ");
        int second = in.nextInt();
        System.out.print("Введите третье число: ");
        int third = in.nextInt();
        System.out.print("Введите четвертое число: ");
        int fourth = in.nextInt();

        Integer[] arr = new Integer[]{first,second,third,fourth};
        int nod = NOD(arr);
        System.out.println("NOD: "+nod);
    }
    public static int NOD(Integer[] array){
        for (int i = 0; i<array.length-1;i++){
            while (array[i]!=0&array[i+1]!=0){
                if(array[i]>array[i+1]){
                    array[i]%=array[i+1];
                }else{
                    array[i+1]%=array[i];
                }
            }
            //System.out.println("i: "+array[i]);
            //System.out.println("i+1 "+array[i+1]);
            array[i+1]= array[i]+array[i+1];
            //System.out.println("nod: "+array[i+1]);

        }
        return array[array.length-1];

    }
}
