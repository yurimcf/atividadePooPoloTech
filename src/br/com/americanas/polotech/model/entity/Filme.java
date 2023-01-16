package br.com.americanas.polotech.model.entity;

public class Filme extends Produto{
    private String estudio;
    private String diretor;
    private String genero;
    private String produtor;

    public Filme(String nome, Double preco, Integer qtdItens, String estudio, String diretor, String genero, String produtor) {
        super(nome, preco, qtdItens);
        this.estudio = estudio;
        this.diretor = diretor;
        this.genero = genero;
        this.produtor = produtor;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    @Override
    public String toString() {
        return "Filme {" +
                super.toString() +
                " [estudio]:'" + estudio + '\'' +
                ", [diretor]:'" + diretor + '\'' +
                ", [genero]:'" + genero + '\'' +
                ", [produtor]:'" + produtor + '\'' +
                '}';
    }
}
