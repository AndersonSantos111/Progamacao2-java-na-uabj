
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade : ");
        int idade = scanner.nextInt();

        if (idade >= 16) {
            System.out.print("Pode votar!");
        } else {
            System.out.print("Nao pode votar!");
        }
    }
}
