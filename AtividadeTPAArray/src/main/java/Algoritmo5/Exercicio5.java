
package Algoritmo5;

public class Exercicio5 {
    
 public static void main(String[] args) {
        Integer[] numbers = new Integer[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;  // Apenas números pares
        }

        System.out.println("Números pares: " + java.util.Arrays.toString(numbers));
    }
}
