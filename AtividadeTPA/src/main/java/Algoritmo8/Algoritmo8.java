
package Algoritmo8;

import javax.swing.JOptionPane;

public class Algoritmo8 {
  public static void main(String[] args) {
        double ladoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado A (em cm):"));
        double ladoB = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado B (em cm):"));
        double ladoC = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado C (em cm):"));

        if ((ladoA < ladoB + ladoC) && (ladoB < ladoA + ladoC) && (ladoC < ladoA + ladoB)) {
            String tipo;

            if (ladoA == ladoB && ladoB == ladoC) {
                tipo = "Triângulo Equilátero";
            } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
                tipo = "Triângulo Isósceles";
            } else {
                tipo = "Triângulo Escaleno";
            }

            JOptionPane.showMessageDialog(null, "Os lados formam um " + tipo);
        } else {
            JOptionPane.showMessageDialog(null, "Os lados não formam um triângulo");
        }
    }   
}
