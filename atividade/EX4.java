import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * (9.0 / 5.0) + 32.0;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        scanner.close();
    }
}