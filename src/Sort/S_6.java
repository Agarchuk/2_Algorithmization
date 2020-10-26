package Sort;

import java.util.Arrays;

public class S_6 {
    public static void main(String[] args) {
        // Сортировка Шелла. Дан массив n действительных чисел.
        // Требуется упорядочить его по возрастанию.
        // Делается это следующим образом: сравниваются два соседних элемента ai и ai+1.
        // Если ai<=ai+1, то продвигаются на один элемент вперед.
        // Если ai>ai+1, то производится перестановка и сдвигаются на один элемент назад.
        // Составить алгоритм этой сортировки.
        Integer[] seq1 = new Integer[]{10, 2, 30, 4, 5, 60, 7, 80, 90, 10};
        for(int i = 0; i<seq1.length-1;i++){
            if(seq1[i]>seq1[i+1]){
                int tmp = seq1[i];
                seq1[i]=seq1[i+1];
                seq1[i+1]=tmp;
                if(i==0){
                    i--;
                }else{
                    i-=2;
                }

            }
        }
        System.out.println(Arrays.toString(seq1));

    }
}
