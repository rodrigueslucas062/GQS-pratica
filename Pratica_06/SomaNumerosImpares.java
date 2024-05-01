package Pratica_06;

import javax.swing.JOptionPane;

public class SomaNumerosImpares {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));

        int soma = 0;
        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        JOptionPane.showMessageDialog(null,
                "A soma dos números ímpares entre " + numero1 + " e " + numero2 + " é: " + soma);
    }
}