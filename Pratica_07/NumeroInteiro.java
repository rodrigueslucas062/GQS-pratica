package Pratica_07;

import javax.swing.JOptionPane;

public class NumeroInteiro {
    public static void main(String[] args) {
        int[] numeros = lerNumerosInteiros();
        int somaPares = calcularSomaPares(numeros);
        exibirResultados(numeros, somaPares);
    }

    public static int[] lerNumerosInteiros() {
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número:"));
        }
        return numeros;
    }

    public static int calcularSomaPares(int[] numeros) {
        int somaPares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                somaPares += numero;
            }
        }
        return somaPares;
    }

    public static void exibirResultados(int[] numeros, int somaPares) {
        StringBuilder mensagem = new StringBuilder("Vetor: ");
        for (int numero : numeros) {
            mensagem.append(numero).append(" ");
        }
        mensagem.append("\nSoma dos números pares: ").append(somaPares);
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}
