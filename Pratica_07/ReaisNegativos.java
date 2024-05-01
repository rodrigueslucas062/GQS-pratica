package Pratica_07;

import javax.swing.JOptionPane;

public class ReaisNegativos {
    public static void main(String[] args) {
        double[] numeros = lerNumerosReais();
        String posicoesNegativos = encontrarPosicoesNegativos(numeros);
        exibirResultados(numeros, posicoesNegativos);
    }

    public static double[] lerNumerosReais() {
        double[] numeros = new double[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número real:"));
        }
        return numeros;
    }

    public static String encontrarPosicoesNegativos(double[] numeros) {
        StringBuilder posicoesNegativos = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            if (numeros[i] < 0) {
                posicoesNegativos.append(i).append(" ");
            }
        }
        return posicoesNegativos.toString();
    }

    public static void exibirResultados(double[] numeros, String posicoesNegativos) {
        StringBuilder mensagem = new StringBuilder("Vetor: ");
        for (double numero : numeros) {
            mensagem.append(numero).append(" ");
        }
        mensagem.append("\nPosições dos números negativos: ").append(posicoesNegativos);
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}