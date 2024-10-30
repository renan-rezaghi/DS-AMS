package Algoritmo4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio4 {
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
            
            // Ordenando os números em ordem decrescente
            Arrays.sort(vetorNumeros, Collections.reverseOrder());
            
            // Exibindo os números em ordem decrescente
            System.out.println("Números em ordem decrescente:");
            for (Integer numero : vetorNumeros) {
                System.out.println(numero);
            }
        }
    }
}
