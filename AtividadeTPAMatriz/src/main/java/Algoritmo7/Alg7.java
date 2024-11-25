
package Algoritmo7;

import javax.swing.JOptionPane;


public class Alg7 {
public static void main(String[] args) {
        char[][] tabuleiro = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        char jogadorAtual = 'X';
        boolean venceu = false;
        int jogadas = 0;

        while (!venceu && jogadas < 9) {
            // Exibe o tabuleiro
            StringBuilder tabuleiroAtual = new StringBuilder("Tabuleiro atual:\n");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    tabuleiroAtual.append(tabuleiro[i][j]).append(" ");
                }
                tabuleiroAtual.append("\n");
            }
            JOptionPane.showMessageDialog(null, tabuleiroAtual.toString());

            // Solicita a jogada
            int linha = Integer.parseInt(JOptionPane.showInputDialog("Jogador " + jogadorAtual + ", informe a linha (1-3):")) - 1;
            int coluna = Integer.parseInt(JOptionPane.showInputDialog("Jogador " + jogadorAtual + ", informe a coluna (1-3):")) - 1;

            // Valida a jogada
            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
                JOptionPane.showMessageDialog(null, "Jogada inválida. Tente novamente.");
                continue;
            }

            // Faz a jogada
            tabuleiro[linha][coluna] = jogadorAtual;
            jogadas++;

            // Verifica se o jogador atual venceu
            venceu = verificaVencedor(tabuleiro, jogadorAtual);

            // Alterna o jogador
            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }

        // Exibe o resultado final
        StringBuilder tabuleiroFinal = new StringBuilder("Tabuleiro final:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiroFinal.append(tabuleiro[i][j]).append(" ");
            }
            tabuleiroFinal.append("\n");
        }

        if (venceu) {
            JOptionPane.showMessageDialog(null, tabuleiroFinal.toString() + "Parabéns! O jogador " + (jogadorAtual == 'X' ? 'O' : 'X') + " venceu!");
        } else {
            JOptionPane.showMessageDialog(null, tabuleiroFinal.toString() + "Empate! Nenhum jogador venceu.");
        }
    }

    public static boolean verificaVencedor(char[][] tabuleiro, char jogador) {
        for (int i = 0; i < 3; i++) {
            // Verifica linhas
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
            // Verifica colunas
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) {
                return true;
            }
        }
        // Verifica diagonais
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
            return true;
        }
        return false;
    }
}
