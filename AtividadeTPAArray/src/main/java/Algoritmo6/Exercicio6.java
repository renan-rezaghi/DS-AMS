
package Algoritmo6;

public class Exercicio6 {
      public static void main(String[] args) {
        Integer[] numbers = new Integer[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 1;  // Apenas números ímpares
        }

        System.out.println("Números ímpares: " + java.util.Arrays.toString(numbers));
    }
}
