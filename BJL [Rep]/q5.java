import java.util.Scanner;
import java.lang.Math;
public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPrime = true;
        
        System.out.print("Digite um numero: ");
        int num = scanner.nextInt();
        if (num == 2) {
            isPrime = true;

        } else if (num <= 1 || num % 2 == 0) {
            isPrime = false;

        } else {
            for (int i = 3; i < Math.sqrt(num); i += 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " eh primo");
        } else {
            System.out.println(num + " nao eh primo");
        }

        scanner.close();
    }
}
