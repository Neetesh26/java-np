import java.lang.*;
import java.util.*;

public class sortedArr {
    public static void main(String[] args) {
        int[] arr = {2,5,7,588,10};
        boolean isInc = incressing(arr); 
        boolean isdec = decressing(arr); 
        if (isInc || isdec) {
            System.out.println("your array is sorted");
        }else{
            System.out.println("your array is not sorted");
        }
    }
   
    public static boolean incressing(int[] arr){
        int i=1;
        while (i < arr.length) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean decressing(int[] arr){
        int i=1;
        while (i < arr.length) {
            if (arr[i] > arr[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
