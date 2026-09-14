import java.lang.*;
import java.util.*;

public class practice{
    public static void main(String[] args){

        System.out.println("Enter your number... ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int ans =0;
        for(int i = 0; i <= number; i++){
            if(i % 2 ==0){
                ans -= i;
            }else{
                ans += i;
            }
        }
        System.out.println("answer is :" + ans);
    }
}
