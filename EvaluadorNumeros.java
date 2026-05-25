import javax.swing.*;
public class EvaluadorNumeros {
    public static void main(String[] args) {
        int numero = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese número"));
        if (numero > 0) {
            JOptionPane.showMessageDialog(null,
                    "Positivo");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null,
                    "Negativo");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Es cero");
        }
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null,
                    "Es par");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Es impar");
        }
        if (numero % 3 == 0 && numero % 5 == 0) {
            JOptionPane.showMessageDialog(null,
                    "Múltiplo de 3 y 5");
        } else if (numero % 3 == 0) {
            JOptionPane.showMessageDialog(null,
                    "Múltiplo de 3");
        } else if (numero % 5 == 0) {
            JOptionPane.showMessageDialog(null,
                    "Múltiplo de 5");
        } else {
            JOptionPane.showMessageDialog(null,
                    "No es múltiplo de 3 ni 5");
        }
    }
}