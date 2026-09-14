// package Inheritanceee;

public class Vehicle {
    public String Name ; 
    public String modal ; 
    public int noOftyre ; 


    Vehicle(String Name, String modal,int noOftyre){
        this.Name = Name;
        this.modal = modal;
        this.noOftyre = noOftyre;
    }

    void startEngine(){
        System.out.printf("Engine is Starting of %s : %s\n", Name , modal);
    }

    void stopEngine(){
        System.out.printf("Engine is stopping of %s : %s\n", Name , modal);
    }
}
