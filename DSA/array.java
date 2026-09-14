 import java.lang.*;
 import java.util.*;

 public class array{
    public static void main(String[] args){
 // ------------------------------------------------------------
        // create an array
// ------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the size of an array");
        // int size = sc.nextInt();

        // int [] arr = new int[size];

        // System.out.println("enter the array");
        // for(int i=0;i<size;i++){
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println("the array entered is :");
        // for(int i=0;i<size;i++){
        //     System.out.print(arr[i]+ " ");
        // }

// ------------------------------------------------------------
        //sum of all array elem....
// ------------------------------------------------------------
        // int sum=0;
        // for(int elem:arr){
        //     sum =sum + elem;
        // }
        // System.out.println("\n sum is :" + sum);


// ------------------------------------------------------------
  /// reverse / swape of an array...
// ------------------------------------------------------------
        //  float [] arr = {45.5f, 89.2f, 353.4f, 54.2f, 37.2f};
        // int l =arr.length;
        // int mid = Math.floorDiv( l, 2);
        // float temp;
        // for(int i=0;i<mid;i++){
        //     // swape number
        //     temp = arr[i];
        //     arr[i] = arr[l-1-i];
        //     arr[l-1-i] = temp;
        // }
        // System.out.println(" your reversed array is : ");
        // for( float elem: arr){
        //     System.out.print(elem+ " ");
        // }

// ------------------------------------------------------------
// maximum or minimum number of an array find?
// ------------------------------------------------------------
           System.out.println("Enter array size");
           int size = sc.nextInt();
           
            int [] arr = new int[size];
           System.out.println("Enter array ");
           for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
           }
            System.out.println("your Entered array is:");
            for(int elem:arr){
                System.out.print(elem+" ");
            }

             System.out.println(" maximum number of an aray is :");
             int max =0;    //Integer.MIN_VALUE  -2147483648
             int min =Integer.MAX_VALUE; //2147483648
             for(int e:arr){
                if(e > max){
                    max= e;
                }
                if(e < min){
                    min= e;
                }
              }
            System.out.println("max num is "+ max);
            System.out.println("min num is "+ min);
    }
 }