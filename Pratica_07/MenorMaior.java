package Pratica_07;

import javax.swing.JOptionPane;

public class MenorMaior {
    public static void main(String[] args) {
        double[] numeros = new double[10];
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i + 1) + "ª número real:"));
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        StringBuilder mensagem = new StringBuilder("vetor: ");
        for (double numero : numeros) {
            mensagem.append(numero).append(" ");
        }
        mensagem.append("\nMenor numero: ").append(menor).append("\nMaior número: ").append(maior);

        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}
