import java.lang.*;
import java.util.*;

public class sumavg {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter size of an array");
        int size = input.nextInt();
        System.out.println("enter array element");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        for (int arrays : arr) {
            System.out.print(arrays + " "); 
        }
        int sum = sum(arr);
        System.out.println("\nSum of array : " +sum);
 
        double avg = avg(arr);
        System.out.println("\nAverage is : " +avg);;
    }   



    public static int sum(int[] arr){
        int i =0;
        int sum =0;
        while (i<arr.length) {
            sum += arr[i];
            i++;
        }
        return sum;
    }

    public static double avg(int[] arr){
        double sum = sum(arr);
        return  (sum / arr.length);
    }
}
