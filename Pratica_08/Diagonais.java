package Pratica_08;

import javax.swing.JOptionPane;

public class Diagonais {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                String input = JOptionPane.showInputDialog("Digite o elemento da posição [" + i + "][" + j + "]:");
                matriz[i][j] = Integer.parseInt(input);
            }
        }

        for (int i = 0; i < 5; i++) {
            int temp = matriz[i][i];
            matriz[i][i] = matriz[i][4 - i];
            matriz[i][4 - i] = temp;
        }

        StringBuilder matrizString = new StringBuilder("Matriz resultante após a troca das diagonais:\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrizString.append(matriz[i][j]).append("\t");
            }
            matrizString.append("\n");
        }

        JOptionPane.showMessageDialog(null, matrizString.toString());
    }
}
