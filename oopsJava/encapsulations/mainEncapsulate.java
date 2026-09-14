// package encapsulations;

public class mainEncapsulate {
    public static void main(String[] args) {
        StudentEncapsulate A = new StudentEncapsulate(1 , 22 ,"chuttu",66,"Tina");

        // System.out.println(A.Name); we cannot have direct access
        A.study();
        A.getDetails();
        A.changeInfo(1,20,"Teni");
        // A.getDetails();
    }
}
