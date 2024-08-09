import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os valores de A e de B: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        
        if (a % 2 == 1) {
            System.out.println(a);
            a += 2;
        } else {
            a += 1;
        }
        
        while (a <= b) {
            System.out.println(a);
            a+= 2;
        }

        scanner.close();
    }
}
