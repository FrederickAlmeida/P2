public class q2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite 3 notas:");
        double soma = 0;
        for(int n = 0; n < 3; n++) {
            soma += scanner.nextDouble();
        }

        System.out.println("A média das notas é: " + (soma / 3));

        scanner.close();
    }    
}
