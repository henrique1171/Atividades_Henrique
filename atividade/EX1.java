package atividade;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro nome do marido: ");
        String nomeMarido = scanner.nextLine();

        System.out.print("Digite o sobrenome do marido: ");
        String sobrenomeMarido = scanner.nextLine();

        System.out.print("Digite o primeiro nome da esposa: ");
        String nomeEsposa = scanner.nextLine();

        System.out.print("Digite o sobrenome da esposa: ");
        String sobrenomeEsposa = scanner.nextLine();

        System.out.print("Digite o ano do casamento: ");
        int anoCasamento = scanner.nextInt();

        int anoAtual = 2018;
        int anosCasados = anoAtual - anoCasamento;

        System.out.println(nomeMarido + " " + sobrenomeMarido + " é casado com " +
                nomeEsposa + " " + sobrenomeEsposa + " há " +
                anosCasados + " anos.");

        scanner.close();
    }
}