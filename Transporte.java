import javax.swing.*;
public class Transporte {
    public static void main(String[] args) {
        double distancia = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese distancia"));
        String usuario = JOptionPane.showInputDialog(
                "Tipo: estudiante, adulto, adulto mayor");
        String horario = JOptionPane.showInputDialog(
                "Horario: normal o nocturno");
        double costo = distancia * 2;
        if (usuario.equalsIgnoreCase("estudiante")) {
            costo *= 0.5;
        } else if (usuario.equalsIgnoreCase("adulto mayor")) {
            costo *= 0.7;
        }
        if (horario.equalsIgnoreCase("nocturno")) {
            costo += 5;
        }
        JOptionPane.showMessageDialog(null,
                "Costo total: " + costo);
    }
}