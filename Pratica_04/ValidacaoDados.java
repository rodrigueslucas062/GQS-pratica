package Pratica_04;

import java.util.Scanner;

public class ValidacaoDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;
        do {
            System.out.print("Informe a nota (entre 0 e 10): ");
            nota = scanner.nextDouble();
        } while (nota < 0 || nota > 10);
        System.out.println("Nota informada com sucesso.");

        double salario;
        do {
            System.out.print("Informe o salário (maior que zero): ");
            salario = scanner.nextDouble();
        } while (salario <= 0);
        System.out.println("Salário informado com sucesso.");

        char sexo;
        do {
            System.out.print("Informe o sexo (m ou f): ");
            sexo = scanner.next().charAt(0);
        } while (sexo != 'm' && sexo != 'f');
        System.out.println("Sexo informado com sucesso.");

        int idade;
        do {
            System.out.print("Informe a idade (entre 0 e 150): ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);
        System.out.println("Idade informada com sucesso.");

        scanner.close();
    }
}
