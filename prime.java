import java.lang.*;
import java.util.*;

public class prime{ /// 2,3,5,7,11
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num to search it is prime or not ?");
        int num = sc.nextInt();
        boolean isprime = isPrime(num);
        if(isprime){   //true__
            System.out.println("number is prime " +num);
        }else{
            System.out.println("number is not prime " +num);
        }
    }
    public static boolean isPrime(int num){
        int i =2;
        while(i < num){
            if(num % i ==0){
                return false;
            }
            i++;
        }
        return true;
    }
}