
package Algoritmo3;

import javax.swing.JOptionPane;

public class Algoritmo3 {
        public static void main(String[] args) {
        String menu = "Escolha uma opção:\n1. BigMac\n2. Quarteirão\n3. MacChicken\n4. Cheddar\n5. Cheese burger";
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

        String lanche;

        switch(opcao) {
            case 1:
                lanche = "BigMac";
                break;
            case 2:
                lanche = "Quarteirão";
                break;
            case 3:
                lanche = "MacChicken";
                break;
            case 4:
                lanche = "Cheddar";
                break;
            case 5:
                lanche = "Cheese burger";
                break;
            default:
                lanche = "Opção inválida!";
                break;
        }

        JOptionPane.showMessageDialog(null, "Você escolheu: " + lanche);
    }
}
