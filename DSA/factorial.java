import java.lang.*;
import java.util.*;

public class factorial{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number to given factorial : ");
        int num = sc.nextInt();
        int fact = factorial(num);
        System.out.println("your factorial is : " +fact);
    }
    public static int factorial(int num){
        int i=1;
        int factorial= 1;
        while(i <= num){
            factorial *= i;
            i++;
        }
        return factorial;
    }
}