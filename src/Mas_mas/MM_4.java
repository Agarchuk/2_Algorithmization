package Mas_mas;

import java.util.Scanner;

public class MM_4 {
    public static void main(String[] args) {
        //Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        System.out.print("Введите размерность матрицы: ");
        Scanner in =new Scanner(System.in);
        int N = in.nextInt();
        Integer[][] array = new Integer[N][N];

        for(int i = 0; i<N; i++){
            int num =1;
            int reverse_num = N;
            for (int j = 0; j<N; j++){
                if(i%2==0){
                    array[i][j]=num;
                    num++;
                } else if(i%2==1|i==0){
                    array[i][j]=reverse_num;
                    reverse_num--;
                }

                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
