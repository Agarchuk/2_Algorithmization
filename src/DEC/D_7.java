package DEC;

public class D_7 {
    public static void main(String[] args) {
        //Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
        Integer[] nums = new Integer[]{1,2,3,4,5,6,7,8,9};
        int sum = factorial_odd(nums);
        System.out.println(sum);
    }
    public static int factorial_odd(Integer[] array){
        int fact = 1;
        int sum_fact = 0;
        for (int i =0; i<array.length;i++){
            fact*=array[i];
            System.out.println("Факториал "+array[i]+" равен: "+fact);
            if(array[i]%2==1){
                sum_fact+=fact;
            }
        }
        return sum_fact;
    }

}
