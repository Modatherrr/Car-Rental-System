/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author Modather
 */
public class Garage {
    public static int CarCount;
    
    public Car Vehicle[];
    public Garage(){}
    public Garage(int Count){
        this.Vehicle = new Car[5];
    }
    public void CreateVehicles(){
        for(int i = 0; i < 5;i++){
            Vehicle[i] = new Car();
            Vehicle[i].CarName = JOptionPane.showInputDialog("Specify the car model for car no. (" + (i+1) +")");
            Vehicle[i].RentalPrice = Integer.parseInt(JOptionPane.showInputDialog("Specify the car rent price for car no. (" + (i+1) +")"));
            Vehicle[i].IsCurrentlyRented = false;
        }
    }
}
