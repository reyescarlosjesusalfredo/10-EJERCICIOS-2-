import javax.swing.*;
public class CajeroATM {
    public static void main(String[] args) {
        int pinCorrecto = 1234;
        int intentos = 0;
        boolean acceso = false;
        while (intentos < 3) {
            int pin = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese PIN"));
            if (pin == pinCorrecto) {
                acceso = true;
                break;
            } else {
                intentos++;
                JOptionPane.showMessageDialog(null,
                        "PIN incorrecto");
            }
        }
        if (acceso) {
            double saldo = 1000;
            String opcion = JOptionPane.showInputDialog(
                    "1. Retirar\n2. Ver saldo");
            int op = Integer.parseInt(opcion);
            if (op == 1) {
                double retiro = Double.parseDouble(
                        JOptionPane.showInputDialog("Monto a retirar"));
                if (retiro > 500) {
                    JOptionPane.showMessageDialog(null,
                            "Supera límite diario");
                } else if (retiro > saldo) {
                    JOptionPane.showMessageDialog(null,
                            "Fondos insuficientes");
                } else {
                    saldo -= retiro;
                    JOptionPane.showMessageDialog(null,
                            "Retiro exitoso\nSaldo: " + saldo);
                }
            } else if (op == 2) {
                JOptionPane.showMessageDialog(null,
                        "Saldo actual: " + saldo);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Opción inválida");
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Cuenta bloqueada");
        }
    }
}