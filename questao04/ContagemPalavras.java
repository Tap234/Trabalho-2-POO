package questao04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        frase = frase.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "");

        String[] palavras = frase.split("\\s+");

        Map<String, Integer> contagemPalavras = new HashMap<>();

        for (String palavra : palavras) {
            contagemPalavras.put(palavra, contagemPalavras.getOrDefault(palavra, 0) + 1);
        }

        System.out.println("Ocorrências de cada palavra:");
        for (Map.Entry<String, Integer> entrada : contagemPalavras.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

        scanner.close();
    }
}
