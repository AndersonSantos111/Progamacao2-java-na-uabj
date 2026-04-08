package exercicios2;
public class ex5 {
    public static void main(String[] args) {
        String string;
        string = "Computacao";

        char caractere0, caractere1, caractere2;
        caractere0 = string.charAt(0);
        caractere1 = string.charAt(2);
        int c = string.length() - 1;
        caractere2 = string.charAt(c);



        System.out.println("Primeiro caractere: " + caractere0);
        System.out.println("Terceiro caractere: " + caractere1);
        System.out.println("Ultimo caractere: " + caractere2);
    }
}
