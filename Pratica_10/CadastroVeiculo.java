package Pratica_10;

import javax.swing.JOptionPane;

class Veiculo {
    private String numeroChassi;
    private String placa;
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String numeroChassi, String placa, String marca, String modelo, int ano) {
        this.numeroChassi = numeroChassi;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getNumeroChassi() {
        return numeroChassi;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String toString() {
        return "Chassi: " + numeroChassi + ", placa: " + placa + ", marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano;
    }
}

class Cadastro {
    private Veiculo[] veiculos;
    private int totalVeiculos;

    public Cadastro(int tamanhoMaximo) {
        veiculos = new Veiculo[tamanhoMaximo];
        totalVeiculos = 0;
    }

    public void cadastrarVeiculo(String numeroChassi, String placa, String marca, String modelo, int ano) {
        Veiculo veiculo = new Veiculo(numeroChassi, placa, marca, modelo, ano);
        veiculos[totalVeiculos] = veiculo;
        totalVeiculos++;
    }

    public void imprimirVeiculos() {
        StringBuilder mensagem = new StringBuilder("Veículos cadastrados:\n");
        for (int i = 0; i < totalVeiculos; i++) {
            mensagem.append(veiculos[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }

    public void pesquisarVeiculo(String chave) {
        boolean encontrado = false;
        for (int i = 0; i < totalVeiculos; i++) {
            Veiculo veiculo = veiculos[i];
            if (veiculo.getNumeroChassi().equals(chave) || veiculo.getPlaca().equals(chave)) {
                JOptionPane.showMessageDialog(null, "Veículo encontrado:\n" + veiculo);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Veículo não encontrado.");
        }
    }

    public void atualizarVeiculo(String chave, String novoNumeroChassi, String novaPlaca, String novaMarca,
            String novoModelo, int novoAno) {
        for (int i = 0; i < totalVeiculos; i++) {
            Veiculo veiculo = veiculos[i];
            if (veiculo.getNumeroChassi().equals(chave) || veiculo.getPlaca().equals(chave)) {
                veiculo = new Veiculo(novoNumeroChassi, novaPlaca, novaMarca, novoModelo, novoAno);
                veiculos[i] = veiculo;
                JOptionPane.showMessageDialog(null, "Veículo atualizado com sucesso.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Veículo não encontrado.");
    }

    public void excluirVeiculo(String chave) {
        for (int i = 0; i < totalVeiculos; i++) {
            Veiculo veiculo = veiculos[i];
            if (veiculo.getNumeroChassi().equals(chave) || veiculo.getPlaca().equals(chave)) {
                for (int j = i; j < totalVeiculos - 1; j++) {
                    veiculos[j] = veiculos[j + 1];
                }
                totalVeiculos--;
                JOptionPane.showMessageDialog(null, "Veículo excluído com sucesso.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Veículo não encontrado.");
    }
}

public class CadastroVeiculo {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro(100);

        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu:\n1. Cadastrar veículo\n2. Imprimir veículos cadastrados\n3. Pesquisar veículo\n4. Atualizar veículo\n5. Excluir veículo\n6. Sair"));

            switch (opcao) {
                case 1:
                    cadastrarVeiculo(cadastro);
                    break;
                case 2:
                    cadastro.imprimirVeiculos();
                    break;
                case 3:
                    pesquisarVeiculo(cadastro);
                    break;
                case 4:
                    atualizarVeiculo(cadastro);
                    break;
                case 5:
                    excluirVeiculo(cadastro);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        } while (opcao != 6);
    }

    public static void cadastrarVeiculo(Cadastro cadastro) {
        String numeroChassi = JOptionPane.showInputDialog("Digite o número do chassi:");
        String placa = JOptionPane.showInputDialog("Digite a placa:");
        String marca = JOptionPane.showInputDialog("Digite a marca:");
        String modelo = JOptionPane.showInputDialog("Digite o modelo:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));
        cadastro.cadastrarVeiculo(numeroChassi, placa, marca, modelo, ano);
    }

    public static void pesquisarVeiculo(Cadastro cadastro) {
        String chave = JOptionPane.showInputDialog("Digite o número do chassi ou placa:");
        cadastro.pesquisarVeiculo(chave);
    }

    public static void atualizarVeiculo(Cadastro cadastro) {
        String chave = JOptionPane.showInputDialog("Digite o número do chassi ou placa do veículo a ser atualizado:");
        String novoNumeroChassi = JOptionPane.showInputDialog("Digite o novo número do chassi:");
        String novaPlaca = JOptionPane.showInputDialog("Digite a nova placa:");
        String novaMarca = JOptionPane.showInputDialog("Digite a nova marca:");
        String novoModelo = JOptionPane.showInputDialog("Digite o novo modelo:");
        int novoAno = Integer.parseInt(JOptionPane.showInputDialog("Digite o novo ano:"));
        cadastro.atualizarVeiculo(chave, novoNumeroChassi, novaPlaca, novaMarca, novoModelo, novoAno);
    }

    public static void excluirVeiculo(Cadastro cadastro) {
        String chave = JOptionPane.showInputDialog("Digite o número do chassi ou placa do veículo a ser excluído:");
        cadastro.excluirVeiculo(chave);
    }
}
