package Pratica_06;

import javax.swing.JOptionPane;

public class MaiorMenorNumero {
    public static void main(String[] args) {
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (true) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número ou -1 para sair: "));
            if (numero == -1) {
                break;
            }
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
            JOptionPane.showMessageDialog(null, "Nenhum número informado");
        } else {
            JOptionPane.showMessageDialog(null, "O maior numero informado é: " + maior + "\nO menor número informado é" + menor);
        }
    }
}
