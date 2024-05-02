package Pratica_10;

import javax.swing.JOptionPane;

class PessoaFisica {
    private String nome;
    private String CPF;

    public PessoaFisica(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String toString() {
        return "Nome: " + nome + ", CPF: " + CPF;
    }
}

class PessoaJuridica {
    private String nome;
    private String CNPJ;

    public PessoaJuridica(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String toString() {
        return "Nome: " + nome + ", CNPJ: " + CNPJ;
    }
}

class Cadastro {
    private PessoaFisica[] pessoasFisicas;
    private PessoaJuridica[] pessoasJuridicas;
    private int totalPessoasFisicas;
    private int totalPessoasJuridicas;

    public Cadastro(int tamanhoMaximo) {
        pessoasFisicas = new PessoaFisica[tamanhoMaximo];
        pessoasJuridicas = new PessoaJuridica[tamanhoMaximo];
        totalPessoasFisicas = 0;
        totalPessoasJuridicas = 0;
    }

    public void cadastrarPessoaFisica(String nome, String CPF) {
        PessoaFisica pessoaFisica = new PessoaFisica(nome, CPF);
        pessoasFisicas[totalPessoasFisicas] = pessoaFisica;
        totalPessoasFisicas++;
    }

    public void cadastrarPessoaJuridica(String nome, String CNPJ) {
        PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, CNPJ);
        pessoasJuridicas[totalPessoasJuridicas] = pessoaJuridica;
        totalPessoasJuridicas++;
    }

