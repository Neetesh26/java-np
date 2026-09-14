import java.lang.*;
import java.util.*;

class binaryToDecimal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter binary digit : ");
        // int binary_num =sc.nextInt();
        int decimal_num =sc.nextInt();

        // int ans=0;
        // int pow =1;

        // while(binary_num > 0){
        //     int unitDigit = binary_num % 10;
        //     ans += (unitDigit * pow);
        //     binary_num /= 10;
        //     pow *= 2;
        // }
        // System.out.println("Binary convert into decimal :" +ans);




        // decimal to binary ----------------------------------------->
         int ans=0;
        int pow =1;

        while(decimal_num > 0){
            int unitDigit = decimal_num % 2;
            ans += (unitDigit * pow);
            decimal_num /= 2;
            pow *= 10;
        }
        System.out.println("decimal convert into binary :" +ans);
    }
}