import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        double valorIgresso = 40.00;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tipo de ingresso: ");
        String IouM = scanner.nextLine();

        // I
        if (IouM.equals("I") || IouM.equals("i")) {
            System.out.print("O valor a ser pago e " + valorIgresso);
        } else if (IouM.equals("M") || IouM.equals("m")) {
            double meiaentrada = valorIgresso / 2;
            System.out.print("O valor a ser pago e " + meiaentrada);
        } else {
            System.out.print("Valor invalido!");
        }
        
    }
}
