import java.lang.*;
import java.util.*;

public class prymid{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
        // System.out.println("* \n* *\n* * *\n* * * *");
        //  System.out.print("* * * *\n* * *\n* *\n*");
        System.out.println("Enter num to print prymid");
        int num = sc.nextInt();
      for(int a =1;a<=num;a++){
        for(int b=1;b<=a;b++){
            System.out.print("* ");
        }
         System.out.print("\n");
      }



      //  * * * *
      //  * * * 
      //  * *
      //  * 
     for(int i=num; i>=1; i--){
        for(int j=i; j>=1; j--){
        System.out.print("* ");
     }
        System.out.print("\n");
     } 
    }
}