import javax.swing.*;

public class SistemaBecas {

    public static void main(String[] args) {

        double promedio = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese promedio"));

        double ingresos = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese ingresos familiares"));

        int cursos = Integer.parseInt(
                JOptionPane.showInputDialog("Cursos desaprobados"));

        if (promedio >= 16 && ingresos < 2000 && cursos == 0) {

            JOptionPane.showMessageDialog(null,
                    "Beca completa");

        } else if (promedio >= 14 && ingresos < 2500 && cursos <= 2) {

            JOptionPane.showMessageDialog(null,
                    "Media beca");

        } else {

            JOptionPane.showMessageDialog(null,
                    "No recibe beca");
        }
    }
}