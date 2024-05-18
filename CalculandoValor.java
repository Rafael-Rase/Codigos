
import java.util.Scanner;

public class CalculandoValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float valorBruto;
        float iss;
        float inss;
        float valorLiquido;
        while (true) {
            System.out.println("Quais os valores? ");
            System.out.println("Valor bruto: 'Se não souber digite 0'");
            valorBruto = scanner.nextFloat();

            System.out.println("ISS: 'Se não souber digite a % usando vírgula Ex. 0,10'");
            iss = scanner.nextFloat();
            scanner.nextLine();

            System.out.println("INSS: 'Se não souber digite a % usando vírgula Ex. 0,10'");
            inss = scanner.nextFloat();
            scanner.nextLine();

            System.out.println("Valor líquido: ");
            valorLiquido = scanner.nextFloat();

            scanner.nextLine();

            System.out.println(" \nEsses dados estão corretos?  Sim/Não ");
            System.out.println("Valor bruto: " + valorBruto);
            System.out.println("ISS: " + iss);
            System.out.println("INSS: " + inss);
            System.out.println("Valor líquido: " + valorLiquido);

            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("sim")) {
                break; // Se os dados estão corretos, saia do loop
            } else if (resposta.equalsIgnoreCase("não")) {
                System.out.println("Voltando...");
                continue;
            } else {
                System.out.println("Resposta inválida \n");
                System.out.println("Voltando...");
            }

        }
            while (true) {
                System.out.println("O que você quer calcular ? Valor bruto, valor liquido");
                String conta = scanner.nextLine();
                float porcentagens = iss + inss;
                if (conta.equalsIgnoreCase("valor bruto")) {
                    valorBruto = valorLiquido / (1 - porcentagens);
                    System.out.println("Esse é o valor bruto :" + valorBruto);
                    System.out.println("Lembre-se de arredondar caso necessário \n");
                } else if (conta.equalsIgnoreCase("valor líquido")) {
                    valorLiquido = valorBruto * (1 - porcentagens);
                    System.out.println("Esse é o valor líquido :" + valorLiquido);
                    System.out.println("Lembre-se de arredondar caso necessário \n");
                } else {
                    System.out.println("Resposta Inválida \n");
                }
            }
        }
    }




