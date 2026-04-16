public class ex6 {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Ale", "Aline", "Clara"};

        System.out.println("Nomes que começam com A:");
        for (String a : nomes) {
            if (a.charAt(0) == 'A'){
                System.out.println(a);
            }
        }
    }
}
