import java.lang.*;
import java.util.*;

class PatternAdv{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows..");
        int row =sc.nextInt();

        for(int i=1; i <= row; i++){
            for(int j=0;j < row-i; j++){
                System.out.print(" ");
            }
            // System.out.println();
            for(int k=0;k<row;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}