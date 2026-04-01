import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        double valorIgresso = 40.00;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a porcentagem da taxa de servico a ser acrescentada: ");
        String taxaServico = scanner.nextLine();

        System.out.print("Digite o valor do produto: ");
        int valorUnitariop1 = scanner.nextInt();

        System.out.print("Digite a quantidade de vendas: ");
        int quantidadeVendasp1 = scanner.nextInt();


        System.out.print("Digite o valor do produto: ");
        int valorUnitariop2 = scanner.nextInt();

        System.out.print("Digite a quantidade de vendas: ");
        int quantidadeVendasp2 = scanner.nextInt();


        System.out.print(valorUnitariop1 * quantidadeVendasp1 + valorUnitariop2 * quantidadeVendasp2) * (taxaServico1/100 + 1);
    
    }
}
