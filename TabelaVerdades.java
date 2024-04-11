import java.util.Scanner;

public class TabelaVerdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (i < 3) {
            System.out.println("Digite 'v' ou 'f':");
            String entrada = scanner.nextLine();

            boolean valor1;
            if (entrada.equals("v")) {
                valor1 = true;
            } else if (entrada.equals("f")) {
                valor1 = false;
            } else {
                System.out.println("Entrada inválida.");
                return;
            }

            System.out.println("Digite 'v' ou 'f':");
            String entrada1 = scanner.nextLine();

            boolean valor;
            if (entrada1.equals("v")) {
                valor = true;
            } else if (entrada1.equals("f")) {
                valor = false;
            } else {
                System.out.println("Entrada inválida.");
                return;
            }
            System.out.println("O valor lido é: " + valor1 );
            System.out.println("O valor lido é: " + valor );

            System.out.println("Qual será o simbolo da operação? 'e', 'ou', 'se então', 'se somente se, 'sair'");
            String simbolo = scanner.nextLine();
            switch (simbolo) {
                case "e": e(valor1, valor);
                    break;
                case "ou": ou(valor1, valor);
                    break;
                case "ou ou": ouou(valor1, valor);
                    break;
                case "se então": seentao(valor1, valor);
                    break;
                case "se somente se": sesomentese(valor1, valor);
                    break;
                case "sair": {System.out.println("Fim do programa");
                    i = i + 5;
                    break;}
            }
        }
    }

    static void e(boolean x, boolean y) {
        if (x && y) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    static void ou(boolean x, boolean y) {
        if (x || y) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    static void ouou(boolean x, boolean y) {
        if (x != y) {
            System.out.println("True");
    } else {
            System.out.println("False");}
    }
    static void seentao(boolean x, boolean y) {
        if (x && !y) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
    static void sesomentese(boolean x, boolean y) {
        if (x == y) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
//sla = scanner.nextLine(System.ou.println("Oq vc quer?" + "\n[0] - false" + "\n[1] - true"))