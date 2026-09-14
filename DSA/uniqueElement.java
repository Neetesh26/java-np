import java.lang.*;
import java.util.*;

class uniqueElement{

    public static int ArrayManMethod(int[] arr){
        int n= arr.length;
        for(int i =0; i<n; i++){
            for(int j=i+1; j<n; j++){
               if(arr[i] == arr[j]){
                arr[i] = -1;
                arr[j] = -1;
               }
            }
        }
        
        int ans = -1;
        for(int i=0 ; i<n;i++){
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of an array");
            int size = sc.nextInt();
        System.out.println("Enter " + size  + "Elements");

        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        } 

        System.out.println("the unique element of an array : ");
        System.out.println(ArrayManMethod(arr ));
    }
}