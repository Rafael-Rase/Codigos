import javax.swing.*;
import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 2) {
            System.out.println("Qual é o primeiro valor? ");
            double valor = scanner.nextDouble();
            System.out.println("Qual é o segundo valor? ");
            double valor1 = scanner.nextDouble();

            scanner.nextLine();
            System.out.println("Valor 1: " + valor + "\nValor 2: " + valor1);
            System.out.println("Digite o tipo de conta?" + "\n" + "soma, subtração, multiplicação, divisão, elevado, sair, voltar");
            String tipo = scanner.nextLine();
            switch (tipo) {
                case "soma" -> soma(valor, valor1);
                case "subtração" -> subtracao(valor, valor1);
                case "multiplicação" -> multiplicacao(valor, valor1);
                case "divisão" -> divisao(valor, valor1);
                case "elevado" -> elevado(valor,valor1);
                case "sair" -> {System.out.println("Encerrando cálculo ");
                    i = i + 3;}
                case "voltar" ->{System.out.println("Voltando");
                    i = 1;}
            }

        }
    }
        static void soma ( double x, double y){
            double resultado = x + y;
            System.out.println(resultado);
        }
        static void subtracao ( double x, double y){
            double resultado = x - y;
            System.out.println(resultado);
        }
        static void multiplicacao ( double x, double y){
            double resultado = x * y;
            System.out.println(resultado);
        }
        static void divisao ( double x, double y){
            double resultado = x / y;
            System.out.println(resultado);
        }
        static void elevado (double x, double y) {
            double resultado = Math.pow(x,y);
            System.out.println(resultado);
        }

    }
