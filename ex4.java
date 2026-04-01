import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite do litro: ");
        int litro = scanner.nextInt();

        System.out.print("Digite o valor que vc tem: ");
        int valorSeu = scanner.nextInt();

        int podeComprarN;
        podeComprarN = valorSeu / litro;
        
        System.out.println("A quantidade que voce pode comprar " + podeComprarN + " litros");

    }
}
