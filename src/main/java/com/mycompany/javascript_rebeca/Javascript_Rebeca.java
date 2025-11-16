/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.javascript_rebeca;

/**
 *
 * @author Victor
 */
import java.util.Scanner;

public class Javascript_Rebeca {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Escolha o exercicio:");
            System.out.println("1 - Pode Dirigir");
            System.out.println("2 - Maior entre 3");
            System.out.println("3 - Moeda");
            System.out.println("4 - Senha Forte");
            System.out.println("5 - Temperatura");
            System.out.println("6 - Dia da Semana");
            System.out.println("7 - Triangulo");
            System.out.println("8 - Nome Completo");
            System.out.println("9 - Media");
            System.out.println("10 - Telefone");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            int op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    System.out.println(podeDirigir(idade));
                    break;

                case 2:
                    System.out.print("A: ");
                    int a = sc.nextInt();
                    System.out.print("B: ");
                    int b = sc.nextInt();
                    System.out.print("C: ");
                    int c = sc.nextInt();
                    System.out.println("Maior: " + encontrarMaiorEntreTres(a, b, c));
                    break;

                case 3:
                    System.out.print("Valor moeda: ");
                    sc.nextLine();
                    String entrada = sc.nextLine();
                    entrada = entrada.replace(",", ".");
                    double v = Double.parseDouble(entrada);
                    System.out.println(classificarMoeda(v));
                    break;

                case 4:
                    System.out.print("Senha: ");
                    sc.nextLine();
                    String s = sc.nextLine();
                    System.out.println(senhaForte(s));
                    break;

                case 5:
                    System.out.print("Temperatura: ");
                    int t = sc.nextInt();
                    System.out.println(checarTemperatura(t));
                    break;

                case 6:
                    System.out.print("Numero dia: ");
                    int d = sc.nextInt();
                    System.out.println(nomeDoDia(d));
                    break;

                case 7:
                    System.out.print("L1: ");
                    int L1 = sc.nextInt();
                    System.out.print("L2: ");
                    int L2 = sc.nextInt();
                    System.out.print("L3: ");
                    int L3 = sc.nextInt();
                    System.out.println(tipoTriangulo(L1, L2, L3));
                    break;

                case 8:
                    sc.nextLine();
                    System.out.print("Primeiro nome: ");
                    String p = sc.nextLine();
                    System.out.print("Sobrenome: ");
                    String sn = sc.nextLine();
                    System.out.println(gerarNomeCompleto(p, sn));
                    break;

                case 9:
                    System.out.print("Nota 1: ");
                    double n1 = sc.nextDouble();
                    System.out.print("Nota 2: ");
                    double n2 = sc.nextDouble();
                    System.out.println(calcularMediaSimples(n1, n2));
                    break;

                case 10:
                    sc.nextLine();
                    System.out.print("Telefone (8 digitos): ");
                    String tel = sc.nextLine();
                    System.out.println(formatarTelefone(tel));
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    return;

                default:
                    System.out.println("Opcao invalida");
            }


            System.out.print("\nDeseja voltar ao menu? (s/n): ");
            char voltar = sc.next().charAt(0);
            sc.nextLine();

            if (voltar == 's' || voltar == 'S') {
                System.out.println();
                continue;
            }

            System.out.println("Programa encerrado.");
            return;
        }
    }

    public static String podeDirigir(int idade) {
        if (idade >= 18) {
            return "Pode ser habilitado(a)";
        }
        return "Ainda Nao pode";
    }

    public static int encontrarMaiorEntreTres(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        }
        return c;
    }

    public static String classificarMoeda(double valor) {
        if (valor == 0.01) return "1 centavo";
        if (valor == 0.05) return "5 centavos";
        if (valor == 0.10) return "10 centavos";
        if (valor == 0.25) return "25 centavos";
        if (valor == 0.50) return "50 centavos";
        if (valor == 1.00) return "1 real";
        return "Desconhecido";
    }

    public static boolean senhaForte(String senha) {
        return senha.length() > 8 && !senha.equals("12345678");
    }

    public static String checarTemperatura(int t) {
        if (t < 10) return "Frio";
        if (t <= 25) return "Ideal";
        return "Calor";
    }

    public static String nomeDoDia(int n) {
        switch (n) {
            case 1: return "Domingo";
            case 2: return "Segunda";
            case 3: return "Terca";
            case 4: return "Quarta";
            case 5: return "Quinta";
            case 6: return "Sexta";
            case 7: return "Sabado";
            default: return "Invalido";
        }
    }

    public static String tipoTriangulo(int L1, int L2, int L3) {
        if (L1 == L2 && L2 == L3) return "Equilatero";
        if (L1 == L2 || L1 == L3 || L2 == L3) return "Isosceles";
        return "Escaleno";
    }

    public static String gerarNomeCompleto(String p, String s) {
        return p + " " + s;
    }

    public static String calcularMediaSimples(double n1, double n2) {
        double m = (n1 + n2) / 2;
        if (m >= 7) return "Aprovado";
        return "Reprovado";
    }

    public static String formatarTelefone(String num) {
        if (num.length() != 8) return "Invalido";
        return num.substring(0, 4) + "-" + num.substring(4);
    }
}
