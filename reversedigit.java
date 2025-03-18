import java.lang.*;
import java.util.*;

public class reversedigit{
    public static void main(String args[]){
        System.out.println("Enter number to reverse");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int number = reverse(num);

        System.out.println("reverse digit is :" + number);
    }

    public static int reverse(int number){
        int newNumber =0;
        while(number > 0){
            int digit  = number % 10;
            newNumber = newNumber * 10 + digit ;
            number = number / 10;
        }
        return newNumber;
    }
}


// import java.lang.*;
// import java.util.*;

// public class reversedigit{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your number to reverse : ");
//         int number = sc.nextInt();
//         int num = reverse(number);
//         System.out.println("reverse number is : " + num);
//     }
    
//     public static int reverse(int number){
//         int newnum=0;
//         while(number > 0){
//             int digit = number % 10;
//               newnum =newnum * 10 + digit;
//               number = number/10;
//         }
//         return newnum;
//     }
// }