import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dividendo (número inteiro): ");
        int dividendo = scanner.nextInt();

        System.out.print("Digite o divisor (número inteiro): ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } else {
            int quociente = dividendo / divisor;
            int resto = dividendo % divisor;

            System.out.println("Dividendo = " + dividendo);
            System.out.println("Divisor = " + divisor);
            System.out.println("Quociente = " + quociente);
            System.out.println("Resto = " + resto);
        }

        scanner.close();
    }
}