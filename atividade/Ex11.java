import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Digite y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Digite x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Digite y2: ");
        double y2 = scanner.nextDouble();

        double deltaX = x2 - x1;
        double deltaY = y2 - y1;

        double distancia = Math.sqrt(deltaX * deltaX + deltaY * deltaY);

        System.out.printf("Distância euclidiana entre A e B: %.2f\n", distancia);

        scanner.close();
    }
}
