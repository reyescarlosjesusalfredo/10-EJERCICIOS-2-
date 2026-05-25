import javax.swing.*;
public class Triangulos {
    public static void main(String[] args) {
        double a = Double.parseDouble(
                JOptionPane.showInputDialog("Lado 1"));
        double b = Double.parseDouble(
                JOptionPane.showInputDialog("Lado 2"));
        double c = Double.parseDouble(
                JOptionPane.showInputDialog("Lado 3"));
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                JOptionPane.showMessageDialog(null,
                        "Equilátero");
            } else if (a == b || a == c || b == c) {
                JOptionPane.showMessageDialog(null,
                        "Isósceles");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Escaleno");
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "No forma triángulo");
        }
    }
}