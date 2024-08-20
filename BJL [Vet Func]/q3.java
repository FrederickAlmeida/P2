import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = scanner.nextInt();

        if (parImpar(num)) {
            System.out.println(num + " é par");

        } else {
            System.out.println(num + " é impar");
        }

        scanner.close();
    }

    static boolean parImpar(int num) {
        if (num % 2 == 0) {
            return true;

        }

        return false;
    }
}
