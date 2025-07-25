package model;

import enumeracao.Categoria;

public class Produto {
    private String nome;
    private double valorCompra;
    private double valorVenda;
    private int qtdEstoque;
    private Categoria categoria;

    public Produto(String nome, double valorCompra, double valorVenda, int qtdEstoque, Categoria categoria) {
        this.nome = nome;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
        this.qtdEstoque = qtdEstoque;
        this.categoria = categoria;
    }

    public Produto() {}

    public String exibirInformacoes(){
        String categoriaString = this.categoria.toString();

        return String.format("Nome do produto: %s\nValor de compra: R$%.2f\nValor de venda: R$%.2f" +
                "\nQuantidade em estoque: %d\nCategoria: %s\n", nome, valorCompra, valorVenda, qtdEstoque, categoriaString);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}