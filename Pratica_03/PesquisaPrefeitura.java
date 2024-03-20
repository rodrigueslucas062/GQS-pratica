package Pratica_03;
import java.util.Scanner;

public class PesquisaPrefeitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 0;
        double totalSalarios = 0;
        int totalFilhos = 0;

        System.out.println("Informe o salário e o número de filhos de cada habitante (ou digite um salário negativo para sair):");

        double salario;
        while ((salario = scanner.nextDouble()) >= 0) {
            int filhos = scanner.nextInt();

            totalPessoas++;
            totalSalarios += salario;
            totalFilhos += filhos;
        }

        if (totalPessoas == 0) {
            System.out.println("Nenhum habitante informado.");
        } else {
            double mediaSalarial = totalSalarios / totalPessoas;
            double mediaFilhos = (double) totalFilhos / totalPessoas;

            System.out.println("Média salarial da população: " + mediaSalarial);
            System.out.println("Média do número de filhos: " + mediaFilhos);
        }

        scanner.close();
    }
}
