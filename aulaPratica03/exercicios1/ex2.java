package exercicios1;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome1, nome2;

        System.out.println("Digite um nome:");
        nome1 = scanner.nextLine();

        System.out.println("Digite mais um nome:");
        nome2 = scanner.nextLine();

        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("Esses nomes sao iguais");
        } else {
            System.out.println("Esses nomes sao diferentes");
        }
        scanner.close();
    }
}
