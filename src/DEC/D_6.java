package DEC;

public class D_6 {
    public static void main(String[] args) {
        // Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
        Integer[] nums = new Integer[]{36,12,8};
        //поиск НОД
        String nod = NOD_is_1(nums);
        System.out.println(nod);
        
    }
    public static String NOD_is_1(Integer[] array){
        int num1 = 0;
        int num2 =0;
        for(int i =0; i <array.length-1; i++){
            num1 = array[i];
            num2 = array[i+1];
            while (num1!=0&num2!=0){
                if(num1>num2){
                    num1%=num2;
                } else {
                    num2%=num1;
                }

            }
            array[i+1]=num1+num2;
            System.out.println("NOD: "+(num1+num2));
        }
        System.out.println(num1+num2);
        if((num1+num2)==1){
            return "Числа взаимно простые";
        } else{
            return "Числа не взаимно простые. НОД: "+(num1+num2);
        }
    }
}
