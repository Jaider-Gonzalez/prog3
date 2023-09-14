/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2.pkg1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Lab21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Seleccione una opción:");
      System.out.println("1. Sumar dos matrices");
      System.out.println("2. Multiplicar dos matrices");
      System.out.println("3. Sumar matriz con escalar");
      System.out.println("4. Calcular la transpuesta de una matriz");
      System.out.println("5. Salir");

      int opcion = scanner.nextInt();

      if (opcion == 1) {
        int filas, cols;
        System.out.println("Ingrese las dimensiones de las matrices a sumar:");
        filas = (int) Captura.nextDouble("Filas: ");
        cols = (int) Captura.nextDouble("Columnas: ");
        double[][] matA = Captura.readMat(filas, cols);
        double[][] matB = Captura.readMat(filas, cols);
        double[][] resultado = Operacion.suma(matA, matB);

        System.out.println("Resultado de la suma:");
        imprimirMatriz(resultado);
      } else if (opcion == 2) {
        int filasA, colsA, filasB, colsB;
        System.out.println("Ingrese las dimensiones de la primera matriz:");
        filasA = (int) Captura.nextDouble("Filas: ");
        colsA = (int) Captura.nextDouble("Columnas: ");
        double[][] matA = Captura.readMat(filasA, colsA);

        System.out.println("Ingrese las dimensiones de la segunda matriz:");
        filasB = (int) Captura.nextDouble("Filas: ");
        colsB = (int) Captura.nextDouble("Columnas: ");
        double[][] matB = Captura.readMat(filasB, colsB);

        if (colsA != filasB) {
          System.out.println("No se pueden multiplicar las matrices. El número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz.");
        } else {
          double[][] resultado = Operacion.producto(matA, matB);
          System.out.println("Resultado de la multiplicación:");
          imprimirMatriz(resultado);
        }
      } else if (opcion == 3) {
        int filas, cols;
        System.out.println("Ingrese las dimensiones de la matriz:");
        filas = (int) Captura.nextDouble("Filas: ");
        cols = (int) Captura.nextDouble("Columnas: ");
        double[][] matA = Captura.readMat(filas, cols);

        double escalar = Captura.nextDouble("Ingrese el escalar a sumar: ");
        double[][] resultado = Operacion.sumaEscalar(matA, escalar);

        System.out.println("Resultado de la suma con el escalar:");
        imprimirMatriz(resultado);
      } else if (opcion == 4) {
        int filas, cols;
        System.out.println("Ingrese las dimensiones de la matriz:");
        filas = (int) Captura.nextDouble("Filas: ");
        cols = (int) Captura.nextDouble("Columnas: ");
        double[][] matA = Captura.readMat(filas, cols);
        double[][] resultado = Operacion.transpuesta(matA);

        System.out.println("Resultado de la transpuesta:");
        imprimirMatriz(resultado);
      } else if (opcion == 5) {
        break;
      } else {
        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
      }
    }
  }

  public static void imprimirMatriz(double[][] matriz) {
    int filas = matriz.length;
    int cols = matriz[0].length;

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(matriz[i][j] + "\t");
      }
      System.out.println();
    }
}
}
