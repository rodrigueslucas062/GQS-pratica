package Pratica_04;

import java.util.Scanner;

public class DigitoVerificadorContaCorrente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número da conta corrente de 3 dígitos (ou digite um número negativo para sair):");

        int numeroConta;
        while ((numeroConta = scanner.nextInt()) >= 0) {
            int digitoVerificador = calcularDigitoVerificador(numeroConta);
            System.out.println("O dígito verificador da conta corrente " + numeroConta + " é: " + digitoVerificador);
        }

        scanner.close();
    }

    public static int calcularDigitoVerificador(int numeroConta) {
        int inverso = inverterNumero(numeroConta);
        int soma = numeroConta + inverso;

        int somaMultiplicada = 0;
        int posicao = 0;
        while (soma > 0) {
            int digito = soma % 10;
            somaMultiplicada += digito * posicao;
            soma /= 10;
            posicao++;
        }

        return somaMultiplicada % 10;
    }

    public static int inverterNumero(int numero) {
        int inverso = 0;
        while (numero > 0) {
            int digito = numero % 10;
            inverso = inverso * 10 + digito;
            numero /= 10;
        }
        return inverso;
    }
}
