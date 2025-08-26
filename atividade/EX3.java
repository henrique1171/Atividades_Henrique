import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade (em anos): ");
        int idade = scanner.nextInt();

        int diasDeVida = idade * 365;

        System.out.println(nome + ", você viveu aproximadamente " + diasDeVida + " dias.");

        scanner.close();
    }
}