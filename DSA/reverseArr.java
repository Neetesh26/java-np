import java.lang.*;
import java.util.*;

class reverseArr{
    public static int[] reversearr(int[] arr){
        int j =0;
        int n = arr.length;
        int[] ans = new int[n];
        for(int i= n-1; i>=0; i--){
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr = {1,5,4,36,4};
        int[] ans = reversearr(arr);

        // original array--------------
        System.out.println("original array");
         for(int j=0; j<arr.length;j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        
        // reverse array------------------->
        System.out.println("reverse array");
        for(int i=0; i<arr.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}