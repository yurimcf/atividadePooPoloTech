package br.com.americanas.polotech.model.entity;

public class Livro extends Produto {
    private String genero;
    private String escritor;
    private String editoda;

    public Livro(String nome, Double preco, Integer qtdItens, String genero, String escritor, String editoda) {
        super(nome, preco, qtdItens);
        this.genero = genero;
        this.escritor = escritor;
        this.editoda = editoda;
    }

    public Livro(Integer id, String nome, Double preco, Integer qtdItens) {
        super(id, nome, preco, qtdItens);
    }


    @Override
    public String toString() {
        return "Livro {" +
                super.toString() +
                " [genero]:'" + genero + '\'' +
                ", [escritor]:'" + escritor + '\'' +
                ", [editoda]:'" + editoda + '\'' +
                '}';
    }
}
