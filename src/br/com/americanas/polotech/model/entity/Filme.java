package br.com.americanas.polotech.model.entity;

public class Filme extends Produto {
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

    public Filme(Integer id, String nome, Double preco, Integer qtdItens) {
        super(id, nome, preco, qtdItens);
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
