package Sort;

import java.util.Arrays;

public class S_5 {
    public static void main(String[] args) {
        //сортировка вставками
        //Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска.
        // Двоичный поиск оформить в виде отдельной функции.
        Integer[] seq1 = new Integer[]{10, 2, 30, 4, 5, 60, 7, 80, 90, 10};
        // i - отсортированный массив
        for (int i = 1; i < seq1.length; i++) {
            int tmp = seq1[i];
            int index = search(seq1, 0, i-1, tmp);
            System.out.println("index "+index);
            for (int j = i; j>index; j--){
                seq1[j]=seq1[j-1];
            }
            seq1[index]=tmp;
            System.out.println(Arrays.toString(seq1));
        }

    }
    //функция двоичного поиска
    public static int search(Integer[] array, int index1, int index2, int item){
       // System.out.println("поиск");
        int index =0;
        while(index1<index2){
           // System.out.println("цикл");
            int middle_index = (index1+index2)/2;
            System.out.println("middle: "+middle_index);
            if(array[middle_index]==item){
                index =  middle_index;
                return index;
            }
            if(array[middle_index]>item){
                index2 = middle_index-1;
                index = middle_index-1;
            } else if(array[middle_index]<item){
                index1=middle_index+1;
                index = middle_index+1;
            }
        }
        if(array[index]<item){
                index++;
            }
        return index;


    }
}


