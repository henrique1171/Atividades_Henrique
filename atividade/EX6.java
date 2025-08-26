import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double AUTONOMIA = 12.0; // 12 km por litro

        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempo = scanner.nextDouble();

        System.out.print("Digite a velocidade média durante a viagem (em km/h): ");
        double velocidade = scanner.nextDouble();

        double distancia = tempo * velocidade;

        double litrosUsados = distancia / AUTONOMIA;

        System.out.println("\n--- Resultado da Viagem ---");
        System.out.println("Velocidade média: " + velocidade + " km/h");
        System.out.println("Tempo gasto: " + tempo + " horas");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Combustível utilizado: " + litrosUsados + " litros");

        scanner.close();
    }
}