import java.lang.*;
import java.util.*;

public class occarenceArr{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of a array");
        int size = sc.nextInt();
        
        int []arr = new int[size];
        System.out.println("Enter array elements");

        int i = 0;
        while (i < size) {
            arr[i] = sc.nextInt();
            i++;
        }

        System.out.println("your Entered array is :");
        
        int j=0;
        while (j < size) {
            System.out.print(arr[j] + " ");
            j++;
        }

        System.out.println("\nEnter you number to find :");
        int num =sc.nextInt();
        int occurence = occ( arr , num);
        System.out.println("your occurence is :"+ occurence);

    }

    public static int occ(int[] arr ,int num){

        int occ =0;
        int i =0;
        while (i < arr.length) {
            if(arr[i]==num){
                occ++;
            }
            i++;
        }
        
        return occ;
    }
}