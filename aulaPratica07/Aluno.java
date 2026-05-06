class Aluno {
    String nome;
    long matricula;
    double nota1, nota2, notaTrabalho;

    Aluno(String nome, long matricula, double nota1, double nota2, double notaTrabalho) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrabalho = notaTrabalho;
    }

    double calcularMedia() {
        double media;
        media = (this.nota1 + this.nota2 + this.notaTrabalho) / 3;
        return media;
    }

    void verificarSituacao() {
        double media = calcularMedia();

        System.out.println("Nome: " + this.nome + "\nMatricula: " + this.matricula);

        if (media >= 7.00) {
            System.out.println("Situacao: Aprovado");
        } else {
            System.out.println("Situacao: Reprovado");
        }
        System.out.println("---------------------------------------------------");
    }

}