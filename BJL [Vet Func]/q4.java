import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        double nums[] = new double[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "o valor: ");
            nums[i] = scanner.nextInt();
        }

        dividir100(nums);
        System.out.println("Conteúdo dividido por 100");
        for (int i = 0; i < 5; i++) {
            System.out.println(nums[i]);
        }

        scanner.close();
    }

    static void dividir100(double[] a) {
        for (int i = 0; i < 5; i++) {
            a[i] = a[i]/100.0;
        }
    }
}
