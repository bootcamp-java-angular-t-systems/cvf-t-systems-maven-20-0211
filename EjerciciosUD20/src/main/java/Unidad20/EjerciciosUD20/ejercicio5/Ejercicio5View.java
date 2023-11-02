package Unidad20.EjerciciosUD20.ejercicio5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio5View {
	JTextArea areaTexto;

	public Ejercicio5View() {
		JFrame ventana = new JFrame("Eventos de Ratón");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(400, 300);

		areaTexto = new JTextArea();
		areaTexto.setBounds(10, 10, 380, 200);

		JButton botonLimpiar = new JButton("Limpiar");
		botonLimpiar.setBounds(10, 220, 100, 30);

		botonLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				areaTexto.setText("");
			}
		});

		areaTexto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				areaTexto.append("has hecho click en(" + e.getX() + ", " + e.getY() + ")\n");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				areaTexto.append("raton entrando al área de texto\n");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				areaTexto.append("raton saliendo de la zona de texto\n");
			}
		});

		ventana.setLayout(null);
		ventana.add(areaTexto);
		ventana.add(botonLimpiar);
		ventana.setVisible(true);
	}

}
