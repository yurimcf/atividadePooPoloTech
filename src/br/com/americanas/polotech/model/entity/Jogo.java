package br.com.americanas.polotech.model.entity;

public class Jogo extends Produto {
    private String distribuidora;
    private String genero;
    private String estudio;

    public Jogo(String nome, Double preco, Integer qtdItens, String distribuidora, String genero, String estudio) {
        super(nome, preco, qtdItens);
        this.distribuidora = distribuidora;
        this.genero = genero;
        this.estudio = estudio;
    }

    public Jogo(Integer id, String nome, Double preco, Integer qtdItens) {
        super(id, nome, preco, qtdItens);
    }


    @Override
    public String toString() {
        return "Jogo {" +
                super.toString() +
                " [distribuidora]]: '" + distribuidora + '\'' +
                ", [genero]:'" + genero + '\'' +
                ", [estudio]:'" + estudio + '\'' +
                '}';
    }
}
