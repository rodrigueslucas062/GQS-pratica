package Pratica_05;

import javax.swing.JOptionPane;

public class Validador {
    public static void main(String args[]) {
        validarNota();
        validarSalario();
        validarSexo();
        validarIdade();
        JOptionPane.showMessageDialog(null, "Todos os dados informados corretamente");
    }

    private static void validarNota() {
        double nota;
        do {
            String entrada = JOptionPane.showInputDialog("Informe a nota (Entre 0 e 10): ");
            nota = Double.parseDouble(entrada);
            if (nota < 0 || nota > 10) {
                JOptionPane.showMessageDialog(null, "A nota deve estar entre 0 e 10");
            }
        } while (nota < 0 || nota > 10);
    }

    private static void validarSalario() {
        double salario;
        do {
            String entrada = JOptionPane.showInputDialog("Informe o salário: ");
            salario = Double.parseDouble(entrada);
            if (salario <= 0) {
                JOptionPane.showMessageDialog(null, "O salário deve ser maior que zero. Tente novamente.");
            }
        } while (salario <= 0);
    }

    private static void validarSexo() {
        String sexo;
        do {
            sexo = JOptionPane.showInputDialog("Informe o sexo (m ou f): ");
            if (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
                JOptionPane.showMessageDialog(null, "Sexo inválido. Informe 'm' para masculino ou 'f' para feminino.");
            }
        } while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f"));
    }

    private static void validarIdade() {
        int idade;
        do {
            String entrada = JOptionPane.showInputDialog("Informe a idade: ");
            idade = Integer.parseInt(entrada);
            if (idade < 0 || idade > 150) {
                JOptionPane.showMessageDialog(null, "A idade deve estar entre 0 e 150. Tente novamente.");
            }
        } while (idade < 0 || idade > 150);
    }
}
