
package Algoritmo1;

import javax.swing.JOptionPane;

public class Alg1 {
        public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int somaImpares = 0;
        int[] somaColunas = new int[5];
        int[] somaLinhas = new int[5];

        // Preenchendo a matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da posição [" + (i + 1) + "][" + (j + 1) + "]:"));

                // Soma dos ímpares
                if (matriz[i][j] % 2 != 0) {
                    somaImpares += matriz[i][j];
                }

                // Soma da coluna e linha
                somaColunas[j] += matriz[i][j];
                somaLinhas[i] += matriz[i][j];
            }
        }

        // Exibindo resultados
        JOptionPane.showMessageDialog(null, "Soma dos números ímpares: " + somaImpares);

        StringBuilder resultadoColunas = new StringBuilder("Soma das colunas:\n");
        for (int j = 0; j < 5; j++) {
            resultadoColunas.append("Coluna ").append(j + 1).append(": ").append(somaColunas[j]).append("\n");
        }
        JOptionPane.showMessageDialog(null, resultadoColunas.toString());

        StringBuilder resultadoLinhas = new StringBuilder("Soma das linhas:\n");
        for (int i = 0; i < 5; i++) {
            resultadoLinhas.append("Linha ").append(i + 1).append(": ").append(somaLinhas[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, resultadoLinhas.toString());
    }
}
