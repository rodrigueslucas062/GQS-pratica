package Pratica_11;

import javax.swing.JOptionPane;

class Pessoa {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class PessoaFisica extends Pessoa {
    private String cpf;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}

class PessoaJuridica extends Pessoa {
    private String cnpj;

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}

class Cadastro {
    private Pessoa[] pessoas;
    private int quantidade;

    public Cadastro(int tamanho) {
        pessoas = new Pessoa[tamanho];
        quantidade = 0;
    }

    public void cadastrarPessoa(Pessoa pessoa) {
        if (quantidade < pessoas.length) {
            pessoas[quantidade] = pessoa;
            quantidade++;
            JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Cadastro está cheio!");
        }
    }

    public void imprimirCadastro() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < quantidade; i++) {
            output.append("Nome: ").append(pessoas[i].getNome()).append("\n");
            if (pessoas[i] instanceof PessoaFisica) {
                output.append("CPF: ").append(((PessoaFisica) pessoas[i]).getCpf()).append("\n\n");
            } else if (pessoas[i] instanceof PessoaJuridica) {
                output.append("CNPJ: ").append(((PessoaJuridica) pessoas[i]).getCnpj()).append("\n\n");
            }
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }

    public void imprimirPessoasFisicas() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < quantidade; i++) {
            if (pessoas[i] instanceof PessoaFisica) {
                output.append("Nome: ").append(pessoas[i].getNome()).append("\n");
                output.append("CPF: ").append(((PessoaFisica) pessoas[i]).getCpf()).append("\n\n");
            }
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }

    public void imprimirPessoasJuridicas() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < quantidade; i++) {
            if (pessoas[i] instanceof PessoaJuridica) {
                output.append("Nome: ").append(pessoas[i].getNome()).append("\n");
                output.append("CNPJ: ").append(((PessoaJuridica) pessoas[i]).getCnpj()).append("\n\n");
            }
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }

    public void pesquisarPessoa(String documento) {
        StringBuilder output = new StringBuilder();
        boolean encontrou = false;
        for (int i = 0; i < quantidade; i++) {
            if (pessoas[i] instanceof PessoaFisica && ((PessoaFisica) pessoas[i]).getCpf().equals(documento)) {
                output.append("Nome: ").append(pessoas[i].getNome()).append("\n");
                output.append("CPF: ").append(((PessoaFisica) pessoas[i]).getCpf()).append("\n\n");
                encontrou = true;
            } else if (pessoas[i] instanceof PessoaJuridica
                    && ((PessoaJuridica) pessoas[i]).getCnpj().equals(documento)) {
                output.append("Nome: ").append(pessoas[i].getNome()).append("\n");
                output.append("CNPJ: ").append(((PessoaJuridica) pessoas[i]).getCnpj()).append("\n\n");
                encontrou = true;
            }
        }
        if (!encontrou) {
            JOptionPane.showMessageDialog(null, "Pessoa não encontrada.");
        } else {
            JOptionPane.showMessageDialog(null, output.toString());
        }
    }

    public void atualizarPessoa(String documento, String novoNome) {
        for (int i = 0; i < quantidade; i++) {
            if (pessoas[i] instanceof PessoaFisica && ((PessoaFisica) pessoas[i]).getCpf().equals(documento)) {
                pessoas[i].setNome(novoNome);
                JOptionPane.showMessageDialog(null, "Pessoa atualizada com sucesso!");
                return;
            } else if (pessoas[i] instanceof PessoaJuridica
                    && ((PessoaJuridica) pessoas[i]).getCnpj().equals(documento)) {
                pessoas[i].setNome(novoNome);
                JOptionPane.showMessageDialog(null, "Pessoa atualizada com sucesso!");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Pessoa não encontrada.");
    }

    public void excluirPessoa(String documento) {
        for (int i = 0; i < quantidade; i++) {
            if (pessoas[i] instanceof PessoaFisica && ((PessoaFisica) pessoas[i]).getCpf().equals(documento)) {
                pessoas[i] = null;
                rearranjarCadastro(i);
                quantidade--;
                JOptionPane.showMessageDialog(null, "Pessoa excluída com sucesso!");
                return;
            } else if (pessoas[i] instanceof PessoaJuridica
                    && ((PessoaJuridica) pessoas[i]).getCnpj().equals(documento)) {
                pessoas[i] = null;
                rearranjarCadastro(i);
                quantidade--;
                JOptionPane.showMessageDialog(null, "Pessoa excluída com sucesso!");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Pessoa não encontrada.");
    }

    private void rearranjarCadastro(int index) {
        for (int i = index; i < quantidade - 1; i++) {
            pessoas[i] = pessoas[i + 1];
        }
    }
}

public class Main {
    private static Cadastro cadastro = new Cadastro(100);

    public static void main(String[] args) {
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu:\n1. Cadastrar Pessoa Física\n2. Cadastrar Pessoa Jurídica\n3. Imprimir cadastro\n4. Imprimir apenas pessoas físicas\n5. Imprimir apenas pessoas jurídicas\n6. Pesquisar pessoa\n7. Atualizar pessoa\n8. Excluir pessoa\n9. Sair"));

            switch (opcao) {
                case 1:
                    cadastrarPessoaFisica();
                    break;
                case 2:
                    cadastrarPessoaJuridica();
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
                    pesquisarPessoa();
                    break;
                case 7:
                    atualizarPessoa();
                    break;
                case 8:
                    excluirPessoa();
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

    public static void cadastrarPessoaFisica() {
        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setNome(JOptionPane.showInputDialog("Nome:"));
        pessoa.setCpf(JOptionPane.showInputDialog("CPF:"));
        cadastro.cadastrarPessoa(pessoa);
    }

    public static void cadastrarPessoaJuridica() {
        PessoaJuridica pessoa = new PessoaJuridica();
        pessoa.setNome(JOptionPane.showInputDialog("Nome:"));
        pessoa.setCnpj(JOptionPane.showInputDialog("CNPJ:"));
        cadastro.cadastrarPessoa(pessoa);
    }

    public static void pesquisarPessoa() {
        String documento = JOptionPane.showInputDialog("Digite o CPF ou CNPJ da pessoa:");
        cadastro.pesquisarPessoa(documento);
    }

    public static void atualizarPessoa() {
        String documento = JOptionPane.showInputDialog("Digite o CPF ou CNPJ da pessoa a ser atualizada:");
        String novoNome = JOptionPane.showInputDialog("Digite o novo nome:");
        cadastro.atualizarPessoa(documento, novoNome);
    }

    public static void excluirPessoa() {
        String documento = JOptionPane.showInputDialog("Digite o CPF ou CNPJ da pessoa a ser excluída:");
        cadastro.excluirPessoa(documento);
    }
}
