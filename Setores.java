package Setor;

public class Setores {

    private String nome;
    private int qtdFuncionarios;

    public Setores(String nome, int qtdFuncionarios) {
        this.nome = nome;
        this.qtdFuncionarios = this.qtdFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public void setQtdFuncionarios(int qtdFuncionarios) {
        this.qtdFuncionarios = qtdFuncionarios;
    }
}
