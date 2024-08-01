import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para somar;");
        System.out.println("Digite 2 para subtrair;");
        System.out.println("Digite 3 para multiplicar;");
        System.out.println("Digite 4 para dividir;");
        int escolha = scanner.nextInt();

        // Recebe os dois números inteiros
        System.out.print("Insira o primeiro valor: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Insira o segundo valor: ");
        int numero2 = scanner.nextInt();

        // Verifica a escolha do usuário e realiza a operação correspondente
        switch (escolha) {
            case 1:
                int soma = numero1 + numero2;
                System.out.println(numero1 + " + " + numero2 + " = " + soma);
                break;
            case 2:
                int subtracao = numero1 - numero2;
                System.out.println(numero1 + " - " + numero2 + " = " + subtracao);
                break;
            case 3:
                int multiplicacao = numero1 * numero2;
                System.out.println(numero1 + " * " + numero2 + " = " + multiplicacao);
                break;
            case 4:
                if (numero2 != 0) {
                    int divisao = numero1 / numero2;
                    System.out.println(numero1 + " / " + numero2 + " = " + divisao);
                } else {
                    System.out.println("Divisão por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        // Fecha o scanner
        scanner.close();
    }
}
