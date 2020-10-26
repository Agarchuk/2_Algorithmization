package DEC;

public class D_11 {
    public static void main(String[] args) {
        // Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
        Integer num1 = 1234;
        Integer num2 = 98;
        Integer bigger = big(num1, num2);
        System.out.println("Больше цифр имеет число: "+bigger);
    }
    public static Integer big(Integer num1, Integer num2){
        int bigger =0;
        if(num1.toString().length()>num2.toString().length()){
            bigger = num1;
        } else{
            bigger = num2;
        }
        return bigger;
    }
}
