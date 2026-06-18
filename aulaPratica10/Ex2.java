// Essa classe seria a classe main.
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        SistemaLogin sistema = new SistemaLogin();

        try {
            sistema.fazerLogin(usuario, senha);
        } catch (LoginInvalidoException e) {
            System.out.println("Acesso Negado: Credenciais incorretas");
        }

        scanner.close();
    }
}

