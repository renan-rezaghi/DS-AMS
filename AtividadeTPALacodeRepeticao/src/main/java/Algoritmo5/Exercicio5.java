
package Algoritmo5;

import java.util.Scanner;

public class Exercicio5 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor inicial: ");
        int valorInicial = scanner.nextInt();
        System.out.print("Digite o valor final: ");
        int valorFinal = scanner.nextInt();

        System.out.println("Números pares entre " + valorInicial + " e " + valorFinal + ":");
        for (int i = Math.min(valorInicial, valorFinal); i <= Math.max(valorInicial, valorFinal); i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
