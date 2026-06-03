import java.util.ArrayList;
import java.util.Scanner;

import aulaPratica09.Atendente;
import aulaPratica09.Funcionario;
import aulaPratica09.Gerente;

public class Menu {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList <Funcionario> funcionarios = new ArrayList <> ();


    public static Funcionario inputFuncionario(String f) {

        Funcionario funcionario; 
        
        if (f.equals("Gerente")){
            funcionario = new Gerente(null, null, null, 0);
        } else {
            funcionario = new Atendente(null, null, null, 0);
        }

        scanner.nextLine();
        System.out.println("Digite o nome:");
        funcionario.setNome(scanner.nextLine());
        System.out.println("Digite o cpf:");
        funcionario.setCpf(scanner.nextLine());
        System.out.println("Digite a data de nascimento:");
        funcionario.setDataNacimento(scanner.nextLine());
        System.out.println("Digite o salario:");
        funcionario.setSalario(scanner.nextDouble());

        return funcionario;

    }

    public static void main(String[] args) {
        
        int escolha;
        do {
            System.out.println("1 - Adicionar gerente");
            System.out.println("2 - Adicionar atendente");
            System.out.println("3 - Listar todos os funcionários");
            System.out.println("4 - Mostrar salário de funcionário (o usuário deve informar o CPF do funcionário)");
            System.out.println("5 - Sair");
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1 -> funcionarios.add(inputFuncionario("Gerente"));
                
                case 2 -> funcionarios.add(inputFuncionario("Atendente"));

                case 3 -> {
                    if (funcionarios.size() == 0) {
                        System.out.println("Nenhum funcionario encontrado!");
                        break;
                    }

                    System.out.println("----------------------------------------");
                    System.out.println("Funcionarios:");
                    for (Funcionario f : funcionarios) {
                        System.out.println(f.getNome() + "; " + f.getDataNacimento());
                    }
                    System.out.println("----------------------------------------");
                }
                
                case 4 -> {
                    System.out.println("Digite o cpf para ver o salario:");
                    scanner.nextLine();
                    String cpfFuncionairo = scanner.nextLine();
                    for (Funcionario f: funcionarios) {
                        if (f.getCpf().equalsIgnoreCase(cpfFuncionairo)) {
                            System.out.println("nome: " + f.getNome() + "; Salario: " + f.getSalario());
                            break;
                        }
                    }
                    System.out.println("CPF nao encontrado");
                }
            
            }
        } while (escolha != 5);
        scanner.close();

        System.out.println("Programa encerrado...");
    }
}
