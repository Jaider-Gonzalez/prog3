package metodos.ordenamiento;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MetodosOrdenamiento {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n;
      do{
        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        n = input.nextInt();
        
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(1000);
        }
        
        System.out.println("Arreglo generado aleatoriamente: " + Arrays.toString(arr));
        
        int[] arrBubblesort = Arrays.copyOf(arr, n);
        int[] arrInsertionSort = Arrays.copyOf(arr, n);
        int[] arrSelectionSort = Arrays.copyOf(arr, n);
        int[] arrMergesort = Arrays.copyOf(arr, n);
        
        long inicioburbuja = System.nanoTime();
        bubbleSort(arrBubblesort);
        long finburbuja = System.nanoTime();
        long burbujas = finburbuja - inicioburbuja;
        System.out.println("Arreglo ordenado por burbuja: " + Arrays.toString(arrBubblesort));
        System.out.println();
        
        long inicioinser = System.nanoTime();
        insertionSort(arrInsertionSort);
        long fininser = System.nanoTime();
        long insercion = fininser - inicioinser;
        System.out.println("Arreglo ordenado por insercion: " + Arrays.toString(arrInsertionSort));
        System.out.println();
        
        long inicioselec = System.nanoTime();
        selectionSort(arrSelectionSort);
        long finselec = System.nanoTime();
        long seleccion = finselec - inicioselec;
        System.out.println("Arreglo ordenado por seleccion: " + Arrays.toString(arrSelectionSort));
        
        System.out.println();
        long iniciomerge = System.nanoTime();
        mergeSort(arrMergesort, 0, n-1);
        long finmerge = System.nanoTime();
        long mergesort = finmerge - iniciomerge;
        System.out.println("Arreglo ordenado por mergesort: " + Arrays.toString(arrMergesort));
        
        
        System.out.println();
        
    System.out.println("Metodo de ordenamiento   | Tiempo empleado (nanosegundos)");
    System.out.println("-------------------------|--------------------------------");
    System.out.printf("Burbuja                  | %d%n", burbujas);
    System.out.printf("Insercion                | %d%n", insercion);
    System.out.printf("Seleccion                | %d%n", seleccion);
    System.out.printf("Mergesort                | %d%n", mergesort);
   
      System.out.print("¿Desea ejecutar el codigo nuevamente? (s/n): ");
    }while (input.next().equalsIgnoreCase("s"));
    
} 
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
        int m = (l + r) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m+1, r);
        merge(arr, l, m, r);
        }
    }
    public static void merge(int[] arr, int l, int m, int r) {
    int n1 = m - l + 1;
    int n2 = r - m;
    int[] L = new int[n1];
    int[] R = new int[n2];

    for (int i = 0; i < n1; i++) {
        L[i] = arr[l + i];
    }

    for (int j = 0; j < n2; j++) {
        R[j] = arr[m + 1 + j];
    }

    int i = 0, j = 0, k = l;

    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
            arr[k] = L[i];
            i++;
        } else {
            arr[k] = R[j];
            j++;
        }
        k++;
    }

    while (i < n1) {
        arr[k] = L[i];
        i++;
        k++;
    }

    while (j < n2) {
        arr[k] = R[j];
        j++;
        k++;
    }
    }
        public static void selectionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n-1; i++) {
        int minIdx = i;
        for (int j = i+1; j < n; j++) {
            if (arr[j] < arr[minIdx]) {
                minIdx = j;
            }
        }
        int temp = arr[minIdx];
        arr[minIdx] = arr[i];
        arr[i] = temp;
        }
    }
}

