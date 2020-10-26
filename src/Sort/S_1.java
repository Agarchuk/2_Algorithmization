package Sort;

import java.util.Arrays;
import java.util.Scanner;

public class S_1 {
    public static void main(String[] args) {

        //Заданы два одномерных массива с различным количеством элементов и натуральное число k.
        // Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
        // при этом не используя дополнительный массив.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите диапазон: ");
        int M = in.nextInt();
        System.out.print("Введите длину 1-го массива: ");
        int n1 = in.nextInt();
        System.out.println();
        Integer[] arr1= new Integer[n1];
        for (int i =0; i<n1;i++){
            arr1[i]=(int)(Math.random()*(2*M)-M);
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.print("Введите длину 2-го массива: ");
        int n2 = in.nextInt();
        System.out.println();
        Integer[] arr2= new Integer[n2];
        for (int i =0; i<n2;i++){
            arr2[i]=(int)(Math.random()*(2*M)-M);
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.print("Введите номер элемента первого массива, после которого будет вставлен второй массив: ");
        int n3 = in.nextInt();
        Integer[] new_array = new Integer[n1+n2];
        System.arraycopy(arr1, 0, new_array, 0, n3);
        System.arraycopy(arr2, 0, new_array, n3, arr2.length);
        System.arraycopy(arr1, n3, new_array, (n3+arr2.length), (arr1.length-n3));
        System.out.println(Arrays.toString(new_array));
    }
}
