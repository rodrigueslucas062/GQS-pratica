package Pratica_07;

import javax.swing.JOptionPane;

public class NumeroInteiro {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int somaPares = 0;

        for (int i = 0; i < 10; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número:"));
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
            }
        }

        StringBuilder mensagem = new StringBuilder("Vetor: ");
        for (int numero : numeros) {
            mensagem.append(numero).append(" ");
        }
        mensagem.append("\nSoma dos números pares: ").append(somaPares);

        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}