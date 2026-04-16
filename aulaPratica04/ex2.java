import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do nadador:");
        int idade = scanner.nextInt();

        if (idade < 5) {
            System.out.print("idade invalida!");
        } else if (idade <= 7) {
            System.out.println("Infantil A");
        } else if (idade <= 10) {
            System.out.println("Infantil B");
        } else if (idade <= 13) {
            System.out.println("Juvenil A");
        } else if (idade <=17) {
            System.out.println("Juvenil B");
        } else {
            System.out.println("Adulto");
        }

        scanner.close();
    }
}
