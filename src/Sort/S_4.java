package Sort;

import java.util.Arrays;

public class S_4 {
    public static void main(String[] args) {
        //Сортировка обменами.
        // Дана последовательность чисел n aaa  2 1 .
        // Требуется переставить числа в порядке возрастания.
        // Для этого сравниваются два соседних числа 1 +ii aиa .
        // Если 1 + ii a a , то делается перестановка.
        // Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
        // Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

        //ЭТО СОРТИРОВКА ПУЗЫРЬКОМ
        //возрастающая последовательность
        Integer[] seq1 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //сортировка пузырьком
        int tmp = 0;
        for (int i = 0; i<seq1.length;i++){
            for (int j = seq1.length-1; j>i;j--){
                if(seq1[j]>seq1[j-1]){
                    tmp = seq1[j];
                    seq1[j] = seq1[j-1];
                    seq1[j-1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(seq1));
    }
}