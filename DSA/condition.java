import java.lang.*;
import java.util.*;

public class condition{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("Welcome to age calculate application");
        System.out.println("--------------------------------");
        System.out.println("Enter you age");
            int age =sc.nextInt();
        System.out.println("--------------------------------");
        System.out.println("Your age is " +age);
        System.out.println("--------------------------------");
        switch(age){
            case 18:
                System.out.println("you are a child");
                System.out.println("--------------------------------");
            break;
           default :
                System.out.println("invalid");
        }

        
        
        
        
        
        // int age = 80;
        // if(age<18){
        //     System.out.println("you are not adult");
        // }else if(age>18 && age <40){
        //     System.out.println("you are a adult");
        // }else if(age > 40){
        //     System.out.println("you are a senoir citizen ");
        //     }else{
        //     System.out.println("age invalid");
        // }






        // boolean a=false;
        // boolean b=false;
        // if(a==b){
        //     System.out.print("shi");
        // }else{
        //     System.out.print("else is run");
        // }
    }
}