import java.util.Scanner;

public class EX7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro termo(a1):");
        int a1= sc.nextInt();

        System.out.print("Digite a razao(r):");
        int r= sc.nextInt();

        System.out.print("Digite o numero do termo(n):");
        int n= sc.nextInt();

        int an = a1 + (n-1) * r;

        System.out.println("O" + n + "o termo de P.A é:" + an);

        sc.close();
    }
}
