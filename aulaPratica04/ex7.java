import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();

        String palavrainvertida="";
        for (int c = palavra.length() - 1; c >= 0; c--) {
            palavrainvertida += String.valueOf(palavra.charAt(c));
        }

        System.out.print(palavra + " -> " + palavrainvertida);

        scanner.close();
    }
}
