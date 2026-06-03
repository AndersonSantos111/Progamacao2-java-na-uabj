import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList <Funcionario> funcionarios = new ArrayList <> ();

    private String nome, cpf, dataNacimento;
    private double salario;

    public Funcionario(String nome, String cpf, String dataNascimento, double salario){
        this.nome =  nome;
        this.cpf = cpf;
        this.dataNacimento = dataNascimento;
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
        return dataNacimento;
    }

    public void setDataNacimento(String dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public void addGerente() {
        
        funcionarios.add(new Gerente());
    }

    public void addAtendente() {
        funcionarios.add(new Atendente());
    }
}
