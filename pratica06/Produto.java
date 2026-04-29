package pratica06;

class Produto {
    String nome;
    double preco;
    int quantidadeTotalEstoque;
    Produto(String nome, double preco, int quantidadeTotalInicialEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeTotalEstoque = quantidadeTotalInicialEstoque;
    }

    void exibirInfo() {
        System.out.println("nome: " + this.nome);
        System.out.println("preco: " + this.preco);
        System.out.println("Total Estoque: " + this.quantidadeTotalEstoque);
        System.out.println();
    }

    double calcularValorTotalEmEstoque() {
        return this.preco * this.quantidadeTotalEstoque;
    }

    void adicionarEstoque(int quantidade) {
        this.quantidadeTotalEstoque += quantidade;
    }
}
