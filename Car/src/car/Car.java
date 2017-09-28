/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author harun
 */
public class Car {
    
    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Harun";
    
    public void printVariables(){
        System.out.println("This is the maxSpeed " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
    }
    
    public void wreckCar(){
        condition = 'C';
    }
    
    public void upgradeMinSpeed(){
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }
    
    public void switchCarOn(){
        isTheCarOn = true;
    }
    
    public static void main(String[] args)
    {
        // TODO code application logic here
        Car familyCar = new Car();
        familyCar.printVariables();
        System.out.println("My Car:");
        familyCar.printVariables();
        familyCar.upgradeMinSpeed();
        familyCar.printVariables();
        familyCar.wreckCar();
        familyCar.printVariables();
        familyCar.switchCarOn();
        familyCar.printVariables();
    }
    
}
