package Algoritmo1;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {
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
            
            // Ordenando os nomes em ordem crescente
            Arrays.sort(vetorNomes);
            
            // Exibindo os nomes em ordem crescente
            System.out.println("Nomes em ordem crescente:");
            for (String nome : vetorNomes) {
                System.out.println(nome);
            }
        }
    }
}
