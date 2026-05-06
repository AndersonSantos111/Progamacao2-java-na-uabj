public class Teste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Pedro", 134357677, 8.1, 9.5, 3.5);
        Aluno aluno2 = new Aluno("Pedrinho", 736484575, 4.1, 7.5, 2.0);

        aluno1.verificarSituacao();
        aluno2.verificarSituacao();
    }
}
