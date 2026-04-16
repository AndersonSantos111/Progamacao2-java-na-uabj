import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int litrosVendidos;
        float precoGasolina, precoAlcool, precototal=0, precofinal=0, porcentoDesconto=0;
        String tipoCombustivel;

        precoGasolina = 6.00f;
        precoAlcool = 4.50f;
        System.out.println("Digite o numero de litros vendidos:");
        litrosVendidos = scanner.nextInt();

        scanner.nextLine(); // esvazia para que não ocorra o bug no scanner seguinte


        System.out.println("Digite o tipo de combustivel A para (alcool) e B para (gasolina):");
        tipoCombustivel = scanner.nextLine().toUpperCase();

        switch (tipoCombustivel) { // tipo de A ou B combustivel
            case "A" -> {
                if (litrosVendidos < 21) {
                    float desconto;
                    porcentoDesconto = 3;

                    precototal = precoAlcool * litrosVendidos; //total em litros
                    desconto = (precototal * porcentoDesconto) / 100;
                    precofinal = precototal - desconto;
            
                } else {
                    float desconto;
                    porcentoDesconto = 5;

                    precototal = precoAlcool * litrosVendidos; //total em litros
                    desconto = (precototal * porcentoDesconto) / 100;
                    precofinal = precototal - desconto;
                }
            }
            case "B" -> {
                if (litrosVendidos < 21) {
                    float desconto;
                    porcentoDesconto = 4;

                    precototal = precoGasolina * litrosVendidos; //total em litros
                    desconto = (precototal * porcentoDesconto) / 100;
                    precofinal = precototal - desconto;

                } else {
                    float desconto;
                    porcentoDesconto = 6;

                    precototal = precoGasolina * litrosVendidos; //total em litros
                    desconto = (precototal * porcentoDesconto) / 100;
                    precofinal = precototal - desconto;

                }
            }
            default -> System.out.println("Essa opcao nao existe!");
        }

        // Resultado:
        System.out.print("-Tipo de combustivel: " + tipoCombustivel + "\n-Preco total do combustivel: " + precototal + "\n-Preco total com desconto de " + porcentoDesconto + "%: " + precofinal);

        scanner.close();
    }
}
