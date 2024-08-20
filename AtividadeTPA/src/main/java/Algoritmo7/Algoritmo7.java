
package Algoritmo7;

import javax.swing.JOptionPane;

public class Algoritmo7 {
     public static void main(String[] args) {
        int dia1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da primeira data:"));
        int mes1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês da primeira data:"));
        int ano1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da primeira data:"));

        int dia2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da segunda data:"));
        int mes2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês da segunda data:"));
        int ano2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da segunda data:"));

        String data1 = dia1 + "/" + mes1 + "/" + ano1;
        String data2 = dia2 + "/" + mes2 + "/" + ano2;

        String resultado;

        if (ano1 < ano2 || (ano1 == ano2 && mes1 < mes2) || (ano1 == ano2 && mes1 == mes2 && dia1 < dia2)) {
            resultado = data1 + " vem antes de " + data2;
        } else if (ano1 > ano2 || (ano1 == ano2 && mes1 > mes2) || (ano1 == ano2 && mes1 == mes2 && dia1 > dia2)) {
            resultado = data2 + " vem antes de " + data1;
        } else {
            resultado = "As datas são iguais";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
