package Pratica_12;

import javax.swing.JOptionPane;

public class Divisao {
    public static void main(String[] args) {
        try {
            String inputDividendo = JOptionPane.showInputDialog("Digite o dividendo (numerador):");
            int dividendo = Integer.parseInt(inputDividendo);

            String inputDivisor = JOptionPane.showInputDialog("Digite o divisor (denominador):");
            int divisor = Integer.parseInt(inputDivisor);

            double resultado = divide(dividendo, divisor);
            JOptionPane.showMessageDialog(null, "Resultado da divisão: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite um número válido.");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Erro: Divisão por zero não é permitida.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    public static double divide(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return (double) dividendo / divisor;
    }
}
