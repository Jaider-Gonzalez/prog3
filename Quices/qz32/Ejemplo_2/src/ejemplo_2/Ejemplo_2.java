/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_2;

import java.io.File;
import java.io.IOException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


public class Ejemplo_2 {

   
    public static void main(String[] args) {
        XYSeries series = new XYSeries("XYGraph");
          series.add(1, 1);
          series.add(1, 2);
          series.add(2, 1);
          series.add(3, 9);
          series.add(4, 10);

          XYSeriesCollection dataset = new XYSeriesCollection();
          dataset.addSeries(series);
  
         JFreeChart chart = ChartFactory.createXYLineChart(
         "XY Chart", 
         "Eje x",
         "Eje y", 
         dataset, 
         PlotOrientation.VERTICAL, 
         true, 
         true, 
         false 
        );

         try {
             
         ChartUtilities.saveChartAsJPEG(new File("chart.jpg"),
         chart, 500, 300);
         }
         catch (IOException e) {
         System.err.println("Error al crear el archivo.");
         }
    }
    
}
