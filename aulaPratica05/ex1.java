import java.util.Scanner;

public class ex1 {
    public static double Hipotenusa(double catetox, double catetoy) {
            double hipotenusa;

            double raiz = (catetox * catetox) + (catetoy * catetoy);
            hipotenusa = Math.sqrt(raiz);


            return hipotenusa;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double catetox, catetoy;

        System.out.print("Digite o cateto de x: ");
        catetox = scanner.nextDouble();

        System.out.print("Digite o cateto do y: ");
        catetoy = scanner.nextDouble();

        System.out.println("Valor da hipotenusa: " + Hipotenusa(catetox, catetoy));

        scanner.close();
    }

}
