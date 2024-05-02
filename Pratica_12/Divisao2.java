package Pratica_12;

import javax.swing.JOptionPane;

public class Divisao2 {
    public static void main(String[] args) {
        try {
            String inputDividendo = JOptionPane.showInputDialog("Digite o dividendo (numerador):");
            int dividendo = Integer.parseInt(inputDividendo);

            String inputDivisor = JOptionPane.showInputDialog("Digite o divisor (denominador):");
            int divisor = Integer.parseInt(inputDivisor);

            double resultado = Calculadora.dividir(dividendo, divisor);
            JOptionPane.showMessageDialog(null, "Resultado da divisão: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite um número válido.");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}

class Calculadora {
    public static double dividir(int dividendo, int divisor) throws ArithmeticException {
        if (dividendo == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        if (divisor < 10) {
            throw new ArithmeticException("O divisor deve ser maior ou igual a 10.");
        }
        return (double) dividendo / divisor;
    }
}
