import java.lang.*;
import java.util.*;

public class oddsum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to calculate there total odd sum");
        int num = sc.nextInt();
        int sum = oddsum(num);
        System.out.println("total sum is " +sum);
    }
    public static int oddsum(int num){
        int i =1;
        int sum =0;
        while(i <= num){
            sum = sum + i;
            i=i+2;
        }
        return sum;
    }
}