import java.lang.*;
import java.util.*;

public class fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to fibonacci series : ");
        int num = sc.nextInt();
        System.out.println("fibonacci series  is : ");
         series(num);
    }
    public static void series(int num){
        if(num < 0){
           System.out.println("0");
            return;
        } 
        
        if(num == 0){
        System.out.println("1");
            return;
        } 

        int first =0 , second = 1;
        while(first + second <= num){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}