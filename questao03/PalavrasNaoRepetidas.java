package questao03;

import java.util.*;

public class PalavrasNaoRepetidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        String[] palavras = frase.toLowerCase().split("\\s+");

        Set<String> palavrasUnicas = new HashSet<>();
        Set<String> palavrasRepetidas = new HashSet<>();

        for (String palavra : palavras) {
            if (palavrasUnicas.contains(palavra)) {
                palavrasRepetidas.add(palavra);
            } else {
                palavrasUnicas.add(palavra);
            }
        }

        palavrasUnicas.removeAll(palavrasRepetidas);

        System.out.println("Número de palavras não repetidas: " + palavrasUnicas.size());
        System.out.println("Palavras únicas: " + palavrasUnicas);
    }
}

