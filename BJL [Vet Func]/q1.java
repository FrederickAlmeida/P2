import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.print("Digite o primeiro segundo: ");
        num2 = scanner.nextInt();

        maior(num1, num2);
        scanner.close();
    }
    
    static int maior(int a, int b) {
        if (a > b) {
            System.out.println("O maior numéro é " + a);
            return a;

        } else if (b > a) {
            System.out.println("O maior numéro é " + b);
            return b;

        } else {
            System.out.println("Os números são iguais");
            return a;
        }
    }
}