package WindowEvent;

import java.awt.*;
import java.awt.event.*;

public class MiVentana implements WindowListener {
    private final Frame ventana;

    public MiVentana() {
        ventana = new Frame("Ejemplo de WindowsListener");
        ventana.setSize(300, 200);
        ventana.addWindowListener(this);
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new MiVentana();
    }

    public void windowOpened(WindowEvent e) {
        System.out.println("La ventana ha sido abierta.");
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("La ventana está siendo cerrada.");
        ventana.dispose();
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("La ventana ha sido cerrada.");
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("La ventana ha sido minimizada.");
    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println("La ventana ha sido restaurada.");
    }

    public void windowActivated(WindowEvent e) {
        System.out.println("La ventana ha sido activada.");
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("La ventana ha sido desactivada.");
    }
}
