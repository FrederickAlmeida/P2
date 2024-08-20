import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        int[] nums = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o " + i + "o número: ");
            nums[i-1] = scanner.nextInt();
        }

        if (isFirstGreater(nums[0], nums[1], nums[2])) {
            System.out.println("Condição satisfeita");

        } else {
            System.out.println("Erro");
        }

        scanner.close();
    }

    static boolean isFirstGreater(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return true;

        }

        return false;
    }

}