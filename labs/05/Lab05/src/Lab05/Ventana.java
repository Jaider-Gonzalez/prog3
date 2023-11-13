/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lab05;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        importa = new javax.swing.JButton();
        btnfil = new javax.swing.JButton();
        Filtro = new javax.swing.JTextField();
        Filtro1 = new javax.swing.JTextField();
        Filtro2 = new javax.swing.JTextField();
        graficas = new javax.swing.JButton();
        exporta = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        columnas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Columnas2 = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 36)); // NOI18N
        jLabel2.setText("Bienvenidos a Filtros y un poco mas :D");

        Tabla.setBackground(new java.awt.Color(102, 102, 255));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla);

        importa.setText("Importar");
        importa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importaActionPerformed(evt);
            }
        });

        btnfil.setText("Filtrar");
        btnfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfilActionPerformed(evt);
            }
        });

        graficas.setText("Graficar Torta");
        graficas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficasActionPerformed(evt);
            }
        });

        exporta.setText("Exportar");
        exporta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportaActionPerformed(evt);
            }
        });

        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        jButton1.setText("Grafica Barras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(importa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(graficas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exporta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Filtro)
                            .addComponent(Filtro1)
                            .addComponent(Filtro2)
                            .addComponent(columnas, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(Columnas2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(importa)
                        .addGap(18, 18, 18)
                        .addComponent(borrar)
                        .addGap(1, 1, 1)
                        .addComponent(Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnfil)
                            .addComponent(Filtro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Filtro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(graficas)
                            .addComponent(columnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(Columnas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(exporta))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(205, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 928, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 636, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void importaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importaActionPerformed
     JFileChooser fileChooser = new JFileChooser();
     int seleccion = fileChooser.showOpenDialog(null);
     if (seleccion == JFileChooser.APPROVE_OPTION) {
       
        File file = fileChooser.getSelectedFile();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine();
            String[] columnNames = firstLine.split(",");
            ((DefaultTableModel)Tabla.getModel()).setColumnIdentifiers(columnNames);
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                ((DefaultTableModel)Tabla.getModel()).addRow(data);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_importaActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        DefaultTableModel model = new DefaultTableModel();
        Tabla.setModel(model);
    }//GEN-LAST:event_borrarActionPerformed

    private void btnfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfilActionPerformed
    String filtro = Filtro.getText();
    String filtro1 = Filtro1.getText();
    String filtro2 = Filtro2.getText();
    
    TableRowSorter<TableModel> sorter = new TableRowSorter<>(Tabla.getModel());
    
    // Crear los RowFilter individuales
    RowFilter<TableModel, Object> filter = RowFilter.regexFilter("(?i)" + filtro);
    RowFilter<TableModel, Object> filter1 = RowFilter.regexFilter("(?i)" + filtro1);
    RowFilter<TableModel, Object> filter2 = RowFilter.regexFilter("(?i)" + filtro2);
    
    // Combinar los RowFilter en un AndFilter
    List<RowFilter<TableModel, Object>> filters = Arrays.asList(filter, filter1, filter2);
    RowFilter<TableModel, Object> andFilter = RowFilter.andFilter(filters);
    
    sorter.setRowFilter(andFilter);
    Tabla.setRowSorter(sorter);

    DefaultTableModel modelo2 = new DefaultTableModel();
    for (int i = 0; i < Tabla.getRowCount(); i++) {
        Object[] fila = new Object[Tabla.getColumnCount()];
        for (int j = 0; j < Tabla.getColumnCount(); j++) {
            fila[j] = Tabla.getValueAt(i, j);
        }
        if (sorter.include(i)) {
            modelo2.addRow(fila);
        } else {
        }
    }
    Tabla.setModel(modelo2);
    }//GEN-LAST:event_btnfilActionPerformed

    private void exportaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportaActionPerformed
        JFileChooser fileChooser = new JFileChooser();
    int option = fileChooser.showSaveDialog(this);
    if (option == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            // Escribir los encabezados de la tabla
            for (int i = 0; i < Tabla.getColumnCount(); i++) {
                writer.write(Tabla.getColumnName(i));
                if (i < Tabla.getColumnCount() - 1) {
                    writer.write(",");
                }
            }
            writer.newLine();
            // Escribir los datos de la tabla
            for (int i = 0; i < Tabla.getRowCount(); i++) {
                for (int j = 0; j < Tabla.getColumnCount(); j++) {
                    Object value = Tabla.getValueAt(i, j);
                    if (value != null) {
                        writer.write(value.toString());
                    }
                    if (j < Tabla.getColumnCount() - 1) {
                        writer.write(",");
                    }
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_exportaActionPerformed

    private void graficasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficasActionPerformed
 // Obtener las columnas seleccionadas por el usuario
    String columnasSeleccionadas = columnas.getText();
    String[] columnas = columnasSeleccionadas.split(",");

    // Crear un dataset de tipo DefaultPieDataset
    DefaultPieDataset pieDataset = new DefaultPieDataset();

    // Obtener los datos de las columnas seleccionadas por el usuario
    for (String columna : columnas) {
        for (int i = 0; i < Tabla.getRowCount(); i++) {
            pieDataset.setValue(Tabla.getValueAt(i, Integer.parseInt(columna)).toString(),
                                Double.parseDouble(Tabla.getValueAt(i, Integer.parseInt(columna)).toString()));
        }
    }

    // Crear el gráfico de tipo pie chart con el dataset creado
    JFreeChart chart = ChartFactory.createPieChart("Gráfico de Pastel", pieDataset, true, true, false);

    // Crear un ChartPanel y agregarlo a un JFrame
    ChartPanel chartPanel = new ChartPanel(chart);
    JFrame frame = new JFrame("Gráfico de Pastel");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.getContentPane().add(chartPanel);
    frame.pack();
    frame.setVisible(true);
    
    
    }//GEN-LAST:event_graficasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

 String[] columnasSeleccionadas = columnas.getText().split(",");
int[] posicionesColumnas = new int[columnasSeleccionadas.length];

for (int i = 0; i < columnasSeleccionadas.length; i++) {
    posicionesColumnas[i] = Tabla.getColumn(columnasSeleccionadas[i]).getModelIndex();
}

DefaultCategoryDataset dataset = new DefaultCategoryDataset();

for (int i = 0; i < Tabla.getRowCount(); i++) {
    for (int j = 0; j < posicionesColumnas.length; j++) {
        dataset.addValue(Double.parseDouble(Tabla.getValueAt(i, posicionesColumnas[j]).toString()), 
                          Tabla.getColumnName(posicionesColumnas[j]), 
                          Tabla.getValueAt(i, 0).toString());
    }
}

JFreeChart chart = ChartFactory.createBarChart("Mi gráfico de barras", 
                                                "Columnas seleccionadas", 
                                                "Valor", 
                                                dataset, 
                                                PlotOrientation.VERTICAL, 
                                                true, 
                                                true, 
                                                false);

try {
    ChartUtilities.saveChartAsJPEG(new File("barras.jpg"), chart, 500, 300);
} catch (IOException e) {
    System.err.println("Ocurrió un problema al crear el gráfico de barras.");
}


    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Columnas2;
    private javax.swing.JTextField Filtro;
    private javax.swing.JTextField Filtro1;
    private javax.swing.JTextField Filtro2;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton borrar;
    private javax.swing.JButton btnfil;
    private javax.swing.JTextField columnas;
    private javax.swing.JButton exporta;
    private javax.swing.JButton graficas;
    private javax.swing.JButton importa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
