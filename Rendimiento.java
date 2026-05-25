import javax.swing.*;
public class Rendimiento {
    public static void main(String[] args) {
        int puntualidad = Integer.parseInt(
                JOptionPane.showInputDialog("Puntualidad (0-20)"));
        int productividad = Integer.parseInt(
                JOptionPane.showInputDialog("Productividad (0-20)"));
        int cumplimiento = Integer.parseInt(
                JOptionPane.showInputDialog("Cumplimiento (0-20)"));
        double promedio =
                (puntualidad + productividad + cumplimiento) / 3.0;
        if (promedio >= 18) {
            JOptionPane.showMessageDialog(null,
                    "Excelente");
        } else if (promedio >= 14) {
            JOptionPane.showMessageDialog(null,
                    "Bueno");
        } else if (promedio >= 11) {
            JOptionPane.showMessageDialog(null,
                    "Regular");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Deficiente");
        }
    }
}