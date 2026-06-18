
import java.util.InputMismatchException;
import java.util.Scanner;


public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean repita = true;
        while (repita) { 
            
            int n1, n2;
            double resultado;
            
            
            try {
                System.out.println("Digite o primeiro numero inteiro:");
                n1 = scanner.nextInt();
                
                System.out.println("Digite o segundo numero inteiro:");
                n2 = scanner.nextInt();
                
                resultado = n1 / n2;
                System.out.println(n1 + " / " + n2 + " = " + resultado);
                repita = false;
            } catch (InputMismatchException e) {
                System.out.println("Infelizmente nao foi possivel fazer essa divisao, confira se digitou apenas numeros inteiros e tente novamente");
                scanner.next();
            } catch (ArithmeticException e) {
                System.out.println("Nao e possivel fazer essa divisao por zero, mude para um numero maior do que zero e tente novamente");
            }
        }
        scanner.close();
    }
}
