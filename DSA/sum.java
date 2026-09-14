import java.util.*;
import java.lang.*;

class sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number you want to sum : ");
        int num = sc.nextInt();
        int sum =0;
        int result = sumPrint(num , sum);
        System.out.println("sum is : " + result);
    }
    static int sumPrint(int num , int sum){
        if( num < 0){
            return sum;
        }
        return sumPrint(num-1 , sum + num);
    }
}