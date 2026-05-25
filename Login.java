import javax.swing.*;
public class Login {
    public static void main(String[] args) {
        String usuarioCorrecto = "admin";
        String claveCorrecta = "1234";
        int intentos = 0;
        while (intentos < 3) {
            String usuario = JOptionPane.showInputDialog("Usuario");
            String clave = JOptionPane.showInputDialog("Contraseña");
            if (usuario.equals(usuarioCorrecto)
                    && clave.equals(claveCorrecta)) {
                JOptionPane.showMessageDialog(null,
                        "Bienvenido");
                break;
            } else {
                intentos++;
                JOptionPane.showMessageDialog(null,
                        "Datos incorrectos");
            }
        }
        if (intentos == 3) {
            JOptionPane.showMessageDialog(null,
                    "Cuenta bloqueada");
        }
    }
}