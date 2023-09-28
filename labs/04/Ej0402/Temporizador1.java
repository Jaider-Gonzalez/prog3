/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timmers;

import java.util.Timer;
import java.util.TimerTask;

public class Temporizador1 {
    public static void main(String[] args){
TimerTask timertask = new TimerTask() {
int i=0;
@Override
public void run() {
System.out.println("Hola "+i);
i++;
}
};
Timer timer = new Timer();
timer.scheduleAtFixedRate(timertask, 0, 2000);
}
};
