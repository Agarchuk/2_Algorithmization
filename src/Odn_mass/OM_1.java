package Odn_mass;

public class OM_1 {
    public static void main(String[] args) {
        Integer [] array = new Integer[]{1,2,3,4,5,6};
        int k=2;
        int sum=0;
        for(int i = 0; i<array.length;i++){
            if(array[i]%k==0){
               sum+=array[i];
            }
        }
        System.out.println("сумма: "+sum);
    }
}

