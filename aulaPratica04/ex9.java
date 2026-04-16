import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int senha;

        do {
            System.out.println("Digite a senha");
            senha = scanner.nextInt();
        } while(senha != 2006);

        System.out.print("Acesso permitido");
        

        scanner.close();
    }
}
