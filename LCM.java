import java.lang.*;
import java.util.*;

public class LCM{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number to print lcm :");
        int num1=sc.nextInt();
        System.out.println("Enter second number to print lcm :");
        int num2 = sc.nextInt();
        int lcm = lcm(num1 ,  num2);
         System.out.println("lcm is :" +lcm);
        
    }    
    public static int lcm(int num1 , int num2){
        int i =1;
        while(true){
            int factor = i * num1;
            if( factor % num2 == 0){
                return factor;
            }
            i++;
        }
        // return 0;
    }
}