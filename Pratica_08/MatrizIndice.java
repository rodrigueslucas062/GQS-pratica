package Pratica_08;

import javax.swing.JOptionPane;

public class MatrizIndice {
    public static void main(String[] args) {
        int[][] matriz = lerMatriz();
        String elementos = encontrarElementos(matriz);
        exibirElementos(elementos);
    }

    public static int[][] lerMatriz() {
        int[][] matriz = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                String input = JOptionPane.showInputDialog("Digite o elemento da posição [" + i + "][" + j + "]:");
                matriz[i][j] = Integer.parseInt(input);
            }
        }
        return matriz;
    }

    public static String encontrarElementos(int[][] matriz) {
        StringBuilder elementos = new StringBuilder("Elementos nas posições pares e o índice da coluna ímpar:\n");
        for (int i = 0; i < 5; i += 2) {
            for (int j = 1; j < 5; j += 2) {
                elementos.append(matriz[i][j]).append("\t");
            }
            elementos.append("\n");
        }
        return elementos.toString();
    }

    public static void exibirElementos(String elementos) {
        JOptionPane.showMessageDialog(null, elementos);
    }
}
