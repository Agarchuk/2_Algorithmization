package DEC;

import java.util.Scanner;

public class D_1 {
    public static void main(String[] args) {
        //Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел
        Scanner in = new Scanner((System.in));
        System.out.print("Введите первое число: ");
        int first = in.nextInt();
        System.out.print("\nВведите второе число: ");
        int second = in.nextInt();
        int nod = NOD(first, second);
        System.out.println("NOD: "+nod);
        int nok=NOK(first,second,nod);
        System.out.println("NOK: "+ nok);
    }
    public static int NOD(int num1, int num2){
        while (num1!=0&num2!=0){
            if(num1>num2){
                num1%=num2;
            } else{
                num2%=num1;
            }
        }
        return (num1+num2);

    }
    public static int NOK(int num1, int num2, int NOD){
        return num1*num2/NOD;
    }
}
