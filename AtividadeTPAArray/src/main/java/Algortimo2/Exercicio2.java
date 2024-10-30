
package Algortimo2;

import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Exercicio2 {
        public static void main(String[] args) {
        String[] names = new String[20];

        for (int i = 0; i < names.length; i++) {
            names[i] = JOptionPane.showInputDialog("Digite o nome " + (i + 1) + ":");
        }

        Arrays.sort(names, Collections.reverseOrder());  // Ordena em ordem decrescente

        JOptionPane.showMessageDialog(null, "Nomes em ordem decrescente: " + Arrays.toString(names));
    }
}
