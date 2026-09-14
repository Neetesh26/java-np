import java.lang.*;
import java.util.*;

public class twodimearr {
    public static void main(String[] args) {
        System.out.println("WELCOME to 2Darray application");
        Scanner sc = Scanner(System.in);
        
    }
    public static int [][] input2darr(){
        // Scanner sc = new Scanner(System.in);
          System.out.println("please enter rows  : ");
          int rows =sc.nextInt();
           System.out.println("please enter column  : ");
          int column =sc.nextInt();
          int[][] numarr =new int[rows][column];

          int i =0;
          while(i<rows){
            int j =0;
            while(j<column){
                System.out.println("enter elements in arr: ");
                numarr[i][j] = sc.nextInt();
             j++;
            }
            i++;
          }
          return numarr;
    }
}