    public void imprimirCadastro() {
        StringBuilder mensagem = new StringBuilder("Pessoas Físicas cadastradas:\n");
        for (int i = 0; i < totalPessoasFisicas; i++) {
            mensagem.append(pessoasFisicas[i]).append("\n");
        }
        mensagem.append("\n\nPessoas Jurídicas cadastradas:\n");
        for (int i = 0; i < totalPessoasJuridicas; i++) {
            mensagem.append(pessoasJuridicas[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }

    public void imprimirPessoasFisicas() {
        StringBuilder mensagem = new StringBuilder("Pessoas Físicas cadastradas:\n");
        for (int i = 0; i < totalPessoasFisicas; i++) {
            mensagem.append(pessoasFisicas[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }

    public void imprimirPessoasJuridicas() {
        StringBuilder mensagem = new StringBuilder("Pessoas Jurídicas cadastradas:\n");
        for (int i = 0; i < totalPessoasJuridicas; i++) {
            mensagem.append(pessoasJuridicas[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }

    public void pesquisarPessoa(String chave) {
        boolean encontrado = false;
        for (int i = 0; i < totalPessoasFisicas; i++) {
            PessoaFisica pessoaFisica = pessoasFisicas[i];
            if (pessoaFisica.getCPF().equals(chave)) {
                JOptionPane.showMessageDialog(null, "Pessoa Física encontrada:\n" + pessoaFisica);
                encontrado = true;
                break;
            }
        }
        for (int i = 0; i < totalPessoasJuridicas; i++) {
            PessoaJuridica pessoaJuridica = pessoasJuridicas[i];
            if (pessoaJuridica.getCNPJ().equals(chave)) {
                JOptionPane.showMessageDialog(null, "Pessoa Jurídica encontrada:\n" + pessoaJuridica);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Pessoa não encontrada.");
        }
    }

    public void atualizarPessoa(String chave, String novoNome, String novoCPF_CNPJ) {
        for (int i = 0; i < totalPessoasFisicas; i++) {
            PessoaFisica pessoaFisica = pessoasFisicas[i];
            if (pessoaFisica.getCPF().equals(chave)) {
                pessoaFisica.setNome(novoNome);
                pessoaFisica.setCPF(novoCPF_CNPJ);
                JOptionPane.showMessageDialog(null, "Pessoa Física atualizada com sucesso.");
                return;
            }
        }
        for (int i = 0; i < totalPessoasJuridicas; i++) {
            PessoaJuridica pessoaJuridica = pessoasJuridicas[i];
            if (pessoaJuridica.getCNPJ().equals(chave)) {
                pessoaJuridica.setNome(novoNome);
                pessoaJuridica.setCNPJ(novoCPF_CNPJ);
                JOptionPane.showMessageDialog(null, "Pessoa Jurídica atualizada com sucesso.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Pessoa não encontrada.");
    }

    public void excluirPessoa(String chave) {
        for (int i = 0; i < totalPessoasFisicas; i++) {
            PessoaFisica pessoaFisica = pessoasFisicas[i];
            if (pessoaFisica.getCPF().equals(chave)) {
                for (int j = i; j < totalPessoasFisicas - 1; j++) {
                    pessoasFisicas[j] = pessoasFisicas[j + 1];
                }
                totalPessoasFisicas--;
                JOptionPane.showMessageDialog(null, "Pessoa Física excluída com sucesso.");
                return;
            }
        }
        for (int i = 0; i < totalPessoasJuridicas; i++) {
            PessoaJuridica pessoaJuridica = pessoasJuridicas[i];
            if (pessoaJuridica.getCNPJ().equals(chave)) {
                for (int j = i; j < totalPessoasJuridicas - 1; j++) {
                    pessoasJuridicas[j] = pessoasJuridicas[j + 1];
                }
                totalPessoasJuridicas--;
                JOptionPane.showMessageDialog(null, "Pessoa Jurídica excluída com sucesso.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Pessoa não encontrada.");
    }
}

public class CadastroPfPj {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro(100);

        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu:\n1. Cadastrar Pessoa Física\n2. Cadastrar Pessoa Jurídica\n3. Imprimir cadastro\n4. Imprimir apenas pessoas físicas\n5. Imprimir apenas pessoas jurídicas\n6. Pesquisar pessoa\n7. Atualizar pessoa\n8. Excluir pessoa\n9. Sair"));

            switch (opcao) {
                case 1:
                    cadastrarPessoaFisica(cadastro);
                    break;
                case 2:
                    cadastrarPessoaJuridica(cadastro);
                    break;
                case 3:
                    cadastro.imprimirCadastro();
                    break;
                case 4:
                    cadastro.imprimirPessoasFisicas();
                    break;
                case 5:
                    cadastro.imprimirPessoasJuridicas();
                    break;
                case 6:
                    pesquisarPessoa(cadastro);
                    break;
                case 7:
                    atualizarPessoa(cadastro);
                    break;
                case 8:
                    excluirPessoa(cadastro);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        } while (opcao != 9);
    }

    public static void cadastrarPessoaFisica(Cadastro cadastro) {
        String nome = JOptionPane.showInputDialog("Digite o nome da pessoa física:");
        String CPF = JOptionPane.showInputDialog("Digite o CPF:");
        cadastro.cadastrarPessoaFisica(nome, CPF);
    }

    public static void cadastrarPessoaJuridica(Cadastro cadastro) {
        String nome = JOptionPane.showInputDialog("Digite o nome da pessoa jurídica:");
        String CNPJ = JOptionPane.showInputDialog("Digite o CNPJ:");
        cadastro.cadastrarPessoaJuridica(nome, CNPJ);
    }

    public static void pesquisarPessoa(Cadastro cadastro) {
        String chave = JOptionPane.showInputDialog("Digite o CPF ou CNPJ da pessoa:");
        cadastro.pesquisarPessoa(chave);
    }

    public static void atualizarPessoa(Cadastro cadastro) {
        String chave = JOptionPane.showInputDialog("Digite o CPF ou CNPJ da pessoa a ser atualizada:");
        String novoNome = JOptionPane.showInputDialog("Digite o novo nome:");
        String novoCPF_CNPJ = JOptionPane.showInputDialog("Digite o novo CPF ou CNPJ:");
        cadastro.atualizarPessoa(chave, novoNome, novoCPF_CNPJ);
    }

    public static void excluirPessoa(Cadastro cadastro) {
        String chave = JOptionPane.showInputDialog("Digite o CPF ou CNPJ da pessoa a ser excluída:");
        cadastro.excluirPessoa(chave);
    }
}
