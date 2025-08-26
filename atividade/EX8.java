import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.println("\n--- Antes da troca ---");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        int temp = A;
        A = B;
        B = temp;

        System.out.println("\n--- Após a troca ---");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        scanner.close();
    }
}
