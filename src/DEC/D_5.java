package DEC;

public class D_5 {
    public static void main(String[] args) {
        // Составить программу, которая в массиве A[N] находит второе по величине число
        // (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
        Integer[] arr = new Integer[]{1,2,4,3,6,13,2,11,4,12,1,16,14,2,1};
        int max = -999;
        int pre_max = -999;
        for (int i = 0; i<arr.length;i++){
            if(arr[i]>max){
                pre_max = max;
                max = arr[i];
            } else if(arr[i]>pre_max&arr[i]<max){
                pre_max = arr[i];
            }

        }
        System.out.println("число, которое меньше максимального элемента массива, но больше всех других элементов: "+pre_max);
    }
}
