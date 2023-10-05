/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2;

/**
 *
 * @author Asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Mercado mercado = new Mercado(10); 
        
        Productor productor1 = new Productor(mercado);
        Productor productor2 = new Productor(mercado);
        Consumidor consumidor1 = new Consumidor(mercado);
        Consumidor consumidor2 = new Consumidor(mercado);
        
        productor1.start();
        productor2.start();
        consumidor1.start();
        consumidor2.start();
    }
    
}
