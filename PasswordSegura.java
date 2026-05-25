import javax.swing.*;
public class PasswordSegura {
    public static void main(String[] args) {
        String clave = JOptionPane.showInputDialog(
                "Ingrese contraseña");
        boolean mayuscula = false;
        boolean numero = false;
        boolean simbolo = false;
        for (int i = 0; i < clave.length(); i++) {
            char c = clave.charAt(i);
            if (Character.isUpperCase(c)) {
                mayuscula = true;
            }
            if (Character.isDigit(c)) {
                numero = true;
            }
            if (!Character.isLetterOrDigit(c)) {
                simbolo = true;
            }
        }
        if (clave.length() < 8) {
            JOptionPane.showMessageDialog(null,
                    "Debe tener mínimo 8 caracteres");
        } else if (!mayuscula) {
            JOptionPane.showMessageDialog(null,
                    "Falta mayúscula");
        } else if (!numero) {
            JOptionPane.showMessageDialog(null,
                    "Falta número");
        } else if (!simbolo) {
            JOptionPane.showMessageDialog(null,
                    "Falta símbolo");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Contraseña segura");
        }
    }
}