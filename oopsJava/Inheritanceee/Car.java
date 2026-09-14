// package Inheritanceee;

public class Car extends Vehicle {

    public int noOfDoors;
    
    public int transmissionType;

    Car(String Name, String modal,int noOftyre, int noOfDoors, int transmissionType){

        super(Name, modal, noOftyre);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
        super.startEngine();
    }

    
}
