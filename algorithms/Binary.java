import java.util.*;

// Binary Search algorithm..........
class Binary {
    static int BinarySearch(int[] arr, int target) {
        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {
            int mid = first + (last - first) / 2;

            if (arr[mid] == target) {
                return mid; // found
            } else if (arr[mid] < target) {
                first = mid + 1; // move right
            } else {
                last = mid - 1; // move left
            }
        }
        return -1; // not found
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array elements (sorted): ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array is: ");
        for (int j = 0; j < size; j++) {
            
            System.out.println("Element " + j + " : " + arr[j]);
        }

        System.out.println("Enter target element to search: ");
        int target = sc.nextInt();

        int ans = BinarySearch(arr, target);

        if (ans == -1) {
            System.out.println("Number not found!!");
        } else {
            System.out.println("Your target " + target + " is found at index: " + ans);
        }

        sc.close();
    }
}
