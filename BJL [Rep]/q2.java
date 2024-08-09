import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os valores de A e de B: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a > b) {
            b++;
            while (b < a) {
                System.out.println(b++);
            }
        } else {
            a++;
            while (a < b) {
                System.out.println(a++);
            }
        }

        scanner.close();
    }

}
