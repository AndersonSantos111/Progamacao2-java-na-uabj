public class ex3 {
    public static boolean  elementoExiste(String[] nomes, String busca) {
        

        for (String i : nomes) {
            if (i.equals(busca)) {
                return  true;
            }
        }
        return false;
        
    }

    public static void main(String[] args) {
        String[] nomes = {"and", "ped", "joh", "cai"};

        System.out.println(elementoExiste(nomes, "joh"));
    }


}
