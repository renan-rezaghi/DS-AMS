
package Algoritmo5;

import javax.swing.JOptionPane;

public class Algoritmo5 {
     public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota:"));

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        String conceito;
        String status;

        if (media >= 9) {
            conceito = "A";
            status = "Aprovado";
        } else if (media >= 7) {
            conceito = "B";
            status = "Aprovado";
        } else if (media >= 6) {
            conceito = "C";
            status = "Aprovado";
        } else if (media >= 3.5) {
            conceito = "D";
            status = "Reprovado";
        } else {
            conceito = "E";
            status = "Reprovado";
        }

        JOptionPane.showMessageDialog(null, "Média: " + media + "\nConceito: " + conceito + "\nStatus: " + status);
    }
}
