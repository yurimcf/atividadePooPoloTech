package br.com.americanas.polotech.model.entity;

public class Produto {
    private static Integer uid = 1;
    private Integer id;
    private String nome;
    private Double preco;
    private Integer qtdItens;


    public Produto(String nome, Double preco, Integer qtdItens) {
        this.id = uid++;
        this.nome = nome;
        this.preco = preco;
        this.qtdItens = qtdItens;
    }

    public Produto(Integer id, String nome, Double preco, Integer qtdItens) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtdItens = qtdItens;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(Integer qtdItens) {
        this.qtdItens = qtdItens;
    }

    @Override
    public String toString() {
        return  "[id]:" + id +
                ", [nome]: '" + nome + '\'' +
                ", [preco]: " + preco +
                ", [Qtd no Carrinho]: " + qtdItens;
    }
}
