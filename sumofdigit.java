import java.lang.*;
import java.util.*;

public class sumofdigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int num = sc.nextInt();
        int sum = sum(num);
        System.out.println("sum is that : " + sum);
    }
    public static int sum(int num){
        int sum =0;
        while(num > 0){
            sum = sum + (num % 10);
            num = num/10;
        }
        return sum;
    }
}