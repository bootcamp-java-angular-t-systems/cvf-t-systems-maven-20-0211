package Unidad20.EjerciciosUD20.ejercicio3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio3View {
    private int contadorBoton1 = 0;
    private int contadorBoton2 = 0;
    private JLabel etiqueta1;
    private JLabel etiqueta2;

    public Ejercicio3View() {
        JFrame ventana = new JFrame("Contador de Clicks");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 200);

        etiqueta1 = new JLabel("Botón 1: 0 clics");
        etiqueta1.setBounds(20, 20, 120, 30);

        etiqueta2 = new JLabel("Botón 2: 0 clics");
        etiqueta2.setBounds(20, 60, 120, 30);

        JButton boton1 = new JButton("Botón 1");
        boton1.setBounds(150, 20, 100, 30);

        JButton boton2 = new JButton("Botón 2");
        boton2.setBounds(150, 60, 100, 30);

        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contadorBoton1++;
                etiqueta1.setText("Botón 1: " + contadorBoton1 + " clics");
            }
        });

        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contadorBoton2++;
                etiqueta2.setText("Botón 2: " + contadorBoton2 + " clics");
            }
        });

        ventana.setLayout(null);
        ventana.add(etiqueta1);
        ventana.add(etiqueta2);
        ventana.add(boton1);
        ventana.add(boton2);
        ventana.setVisible(true);
    }
}
