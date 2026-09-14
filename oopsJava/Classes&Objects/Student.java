
public class Student {
    public int  id;
    public int  age;
    public String  Name;
    public int  nos;


    // constructor--> for calling and insert values in attributes
    public Student(){
        System.out.println("Student default constr calling...");
    }



    // perameterised contr....->
    public Student(int id,int age, String Name,int nos){
        System.out.println("Student Perametrised constr calling...");
        this.id = id;
        this.age = age;
        this.Name = Name;
        this.nos = nos;

    }


    // copy contr....->
    public Student(Student stdObj){
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



}
























// import java.lang.*;

// class Algebra{

//     int a ,b;

// // constractor-------------------------------->


//     // Algebra(){
//     //     System.out.println("constractor is called");
//     // }



// // perametrice constractor--------------------------------------------->
    
//     Algebra(int x , int y){
//         a = x;
//         b = y;
//         System.out.println("constractor is called");
//     }

//     int add(){
//         return a+ b;
//     }
//     int sub(){
//         return a- b;
//     }

// }

// public class oops{
//     public static void main(String[] args){
//         Algebra a1 = new Algebra(5,8);

//         System.out.println(a1.add()) ;   
//         System.out.println(a1.sub());
//     }  
// }