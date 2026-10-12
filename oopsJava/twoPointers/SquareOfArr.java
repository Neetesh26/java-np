package oopsJava.twoPointers;

import java.util.Arrays;
import java.util.Scanner;
//6
// -10 -3 -2 1 4 5
// 100 9  4 1 16 25 --> 1,4,9,16,25,100

// -5 -80 6 90 5
public class SquareOfArr {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i =0;i <n;i++){
            arr[i]=sc.nextInt();
        }

        int[] result = new int[n];

        int i = 0; int j = n-1;int k=n-1;
        while(i <= j){
            if(Math.abs(arr[i]) > Math.abs(arr[j]) ){
                int left = arr[i] * arr[i];
                result[k] = left;
                i++;
                k--;

            }else{
                int right = arr[j] * arr[j];
                result[k] = right;
                j--;
                k--;
            }
        }

        for (int elem: Arrays.stream(result).sorted()){
            System.out.print(elem + " ");
        }

    }
}
