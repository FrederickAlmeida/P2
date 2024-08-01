import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 4 números:");
        double soma = 0;
        for(int n = 0; n < 4; n++) {
            soma += scanner.nextDouble();
        }

        System.out.println("A soma dos valores é: " + soma);

        scanner.close();
    }
}