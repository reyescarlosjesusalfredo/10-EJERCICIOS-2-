import javax.swing.*;
public class RiesgoCrediticio {
    public static void main(String[] args) {
        double ingreso = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese ingreso mensual"));
        String historial = JOptionPane.showInputDialog(
                "Ingrese historial: bueno, regular o malo");
        int edad = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese edad"));
        if (ingreso >= 3000) {
            if (historial.equalsIgnoreCase("bueno")) {
                if (edad >= 25) {
                    JOptionPane.showMessageDialog(null,
                            "Riesgo Bajo");
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Riesgo Medio");
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "Riesgo Medio");
            }
        } else {
            if (historial.equalsIgnoreCase("malo")) {
                JOptionPane.showMessageDialog(null,
                        "Riesgo Alto");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Riesgo Medio");
            }
        }
    }
}