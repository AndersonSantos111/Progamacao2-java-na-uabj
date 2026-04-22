public class ex4 {
    public static int[] contarParesImpares(int[] inteiros) {
        int pares = 0, impares = 0;
        for (int i : inteiros) {
            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        return new int[]{pares, impares};
    }

    public static void main(String[] args) {
        int[] inteiros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] resultado = contarParesImpares(inteiros);
        System.out.println("pares: " + resultado[0]);
        System.out.println("impares: " + resultado[1]);
    }
}
