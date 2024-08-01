import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Insira o segundo valor: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            int multiplicacao = numero1 * numero2;
            System.out.println(numero1 + " * " + numero2 + " = " + multiplicacao);

        } else if (numero1 > numero2) {
            int subtracao = numero1 - numero2;
            System.out.println(numero1 + " - " + numero2 + " = " + subtracao);

        } else {
            int soma = numero1 + numero2;
            System.out.println(numero1 + " + " + numero2 + " = " + soma);
        }

        scanner.close();
    }
}
