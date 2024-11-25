
package Algoritmo2;

import javax.swing.JOptionPane;


public class Alg2 {
  public static void main(String[] args) {
        int[][] matriz = new int[3][5];
        boolean possuiRepetidos = false;
        int qtdPares = 0;
        int qtdImpares = 0;

        // Preenchendo a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da posição [" + (i + 1) + "][" + (j + 1) + "]:"));

                // Contagem de pares e ímpares
                if (matriz[i][j] % 2 == 0) {
                    qtdPares++;
                } else {
                    qtdImpares++;
                }
            }
        }

        // Verificando elementos repetidos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                for (int x = i; x < 3; x++) {
                    for (int y = (x == i ? j + 1 : 0); y < 5; y++) {
                        if (matriz[i][j] == matriz[x][y]) {
                            possuiRepetidos = true;
                            break;
                        }
                    }
                }
            }
        }

        // Exibindo resultados
        JOptionPane.showMessageDialog(null, "A matriz possui elementos repetidos? " + (possuiRepetidos ? "Sim" : "Não"));
        JOptionPane.showMessageDialog(null, "Quantidade de números pares: " + qtdPares);
        JOptionPane.showMessageDialog(null, "Quantidade de números ímpares: " + qtdImpares);
    }
}
