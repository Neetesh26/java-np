import java.util.*;
import java.lang.*;

class frequencyArr{

    static int[] makefrequencyArr(int[] arr){
        int[] freq = new int[100005];

        for(int i =0; i< arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size of an array.");
    int size = sc.nextInt();

    int[] arr =new int[size];

    System.out.println("Enter " + size + " Element");
    for(int i=0; i<size; i++){
        arr[i] = sc.nextInt();
    }

    int[] freq = makefrequencyArr(arr);

    System.out.println("Enter no of queries..");
    int q = sc.nextInt();

    while(q > 0){
        System.out.println("Enter number to be Searched");
        int x =sc.nextInt();

        if(freq[x] > 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        q--;
    }
   
}
}