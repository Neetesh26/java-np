import java.lang.*;
import java.util.*;

public class powers{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the f number ");
        int fnum = sc.nextInt();
        System.out.println("enter the s number ");
        int Snum = sc.nextInt();


        int ans =1;
        for(int i = 1;i<= Snum;i++){
            ans *= fnum;
        }
        System.out.println(ans);
    }
}