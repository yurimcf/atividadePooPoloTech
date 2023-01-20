package br.com.americanas.polotech.model.entity;

public class Brinquedo extends Produto {
    private String tipo;

    public Brinquedo(String nome, Double preco, Integer qtdItens, String tipo) {
        super(nome, preco, qtdItens);
        this.tipo = tipo;
    }

    public Brinquedo(Integer id, String nome, Double preco, Integer qtdItens) {
        super(id, nome, preco, qtdItens);
    }

    @Override
    public String toString() {
        return "Brinquedo {" +
                super.toString() +
                " [tipo]:'" + tipo + '\'' +
                '}';
    }
}
