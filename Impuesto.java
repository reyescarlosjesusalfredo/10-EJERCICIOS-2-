import javax.swing.*;
public class Impuesto {
    public static void main(String[] args) {
        double sueldo = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese sueldo"));
        double impuesto;
        if (sueldo < 0) {
            JOptionPane.showMessageDialog(null,
                    "Entrada inválida");
        } else if (sueldo <= 1000) {
            impuesto = sueldo * 0.05;
            JOptionPane.showMessageDialog(null,
                    "Impuesto: " + impuesto);
        } else if (sueldo <= 5000) {
            impuesto = sueldo * 0.10;
            JOptionPane.showMessageDialog(null,
                    "Impuesto: " + impuesto);
        } else {
            impuesto = sueldo * 0.20;
            JOptionPane.showMessageDialog(null,
                    "Impuesto: " + impuesto);
        }
    }
}