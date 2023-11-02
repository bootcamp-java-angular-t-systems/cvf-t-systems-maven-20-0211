package Unidad20.EjerciciosUD20.ejercicio1;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejercicio1View {
    public Ejercicio1View() {
        JFrame ventana = new JFrame("Ejercicio1");
        JLabel etiqueta = new JLabel("EJERCICIO 1 UNIDAD 20", SwingConstants.CENTER);
        etiqueta.setFont(new Font("Arial", Font.PLAIN, 24));
        etiqueta.setPreferredSize(new Dimension(400, 200)); 
        ventana.add(etiqueta);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(true);
        ventana.setSize(400, 200);
        ventana.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        ventana.setVisible(true);
    }
}

