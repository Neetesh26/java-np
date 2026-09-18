import java.util.HashSet;

public class Distrinct_Element {
    public static int findDistrinctElem(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for( int elem :arr){
            set.add(elem);
        }
        return set.size();
    }


    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 1,1,2,3, 2, 3};
    int distinctCount = findDistrinctElem(arr);
    System.out.println("Number of distinct elements: " + distinctCount);
}
}


