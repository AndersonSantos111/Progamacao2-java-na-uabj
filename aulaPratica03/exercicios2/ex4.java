package exercicios2;
public class ex4 {
    public static void main(String[] args) {
        String x, y, z;
        x = "Programacao";

        y = x.substring(0,7);
        z = x.substring(7, 11);

        System.out.println("Palavras: " + y + " e " + z);
    }
}
