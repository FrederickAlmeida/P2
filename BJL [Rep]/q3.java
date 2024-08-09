import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        int amount = 0, temp = -1;
        Scanner scanner = new Scanner(System.in);

        while (temp != 0) {
            System.out.print("Digite um numero inteiro: ");
            temp = scanner.nextInt();
            
            if (temp > 0) {
                amount++;
            }
        }

        System.out.println("Quantidade de positivos: " + amount);
        scanner.close();
    }
}
