public class Gerente extends Funcionario {
    public Gerente(String nome, String cpf, String dataNacimento, double salario) {
        super(nome, cpf, dataNacimento, salario);
        
    }

    @Override
    public double getSalario() {
        return super.getSalario() + 2000;
    }
}
