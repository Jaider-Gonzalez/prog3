/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timmers;

import java.util.Timer;
import java.util.TimerTask;

public class Temporizador0 {
    Timer timer;
public Temporizador0(int segundos) {
timer = new Timer();
timer.schedule(new Recordatorio(),segundos*1000);//Programa la tarea
}
class Recordatorio extends TimerTask {
public void run() {
System.out.println("Tiene un recordatorio!");
timer.cancel(); //Termina el hilo del timer
}
}
public static void main(String args[]) {
System.out.println("Inicio del programa");
new Temporizador0(5);
}
}
