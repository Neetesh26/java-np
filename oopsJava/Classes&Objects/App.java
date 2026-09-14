public class App {
    public static void main(String[] args) {
        

        Student A = new Student();
        A.id = 1;
        // A.age = 20;
        // A.Name = "meet";
        // A.nos = 22;

        System.out.println(A.id);
        System.out.println(A.age);
        System.out.println(A.Name);
        System.out.println(A.nos);

        // A.study();
        // A.sleeping();
        // A.bunk();


        // perametrised contr---------->
        // Student A = new Student(2,22,"Neetesh",32);
        // A.study();
        // A.sleeping();
        // A.bunk();

        // Copy contr------------>
        // Student B = new Student(A);

        // B.study();
        // B.sleeping();
        // B.bunk();
    }
}
