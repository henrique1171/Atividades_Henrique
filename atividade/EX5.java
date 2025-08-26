import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor original do produto (em R$): ");
        double valorOriginal = scanner.nextDouble();

        System.out.print("Digite o percentual de desconto (%): ");
        double descontoPercentual = scanner.nextDouble();

        double valorDesconto = valorOriginal * (descontoPercentual / 100);
        double novoValor = valorOriginal - valorDesconto;

        System.out.println("O valor com desconto é: R$ " + novoValor);

        scanner.close();
    }
}