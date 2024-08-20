
package Algoritmo1;

import javax.swing.JOptionPane;

public class Algoritmo1 {
     public static void main(String[] args) {
        int hora = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de início do turno (0-23):"));

        if (hora >= 5 && hora < 13) {
            JOptionPane.showMessageDialog(null, "Turno: Manhã");
        } else if (hora >= 13 && hora < 18) {
            JOptionPane.showMessageDialog(null, "Turno: Tarde");
        } else {
            JOptionPane.showMessageDialog(null, "Turno: Noite");
        }
    }
}
