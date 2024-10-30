package Algoritmo2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // Criando um vetor para armazenar 15 nomes
        String[] vetorNomes = new String[15];
        // Entrada dos nomes
        try (Scanner scanner = new Scanner(System.in)) {
            // Entrada dos nomes
            for (int i = 0; i < vetorNomes.length; i++) {
                System.out.print("Digite o nome " + (i + 1) + ": ");
                vetorNomes[i] = scanner.nextLine();
            }
            
            // Ordenando os nomes em ordem decrescente
            Arrays.sort(vetorNomes, Collections.reverseOrder());
            
            // Exibindo os nomes em ordem decrescente
            System.out.println("Nomes em ordem decrescente:");
            for (String nome : vetorNomes) {
                System.out.println(nome);
            }
        }
    }
}
