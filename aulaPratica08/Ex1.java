import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> compras = new ArrayList<>();

        boolean run = true;

        do {

            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Remover produto");
            System.out.println("4 - Encerra programa");

            int e = scanner.nextInt();
            scanner.nextLine();

            switch (e) {

                case 1:

                    System.out.println("Digite o nome do produto:");
                    String nomeProduto = scanner.nextLine();

                    compras.add(nomeProduto);

                    break;

                case 2:

                    for (int c = 0; c < compras.size(); c++) {

                        System.out.println(c + ". " + compras.get(c));

                    }

                    break;

                case 3:
                    System.out.println("Digitr o indice da palavra que quer excluir:");
                    int indice = scanner.nextInt();

                    compras.remove(indice);

                    System.out.println("Removido");
                    break;

                case 4:
                    run = false;

                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (run);
    }
}