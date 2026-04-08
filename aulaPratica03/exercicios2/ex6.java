package exercicios2;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase, palavra;

        System.out.println("Digite uma frase:");
        frase = scanner.nextLine();

        System.out.println("Digite uma palavra");
        palavra = scanner.nextLine();

        int i = frase.indexOf(palavra);
        if (i == -1) {
            System.out.println("A palavra " + palavra + " nao esta na frase: " + frase);
        } else {
            System.out.println("A palava " + palavra + " esta na posicao " + i);
        }

        scanner.close();
    }
}
