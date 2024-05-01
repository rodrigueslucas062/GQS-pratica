package Pratica_05;

import javax.swing.JOptionPane;

public class Verificador {
    public static void main(String args[]) {
        String entrada;
        int numeroConta;
        do {
            entrada = JOptionPane.showInputDialog("Informe o numero da conta corrente com 3 dígitos: ");
            numeroConta = Integer.parseInt(entrada);

            if (entrada.length() != 3) {
                JOptionPane.showMessageDialog(null, "O numero da conta deve conter 3 dígitos");
                continue;
            }

            int inverso = Integer.parseInt(new StringBuilder(entrada).reverse().toString());
            int soma = numeroConta + inverso;
            int digitoVerificador = calcularDigitoVerificador(soma);
            JOptionPane.showMessageDialog(null, "O dígito verificador é: " + digitoVerificador);

            entrada = JOptionPane.showInputDialog("Deseja continuar? (S) sim ou (N) não");
        } while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
    }

    private static int calcularDigitoVerificador(int soma) {
        int digitoVerificador = 0;
        for (int i = 0; soma > 0; i++) {
            digitoVerificador += (soma % 10) * i;
            soma /= 10;
        }
        return digitoVerificador % 10;
    }
}
