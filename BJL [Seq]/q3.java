public class q3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();

        double novoSalario = salario * 1.25;

        System.out.println("O novo salário do funcionário é: " + novoSalario);

        scanner.close();
    }    
}
