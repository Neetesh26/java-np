
import java.lang.*;
import java.util.*;

public class car{
    String color;
    int numOfWheels;
    int noOfSeat;
    float currentFuelInlr;
    float maxSpeed;
    int noOfwheel;
    

    car(String color){  //constructor------>
        this.color  = color;
        numOfWheels  = 4;
        noOfSeat  = 5;
        currentFuelInlr = 2;
        maxSpeed = 150; 
    }
    car(){  //constructor------>
        this.color  = "light blue";  // if want to remove "this".. yes you can remove it
        numOfWheels  = 4;
        noOfSeat  = 5;
        currentFuelInlr = 5;
        maxSpeed = 150; 
    }
    public void start(){
        System.out.println("car is start...bruuuhh"); 
        
         if(currentFuelInlr == 0){
            System.out.println(" no,  fuel..");
        }else if(currentFuelInlr < 5){
            System.out.println("car is reserved mode, pls insert fuel...");
        }else{
       
         currentFuelInlr--;
        }

    }
    public void drive(){
      System.out.print("car is driving...");
            
    }

    public void addFuel(float fuel){
        currentFuelInlr += fuel;
    }

    public float getCurrentFuel(){
        return currentFuelInlr;
    }
}