import java.util.Scanner;

public class SalariosMinimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do salário mínimo:");
        double salarioMinimo = scanner.nextDouble();
        System.out.println("Digite o valor do salário do funcionário:");
        double salarioFuncionario = scanner.nextDouble();
        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;
        System.out.println("O funcionário recebe aproximadamente " + quantidadeSalariosMinimos + " salários mínimos.");
        scanner.close();
    }
}
