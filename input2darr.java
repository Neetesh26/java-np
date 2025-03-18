import java.lang.*;
import java.util.*;

public class input2darr{
    public static void main(String[] args ){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your 2d array...");
        System.out.println("enter row size");
        int row = sc.nextInt();
        System.out.println("enter column size");
        int column = sc.nextInt();
        int[][] arr = new int[row][column];


        System.out.println("input arr elements...");
        int i =0;
        while(i < row){
            int j = 0;
            while(j<column){
                arr[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }

        System.out.println("your element is : ");
        int x=0;
        while(x<row){
            int y= 0;
            while(y<column){
                System.out.print(arr[x][y] +" ");
                y++;
            }
            System.out.println(" ");
            x++;
        }

        System.out.print("Enter your search element: ");
        int num = sc.nextInt();
        boolean isfound = search(arr , num);
        if(isfound){
            System.out.println("your number was  found");
        }
        else{
            System.out.println("your number was not found");
        }
    }

    public static boolean search(int[][]arr , int num){
        int i =0;
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
                if(arr[i][j]==num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}