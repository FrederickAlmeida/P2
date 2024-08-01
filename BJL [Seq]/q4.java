public class q4 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite a altura do triângulo:");
        double altura = scanner.nextDouble();

        System.out.println("Digite a base do triângulo:");
        double base = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + area);

        scanner.close();
    }    
}
