import java.util.Scanner;

public class questao1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double num1, num2;
        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        if (num1 - num2 == 0) {
            System.out.println("Os números são iguais");

        } else if (num1 > num2) {
            System.out.println(num1 + " é o maior número");

        } else {
            System.out.println(num2 + " é o maior número");
        }

        scanner.close();
    }
}