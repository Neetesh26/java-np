import java.lang.*;
import java.util.*;

class pattern{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter no.. of rows");
        int rows = sc.nextInt();

        // System.out.println("Enter no.. of col");
        // int col = sc.nextInt();

// rectangle pattern ----------------------->

        // for(int i=1;i<=rows;i++){
        //     for(int j=1;j<=col;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


// hollow rectangle---------------------->

        // for(int i=1;i<=rows;i++){
        //     for(int j=1;j<=col;j++){
        //         if(i== rows || i ==1 || j==1 || j==col){
        //          System.out.print("*");
        //         }
        //         else{
        //          System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

// triangle pattern --------------------------->

        // for(int i=1 ; i<=rows; i++){
        //     for(int j=1; j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        // for(int i=rows ; i>1; i--){
        //     for(int j=1; j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


//---------------------------prymid----------------->
        
        // for(int i=1 ; i<=rows; i++){
        //     for(int j=1; j<=rows-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=(2*i-1); k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



// rectangular numbers------------------------------------------------->


        // for(int i=1;i<=rows;i++){
        //     for(int j=i; j<=rows;j++){
        //         System.out.print(j);
        //     }
        //     for(int k=1;k<=i-1;k++){
        //         System.out.print(k);
        //     }
        //     System.out.println();
        // }

// numbers pattern---------------------------------------------------------->

//         for(int i=1;i<=rows;i++){
//             for(int j=1;j<=rows;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }




//      *
//    * *
//  * * *

        // for(int i= 1; i<=rows;i++){
        //         for(int j= 1; j<=rows-i; j++){
        //                 System.out.print(" ");
        //         }
        //         for(int k =1; k<=i; k++){
        //                 System.out.print("*");
        //         }
        //         System.out.println();
        // }





        // x pattern

        for(int i =1;i<=rows; i++){
                for(int j=1; j<=rows;j++){
                        if(i==j || i+j ==rows +1){
                                System.out.print("* ");
                        }else{
                                System.out.print(" ");

                        }

                }
                System.out.println();
        }

        
}
}