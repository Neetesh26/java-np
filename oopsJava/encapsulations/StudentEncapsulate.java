
public class StudentEncapsulate {
    private  int  id;
    private  int  age;
    private  String  Name;
    private  int  nos;
    private  String  gf;


    public void getDetails(){
        System.out.println(this.id);
        System.out.println(this.Name);
        System.out.println(this.nos);
    }

    public void changeInfo(int id,int age, String Name){
        this.id = id;
        this.age = age;
        this.Name = Name;

        System.out.println("New id is " +this.id);
        System.out.println("New Name is " +this.Name);
        System.out.println("New nos is " +this.nos);

    }


    // constructor--> for calling and insert values in attributes
    public StudentEncapsulate(){
        System.out.println("Student default constr calling...");
    }



    // perameterised contr....->
    public StudentEncapsulate(int id,int age, String Name,int nos, String gf){
        System.out.println("Student Perametrised constr calling...");
        this.id = id;
        this.age = age;
        this.Name = Name;
        this.nos = nos;
        this.gf = gf;

    }


    // copy contr....->
    public StudentEncapsulate(StudentEncapsulate stdObj){
        System.out.println("Student copy constr calling...");
        this.id = stdObj.id;
        this.age = stdObj.age;
        this.Name = stdObj.Name;
        this.nos = stdObj.nos;

    }




    // Methods/ behaviours
    public void  study(){
        System.out.println(Name + " is Studying...");
    }
    public void  sleeping(){
        System.out.println(Name + " is sleeping...");
    }
    public void  bunk(){
        System.out.println(Name + " is Bunking...");
    }

//  not accesss direct out side class or no change 
    private  void  gfName(){
        System.out.println("Gf name is  " + this.gf);
        
    }

}




