public class ex2 {
    public static void main(String[] args) {
        int[] inteiros = {1, 5, 50, 7, 9, 10};
        int maior = inteiros[0];

        for (int i = 1; i <= inteiros.length -1; i++) {
            if (inteiros[i] > maior) {
                maior = inteiros[i];
            }
        }

        System.out.print("Maior numero: " + maior);
    }
}
