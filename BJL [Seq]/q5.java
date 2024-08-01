public class q5 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite dois números:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double resultado = Math.pow(a, b);

        System.out.println("O resultado da potência é: " + resultado);

        scanner.close();
    }
}
