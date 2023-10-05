/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2;  // Jaider GOnzalez, Daniel Gutierrez

import java.util.LinkedList;
import java.util.Queue;

public class Mercado {
     private Queue<Integer> cola;
    private int capacidad;

    public Mercado(int capacidad) {
        this.cola = new LinkedList<>();
        this.capacidad = capacidad;
    }

    public synchronized void producir(int producto) throws InterruptedException {
        while (cola.size() == capacidad) {
            
            wait();
        }
        cola.offer(producto);
        System.out.println("Productor produce: " + producto);
        mostrarEstado();
        notifyAll();
    }

    public synchronized int consumir() throws InterruptedException {
        while (cola.isEmpty()) {
            
            wait();
        }
        int producto = cola.poll();
        System.out.println("Consumidor consume: " + producto);
        mostrarEstado();
        notifyAll();
        return producto;
    }

    private void mostrarEstado() {
        System.out.println("Estado de la estructura: " + cola);
    }
}
