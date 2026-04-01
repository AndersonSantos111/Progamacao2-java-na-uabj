
import java.util.Scanner;



public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int inteiro = scanner.nextInt();
        System.out.println(inteiro);

        int dobro = inteiro * 2;
        int triplo = inteiro * 3;

        System.out.println("Dobro: " + dobro);
        System.out.println("Triplo: " + triplo);
    }
}