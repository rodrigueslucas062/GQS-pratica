package Pratica_07;

import javax.swing.JOptionPane;

public class ReaisNegativos {
    public static void main(String[] args) {
        double[] numeros = new double[10];
        StringBuilder posicoesNegativos = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número real:"));
            if (numeros[i] < 0) {
                posicoesNegativos.append(i).append(" ");
            }
        }

        StringBuilder mensagem = new StringBuilder("Vetor: ");
        for (double numero : numeros) {
            mensagem.append(numero).append(" ");
        }
        mensagem.append("\nPosições dos números negativos: ").append(posicoesNegativos);

        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}
