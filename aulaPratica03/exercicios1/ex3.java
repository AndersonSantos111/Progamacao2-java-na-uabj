package exercicios1;


import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palvra:");
        String palavra = scanner.nextLine();

        int caracteres = palavra.length();
        System.out.println("A palavra " + palavra + " tem " + caracteres + " caracteres.");

        scanner.close();
    }
}