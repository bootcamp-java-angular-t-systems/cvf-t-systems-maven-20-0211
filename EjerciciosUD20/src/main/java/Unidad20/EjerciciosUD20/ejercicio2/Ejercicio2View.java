package Unidad20.EjerciciosUD20.ejercicio2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio2View {
	JLabel etiqueta;
    public Ejercicio2View() {
        JFrame ventana = new JFrame("Botones App");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 150);
        ventana.setLayout(null);

        etiqueta = new JLabel("Último botón: ");
        etiqueta.setBounds(20, 20, 200, 30);

        JButton boton1 = new JButton("Botón 1");
        boton1.setBounds(20, 60, 100, 30);

        JButton boton2 = new JButton("Botón 2");
        boton2.setBounds(140, 60, 100, 30);
        
        boton1.addActionListener(activarBoton1);
        boton2.addActionListener(activarBoton2);

        ventana.add(etiqueta);
        ventana.add(boton1);
        ventana.add(boton2);

        ventana.setVisible(true);
    }
    
    
    ActionListener activarBoton2 = new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		etiqueta.setText("Último botón: Botón 2");
    	}
    };
    
    ActionListener activarBoton1 = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            etiqueta.setText("Último botón: Botón 1");
        }
    };
}