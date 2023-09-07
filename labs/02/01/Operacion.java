/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.pkg1;

/**
 *
 * @author Asus
 */
public class Operacion {
     public static double[][] suma(double [][]matA, double [][] matB) {
         int filas = matA.length;
         int cols = matA[0].length;
    double[][] matR = new double [filas][cols];

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < cols; j++) {
        matR[i][j] = matA[i][j] + matB[i][j];
      }
    }
    
    return matR;
  }

  public static double[][] producto(double [][]matA, double [][]matB) {
      int filasA = matA.length;
      int colsA =  matA[0].length;
      int colsB = matB[0].length;
    double[][] matR = new double [filasA][colsB];

    for (int i = 0; i < filasA; i++) {
      for (int j = 0; j < colsB; j++) {
        for (int k = 0; k < colsA; k++) {
          matR[i][j] += matA[i][k] * matB[k][j];
        }
      }
    }
    return matR;
  }

  // ... continuar con los demás métodos
}
