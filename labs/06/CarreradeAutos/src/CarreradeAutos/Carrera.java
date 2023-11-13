/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarreradeAutos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Lina Castiblanco
 */
public class Carrera extends Thread{
    
    
    private JLabel etiqueta;
    private Ventana auto;

   
    public Carrera(JLabel etiqueta, Ventana auto) {
        this.etiqueta = etiqueta;
        this.auto = auto;
    }
    
    @Override
    public void run(){
        
        int Auto1 = 0;
        int Auto2 = 0;
        int Auto3 = 0;
        int Auto4 = 0;
        
        while(true){
            try{
                
                sleep((int)(Math.random() * 100));
                Auto1 = auto.getPrimerAuto().getLocation().x;
                Auto2 = auto.getSegundoAuto().getLocation().x;
                Auto3 = auto.getTercerAuto().getLocation().x;
                Auto4 = auto.getCuartoAuto().getLocation().x;
                
                if(Auto1 < auto.getMeta().getLocation().x - 115 && Auto2 < auto.getMeta().getLocation().x - 115 && Auto3 < auto.getMeta().getLocation().x - 115 && Auto4 < auto.getMeta().getLocation().x - 115){
                    etiqueta.setLocation(etiqueta.getLocation().x + 20,etiqueta.getY());
                    auto.repaint();  
                }else{
                    break;
                }
            }catch(Exception e){
                System.out.println(e);
            }
            
            if(etiqueta.getLocation().x >= auto.getMeta().getLocation().x - 115){
                if(Auto1 > Auto2){
                    JOptionPane.showMessageDialog(null,"Gano McQueen");
                }
                else if(Auto2 > Auto3){
                    JOptionPane.showMessageDialog(null,"Gano Storm"); 
                }
                else if(Auto3 > Auto4){
                    JOptionPane.showMessageDialog(null,"Gano Cruz"); 
            }
                else if(Auto4 > Auto1){
                    JOptionPane.showMessageDialog(null,"Gano Francesco"); 
        }
                else{
                    JOptionPane.showMessageDialog(null,"Empate"); 
                }
            }
        }
    }
}
