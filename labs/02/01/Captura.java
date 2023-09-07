/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.pkg1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Captura {
    
  private static Scanner leer = new Scanner(System.in);

  public static double nextDouble(String message) {
    System.out.print(message);
    return leer.nextDouble();
  }

  public static double [][] readMat(int filas, int cols) {
    double [][] matR = new double[filas][cols];

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < cols; j++) {
        matR[i][j] = nextDouble("Ingrese el valor en la posición [" + i + "][" + j + "]: ");
      }
    }
    return matR;
  }
}
