package Algoritmo3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        // Criando um vetor para armazenar 50 números
        Integer[] vetorNumeros = new Integer[50];
        // Entrada dos números
        try (Scanner scanner = new Scanner(System.in)) {
            // Entrada dos números
            for (int i = 0; i < vetorNumeros.length; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                vetorNumeros[i] = scanner.nextInt();
            }
            
            // Ordenando os números em ordem crescente
            Arrays.sort(vetorNumeros);
            
            // Exibindo os números em ordem crescente
            System.out.println("Números em ordem crescente:");
            for (Integer numero : vetorNumeros) {
                System.out.println(numero);
            }
        }
    }
}
