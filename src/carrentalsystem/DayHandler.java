/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrentalsystem;

public class DayHandler {
    public int DayToStart = 1;
    public int CurrentDay = 1;
    public static boolean isDayRunning = false;
    
    public void ToggleStart(){
        if(isDayRunning == false){
            isDayRunning = true;
        }else{
            isDayRunning = false;
        }
    }
    
}
