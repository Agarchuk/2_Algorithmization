package DEC;

public class D_17 {
    public static int count = 0;

    public static void main(String[] args) {
        //Из заданного числа вычли сумму его цифр.
        // Из результата вновь вычли сумму его цифр и т.д.
        // Сколько таких действий надо произвести, чтобы получился нуль?
        // Для решения задачи использовать декомпозицию.
        Integer num = 15;
        System.out.println("count: "+eveluate_count(num));


    }

    public static int Sum_Of_Numbers(Integer num){
        int sum = 0;
        for (int i = num.toString().length()-1; i>0;i--){
            sum+=num%10;
            num/=10;
        }
        sum+=num;
        return sum;
    }

    public static int Decrease_num(Integer sum, Integer num){
        count++;
        return num-sum;
    }

    public static int eveluate_count(Integer num){
        while(num!=0){
            System.out.println("Число: "+ num);
            int sum_of_numbers = Sum_Of_Numbers(num);
            System.out.println("Сумма цифр числа: "+sum_of_numbers);
            num = Decrease_num(sum_of_numbers, num);
        }
        return count;
    }
}
