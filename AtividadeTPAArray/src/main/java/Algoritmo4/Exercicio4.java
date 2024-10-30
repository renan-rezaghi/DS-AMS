
package Algoritmo4;

import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;


public class Exercicio4 {
        public static void main(String[] args) {
        Integer[] numbers = new Integer[50];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.valueOf(JOptionPane.showInputDialog("Digite o número " + (i + 1) + ":"));
        }

        Arrays.sort(numbers, Collections.reverseOrder());  // Ordena em ordem decrescente

        JOptionPane.showMessageDialog(null, "Números em ordem decrescente: " + Arrays.toString(numbers));
    }
}
