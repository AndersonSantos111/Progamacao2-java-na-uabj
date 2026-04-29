package pratica06;

public class Teste {
    public static void main(String[] args) {
        Produto produto1 = new Produto("PC-Gamer", 5600, 5);
        Produto produto2 = new Produto("Cadeira-Gamer", 1200, 50);

        produto1.exibirInfo();
        produto2.exibirInfo();

        System.out.println("Total em estoque de " + produto1.nome + ";, " + produto1.calcularValorTotalEmEstoque());
        System.out.println();

        produto1.adicionarEstoque(10);
        produto1.exibirInfo();
    }
}
