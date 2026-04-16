public class ex5 {
    public static void main(String[] args) {
        int[] notas = {7, 8, 6, 10, 9};
        int soma=0;
        float media;
        for (int c = 0; c < notas.length; c++) {
            soma += notas[c];
        }
        
        media = soma / notas.length;

        System.out.println("Media: " + media);

        int acimaDaMedia=0;
        for (int c = 0; c < notas.length; c++) {
            if (notas[c] > media) {
                acimaDaMedia++;
            }
        }

        System.out.println("Notas acima da media: " + acimaDaMedia);
    }
}
