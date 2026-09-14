package patterns_printing;

import java.util.Scanner;

class Hollow_rectangle {

// * * * * * 
// *       * 
// *       * x
// *       * 
// * * * * * 
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int rows = sc.nextInt();

       for (int i = 1; i <= rows; i++) {
           if(i==1 || i==rows){
               for (int j = 1; j <= rows; j++) {
                   System.out.print("* ");
               }
           } else {
               System.out.print("* ");
               for (int j = 2; j < rows; j++) {
                   System.out.print("  ");
               }
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}
