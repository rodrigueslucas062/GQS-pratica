package Pratica_06;

import javax.swing.JOptionPane;

public class MediaIdades {
    public static void main(String[] args) {
        int soma = 0;
        int contador = 0;

        while (true) {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade (ou -1 para sair): "));
            if (idade == -1) {
                break;
            }
            soma += idade;
            contador++;

            if (contador == 0) {
                JOptionPane.showMessageDialog(null, "Nenhuma idade informada.");
            } else {
                double media = (double) soma / contador;
                JOptionPane.showMessageDialog(null, "A média das idades informadas até agora é: " + media);
            }
        }

        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "Nenhuma idade informada.");
        } else {
            double mediaFinal = (double) soma / contador;
            JOptionPane.showMessageDialog(null, "A média das idades informadas é: " + mediaFinal);
        }
    }
}
