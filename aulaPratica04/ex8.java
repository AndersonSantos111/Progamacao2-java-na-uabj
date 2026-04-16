import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = scanner.nextInt();
        for (int c = 1; c <= 10; c++) {
            int resultado = numero * c;
            System.out.println(numero + " x " + c + " = " + resultado);
        }

        scanner.close();
    }
}
