import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        int valorUnitario = scanner.nextInt();
        System.out.print("Digite a quantidade de vendas: ");
        int quantidadeVendas = scanner.nextInt();

        double totalVendas = 0;
        for (int c = 1; c <= quantidadeVendas; c++) {
            totalVendas += valorUnitario;
        }

        if (totalVendas > 100) {
            double desconto = (totalVendas * 8) / 100;
            totalVendas = totalVendas - desconto;

            System.out.print("Total de vendas com desconto foi " + totalVendas + " reais");

        } else {
            System.out.print("Total de vendas foi " + totalVendas + " reais");
        }

    }
}
