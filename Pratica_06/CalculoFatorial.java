package Pratica_06;

import javax.swing.JOptionPane;

public class CalculoFatorial {
    public static void main(String[] args) {
        int numero = Integer
                .parseInt(JOptionPane.showInputDialog("Informe o número natural para calcular o fatorial"));

        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "numero inválido. Informe um número positivo.");
        } else {
            long fatorial = calcularFatorial(numero);
            JOptionPane.showMessageDialog(null, "O fatorial de " + numero + "é " + fatorial);
        }
    }

    private static long calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }
        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
