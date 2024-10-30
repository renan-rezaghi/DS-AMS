
package Algoitmo7;

import javax.swing.JOptionPane;

public class Exercicio7 {
     public static void main(String[] args) {
        String[] teams = {
            "Botafogo", "Palmeiras", "Grêmio", "Atlético-MG", "Flamengo", "Fluminense", 
            "São Paulo", "Bragantino", "Cruzeiro", "Internacional", "Corinthians", 
            "Fortaleza", "Santos", "Vasco", "Bahia", "Cuiabá", "Goias", "Coritiba", 
            "América-MG", "Athletico-PR"
        };

        JOptionPane.showMessageDialog(null, "Classificação do Campeonato Brasileiro: " + java.util.Arrays.toString(teams));
    }
}
