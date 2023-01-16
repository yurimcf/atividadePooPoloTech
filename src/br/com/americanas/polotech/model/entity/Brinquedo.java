package br.com.americanas.polotech.model.entity;

public class Brinquedo extends Produto {
    private String tipo;

    public Brinquedo(String nome, Double preco, Integer qtdItens, String tipo) {
        super(nome, preco, qtdItens);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Brinquedo {" +
                super.toString() +
                " [tipo]:'" + tipo + '\'' +
                '}';
    }
}
