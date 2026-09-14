import java.lang.*;
import java.util.*;

class pairSum{
    
    // public static int PairSumElem(int[] arr , int target){
    //     int ans = 0;
    //     int n = arr.length;
    //     for(int i=0; i < n; i++){
    //         for(int j=i+1; j<n-1; j++){
    //             if(arr[i] + arr[j] == target){
    //                 ans++;
    //             }
    //         }
    //     }
    //     return ans;
    // }

    public static int PairTripletSum(int[] arr , int target){
        int ans = 0;
        int n = arr.length;
        for(int i=0; i < n; i++){ // first num
            for(int j=i+1; j<n; j++){ //second num 
                for(int k = j+1; k<n; k++){ //third num
                    if(arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }
               
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements.");
        for(int i=0; i<n ;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum : ");
        int target = sc.nextInt();


        System.out.println("Number of pairs to sum is : ");
        // pair sum program----------------->
        // System.out.println(PairSumElem(arr, target));

        // triplet pair sum program ------------->
        System.out.println(PairTripletSum(arr, target));

    }
}