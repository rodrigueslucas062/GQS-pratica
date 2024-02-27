import java.util.Scanner;

public class CalculaEsfera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do raio da esfera:");
        double raio = scanner.nextDouble();
        double comprimento = 2 * Math.PI * raio;
        System.out.println("O comprimento da esfera é: " + comprimento);
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área da esfera é: " + area);
        double volume = (3.0 / 4.0) * Math.PI * Math.pow(raio, 3);
        System.out.println("O volume da esfera é: " + volume);
        scanner.close();
    }
}
