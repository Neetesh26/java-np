import java.lang.*;
import java.util.*;

public class student{
    public static void main(String args[]){

        System.out.println("---Student percentage calculate application--->\nStart Here");
           Scanner s =new Scanner(System.in);

            
        System.out.println(" NOTE :  It is valid for limited subject like as : HINDI, ENGLISH, MATHS.");
        //      int subject=s.nextInt();
        // System.out.print("total number of subject is : "+subject);     
        System.out.println("Enter your name ");
             String name = s.nextLine();
         System.out.println("Student name is : " +name);
        System.out.println("Enter your subject marks ---> ");
        System.out.print("Maths : ");
             int Maths =s.nextInt();
        System.out.print("English : ");
             int English = s.nextInt();
        System.out.print("Hindi : ");
             int Hindi = s.nextInt();

             int obtainedScore = Maths + English + Hindi;
        System.out.println("your total number is : " +obtainedScore);
           
          //    int per = (obtainedScore*100)/300;
          float per = (obtainedScore/300.0f)*100;
        System.out.print("your percentage is : " +per +"%");
    }
}