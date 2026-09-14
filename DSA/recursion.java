import java.lang.*;
import java.util.*;


public class recursion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        // print(n);
        fn(1 , n);
    }
    public static void print(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        print(n - 1);
    }

    // print number  n to 1
    // static void fn(int i , int n){
    //     if(i>n){
    //         return;
    //     }
    //     System.out.println(n);
    //     fn(i , n-1);
    // }
    // print number 1 to n
    static void fn(int i , int n){
        if(i>n){
            return;
        }
        fn(i , n-1);
        System.out.println(n);
    }
}