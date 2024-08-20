
package Algoritmo6;

import javax.swing.JOptionPane;

public class Algoritmo6 {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do nadador:"));

        String categoria;

        if (idade >= 5 && idade <= 7) {
            categoria = "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            categoria = "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            categoria = "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            categoria = "Juvenil B";
        } else if (idade >= 18) {
            categoria = "Senior";
        } else {
            categoria = "Idade fora das categorias";
        }

        JOptionPane.showMessageDialog(null, "Categoria: " + categoria);
    }
}
