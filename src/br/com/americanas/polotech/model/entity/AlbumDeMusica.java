package br.com.americanas.polotech.model.entity;

public class AlbumDeMusica extends Produto {
    private String compositor;
    private String genero;
    private String selos;

    public AlbumDeMusica(String nome, Double preco, Integer qtdItens, String compositor, String genero, String selos) {
        super(nome, preco, qtdItens);
        this.compositor = compositor;
        this.genero = genero;
        this.selos = selos;
    }

    public AlbumDeMusica(Integer id, String nome, Double preco, Integer qtdItens) {
        super(id, nome, preco, qtdItens);
    }

    @Override
    public String toString() {
        return "AlbumDeMusica {" +
                super.toString() +
                " [compositor]:'" + compositor + '\'' +
                ", [genero]:'" + genero + '\'' +
                ", [selos]:'" + selos + '\'' +
                '}';
    }
}
