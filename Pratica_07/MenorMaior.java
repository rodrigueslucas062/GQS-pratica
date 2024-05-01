package Pratica_07;

import javax.swing.JOptionPane;

public class MenorMaior {
    public static void main(String[] args) {
        double[] numeros = lerNumerosReais();
        double menor = encontrarMenorNumero(numeros);
        double maior = encontrarMaiorNumero(numeros);
        exibirResultados(numeros, menor, maior);
    }

    public static double[] lerNumerosReais() {
        double[] numeros = new double[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i + 1) + "ª número real:"));
        }
        return numeros;
    }

    public static double encontrarMenorNumero(double[] numeros) {
        double menor = Double.MAX_VALUE;
        for (double numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }

    public static double encontrarMaiorNumero(double[] numeros) {
        double maior = Double.MIN_VALUE;
        for (double numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }

    public static void exibirResultados(double[] numeros, double menor, double maior) {
        StringBuilder mensagem = new StringBuilder("vetor: ");
        for (double numero : numeros) {
            mensagem.append(numero).append(" ");
        }
        mensagem.append("\nMenor numero: ").append(menor).append("\nMaior número: ").append(maior);
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}
