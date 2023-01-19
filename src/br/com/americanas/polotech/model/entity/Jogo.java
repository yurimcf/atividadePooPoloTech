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

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
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
