
import java.util.Scanner;

public class Menu {
    public static Scanner scanner = new Scanner(System.in);
    public static Funcionario funcionario = new Funcionario(null, null, null, 0);
    public static void main(String[] args) {
        System.out.println("1 - Adicionar gerente");
        System.out.println("2 - Adicionar gerente");
        System.out.println("3 - Listar todos os funcionários");
        System.out.println("4 - Mostrar salário de funcionário (o usuário deve informar o CPF do funcionário)");
        System.out.println("5 - Sair");


        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1 -> {
                funcionario.addGerente();
            }
            case
  
          
        }
        scanner.close();
    }
}
