import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calorias extends javax.swing.JFrame {

    private int contadorPedalazos = 0;
    private int contadorCalorias = 0;
    private boolean modoAutomatico = false;

    public Calorias() {
        initComponents();
    }

    private void initComponents() {
        botonPedalIzquierdo = new JButton("Pedal Izquierdo");
        botonPedalDerecho = new JButton("Pedal Derecho");
        botonCambiarModo = new JButton("Cambiar Modo");
        labelPedalazos = new JLabel("Pedalazos: 0");
        labelCalorias = new JLabel("Calorías quemadas: 0");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bicicleta");

        botonPedalIzquierdo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                contarPedalazo();
            }
        });

        botonPedalDerecho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                contarPedalazo();
            }
        });

        botonCambiarModo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cambiarModo();
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(labelPedalazos)
                    .addComponent(labelCalorias)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonPedalIzquierdo)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonPedalDerecho)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCambiarModo)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(botonPedalIzquierdo)
                    .addComponent(botonPedalDerecho)
                    .addComponent(botonCambiarModo))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPedalazos)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCalorias)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }

    private void contarPedalazo() {
        contadorPedalazos++;
        actualizarEtiquetas();
    }

    private void cambiarModo() {
        modoAutomatico = !modoAutomatico;

        if (modoAutomatico) {
            iniciarModoAutomatico();
        }
    }

    private void iniciarModoAutomatico() {
        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                contarPedalazo();
            }
        });
        timer.start();
    }

    private void actualizarEtiquetas() {
        labelPedalazos.setText("Pedalazos: " + contadorPedalazos);

        if (!modoAutomatico) {
            contadorCalorias += 5;
        }

        labelCalorias.setText("Calorías quemadas: " + contadorCalorias);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calorias().setVisible(true);
            }
        });
    }

    private JButton botonPedalIzquierdo;
    private JButton botonPedalDerecho;
    private JButton botonCambiarModo;
    private JLabel labelPedalazos;
    private JLabel labelCalorias;
}