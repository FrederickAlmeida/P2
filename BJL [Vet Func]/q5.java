import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        int nums[] = new int[5];
        int idx, target;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "o valor: ");
            nums[i] = scanner.nextInt();
        }

        System.out.print("Insira a chave de busca: ");
        target = scanner.nextInt();

        idx = SequentialSearch(nums, target);

        if (idx >= 0) {
            System.out.println("Chave encontrada na posição: " + (idx+1));

        } else {
            System.out.println("Chave não encontrada!");

        }

        scanner.close();
    }

    static int SequentialSearch(int[] a, int b) {
        for (int i = 0; i < 5; i++) {
            if (a[i] == b) {
                return i;
            }
        }

        return -1;
    }
}
