package questao02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class InverterFrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        String[] palavras = frase.split(" ");
        List<String> listaPalavras = new ArrayList<>();

        Collections.addAll(listaPalavras, palavras);

        Collections.reverse(listaPalavras);

        String fraseInvertida = String.join(" ", listaPalavras);

        System.out.println("Frase invertida:");
        System.out.println(fraseInvertida);

        scanner.close();
    }
}

