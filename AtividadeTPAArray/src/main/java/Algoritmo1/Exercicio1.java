
package Algoritmo1;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Exercicio1 {
    
    public static void main(String[] args) {
        String[] names = new String[10];

        for (int i = 0; i < names.length; i++) {
            names[i] = JOptionPane.showInputDialog("Digite o nome " + (i + 1) + ":");
        }

        Arrays.sort(names);  // Ordena em ordem crescente

        JOptionPane.showMessageDialog(null, "Nomes em ordem crescente: " + Arrays.toString(names));
    }
}
