public class arrUtility {
    public static int[] arrPrint(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of a array");
         int size = sc.nextInt();
        
        int[] arr = new int[size];
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
        return arr;
    }
}



//  // int[] arr = arrUtility.arrPrint();
