import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.print("Nao pode votar");
        } else if (idade < 18) {
            System.out.print("Nao e obrigado a votar");
        } else {
            System.out.print("E obrigado a votar");
        }


        scanner.close();
    }
}