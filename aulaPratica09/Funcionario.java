import java.util.Scanner;

public class Funcionario {
    Scanner scanner = new Scanner(System.in);

    private String nome, cpf, dataNascimento;
    private double salario;

    public Funcionario(String nome, String cpf, String dataNascimento, double salario){
        this.nome =  nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNacimento() {
        return dataNascimento;
    }

    public void setDataNacimento(String dataNacimento) {
        this.dataNascimento = dataNacimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
