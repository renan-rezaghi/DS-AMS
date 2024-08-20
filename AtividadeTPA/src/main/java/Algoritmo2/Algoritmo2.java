
package Algoritmo2;

import javax.swing.JOptionPane;

public class Algoritmo2 {
     public static void main(String[] args) {
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso em kg:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura em metros:"));
        double imc = peso / (altura * altura);

        String classificacao;

        if (imc < 18) {
            classificacao = "Magreza";
        } else if (imc >= 18 && imc < 25) {
            classificacao = "Saudável";
        } else if (imc >= 25 && imc < 30) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obesidade";
        }

        JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc + "\nClassificação: " + classificacao);
    }
}
