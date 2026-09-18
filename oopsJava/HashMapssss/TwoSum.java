import java.util.HashSet;

public class TwoSum {
     boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int elem : arr){
            int curr = target-elem;
            if(set.contains(curr)) return true;
            set.add(elem);
        }
       
        return false;
    }
}
// time comp..--> O(n) , space --> O(n)