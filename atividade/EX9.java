import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();

        double pi = Math.PI;

        double area = pi * raio * raio;             // πR²
        double perimetro = 2 * pi * raio;           // 2πR

        System.out.printf("Área (πR²): %.2f\n", area);
        System.out.printf("Perímetro (2πR): %.2f\n", perimetro);

        scanner.close();
    }
}
