
package Algoritmo3;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Exercicio3 {
       public static void main(String[] args) {
        Integer[] numbers = new Integer[50];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.valueOf(JOptionPane.showInputDialog("Digite o número " + (i + 1) + ":"));
        }

        Arrays.sort(numbers);  // Ordena em ordem crescente

        JOptionPane.showMessageDialog(null, "Números em ordem crescente: " + Arrays.toString(numbers));
    }
}
