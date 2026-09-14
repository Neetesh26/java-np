import java.lang.*;
import java.util.*;

class secondMax{
    public static int Smax(int[] arr){
        int fmax = Integer.MIN_VALUE;
        int Smax = Integer.MIN_VALUE;

        for(int i = 0; i< arr.length;i++){
            if(arr[i] > fmax){
                Smax = fmax;
                fmax = arr[i];
            }
            else if(arr[i]> Smax && arr[i] != fmax){
                Smax = arr[i];
            }
        }
        return Smax;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " array elements");
        for(int i =0; i< size;i++){
            arr[i] = sc.nextInt();
        } 
        
        System.out.println("printed array elements...");
        for(int j = 0; j<arr.length;j++){
            System.out.print(arr[j] + " ");
        }
        // System.out.print(arr);

        int secondMax = Smax(arr);
        System.out.println("\nSecond maximum number in the array is : " + secondMax);
    }
}