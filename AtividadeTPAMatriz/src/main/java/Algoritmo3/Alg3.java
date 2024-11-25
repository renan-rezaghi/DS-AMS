
package Algoritmo3;

import javax.swing.JOptionPane;


public class Alg3 {
      public static void main(String[] args) {
        double[][] matriz = new double[4][4];
        StringBuilder diagonalPrincipal = new StringBuilder("Diagonal Principal:\n");
        StringBuilder diagonalSecundaria = new StringBuilder("Diagonal Secundária:\n");

        // Preenchendo a matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da posição [" + (i + 1) + "][" + (j + 1) + "]:"));

                // Construindo diagonais
                if (i == j) {
                    diagonalPrincipal.append(matriz[i][j]).append(" ");
                }
                if (i + j == 3) { // Verifica a soma dos índices para diagonal secundária
                    diagonalSecundaria.append(matriz[i][j]).append(" ");
                }
            }
        }

        // Exibindo diagonais
        JOptionPane.showMessageDialog(null, diagonalPrincipal.toString());
        JOptionPane.showMessageDialog(null, diagonalSecundaria.toString());
    }
}
