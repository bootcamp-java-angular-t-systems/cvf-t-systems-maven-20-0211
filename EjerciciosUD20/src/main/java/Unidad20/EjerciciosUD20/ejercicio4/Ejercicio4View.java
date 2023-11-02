package Unidad20.EjerciciosUD20.ejercicio4;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejercicio4View {
	JTextArea areaTexto;
    public Ejercicio4View() {
        JFrame ventana = new JFrame("Ventana de Eventos");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 300);

        JLabel etiqueta = new JLabel("Eventos de ventana:");
        etiqueta.setBounds(10, 10, 200, 20);

        areaTexto = new JTextArea();
        areaTexto.setBounds(10, 40, 380, 220);
        areaTexto.append("Texto inicial\n");

        ventana.add(etiqueta);
        ventana.add(areaTexto);

        ventana.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                areaTexto.append("Ventana abierta\n");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                areaTexto.append("Ventana cerrandose\n");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                areaTexto.append("Ventana cerrada\n");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                areaTexto.append("Ventana minimizada\n");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                areaTexto.append("Ventana restaurada\n");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                areaTexto.append("Ventana activada\n");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                areaTexto.append("Ventana desactivada\n");
            }
        });

        ventana.setLayout(null);
        ventana.setVisible(true);
    }
}
