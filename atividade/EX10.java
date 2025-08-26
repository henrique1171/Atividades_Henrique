import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        double x = scanner.nextDouble();

        System.out.print("Digite o valor de y: ");
        double y = scanner.nextDouble();

        double raiz = Math.sqrt(3 * x + 30);
        double parte1 = raiz / 3;
        double parte2 = (y - 32) / 4;
        double eq = 2 * (parte1 + parte2);

        System.out.printf("Resultado da equação: %.2f\n", eq);

        scanner.close();
    }
}
