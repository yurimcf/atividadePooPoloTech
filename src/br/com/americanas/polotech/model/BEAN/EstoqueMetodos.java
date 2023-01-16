package br.com.americanas.polotech.model.BEAN;

import br.com.americanas.polotech.model.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EstoqueMetodos {
    private static final List<Produto> carrinho = new ArrayList<>();
    private static final List<AlbumDeMusica> listAlbumDeMusica = new ArrayList<>();
    private static final List<Brinquedo> listBrinquedos = new ArrayList<>();
    private static final List<Filme> listFilmes = new ArrayList<>();
    private static final List<Jogo> listJogos = new ArrayList<>();
    private static final List<Livro> listLivros = new ArrayList<>();

    private static List<Produto> listEstoque;

    public static void inserirProduto(Produto produto) {
        if (produto instanceof AlbumDeMusica) {
            listAlbumDeMusica.add((AlbumDeMusica) produto);
        }
        if (produto instanceof Brinquedo) {
            listBrinquedos.add((Brinquedo) produto);
        }
        if (produto instanceof Filme) {
            listFilmes.add((Filme) produto);
        }
        if (produto instanceof Jogo) {
            listJogos.add((Jogo) produto);
        }
        if (produto instanceof Livro) {
            listLivros.add((Livro) produto);
        }
    }

    // ta bom?
    public static void exibirTodos() {
        juntaLista();
        for (Produto prod : listEstoque) {
            System.out.println(prod);
        }
    }

    private static void juntaLista() {
        listEstoque = new ArrayList<>();
        Stream.of(listAlbumDeMusica, listBrinquedos, listFilmes, listJogos, listLivros)
                .forEach(listEstoque::addAll);
    }

    public static boolean removerProduto(int id) {
        juntaLista();
        if (id != -1) {
            for (Produto produto : listEstoque) {
                if (produto.getId() == id) {
                    if (produto instanceof AlbumDeMusica) {
                        listAlbumDeMusica.remove(produto);
                    }
                    if (produto instanceof Brinquedo) {
                        listBrinquedos.remove(produto);
                    }
                    if (produto instanceof Filme) {
                        listFilmes.remove(produto);
                    }
                    if (produto instanceof Jogo) {
                        listJogos.remove(produto);
                    }
                    if (produto instanceof Livro) {
                        listLivros.remove(produto);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static void alterarProduto(int id, Produto item) {
        juntaLista();
        if (id != -1) {
            for (Produto produto : listEstoque) {
                if (produto.getId() == id) {
                    if (produto instanceof Livro) {
                        Livro itemRef = (Livro) item;
                        produto.setId(id);
                        produto.setNome(itemRef.getNome());
                        produto.setPreco(itemRef.getPreco());
                        produto.setQtdItens(itemRef.getQtdItens());
                        ((Livro) produto).setGenero(itemRef.getGenero());
                        ((Livro) produto).setEscritor(itemRef.getEscritor());
                        ((Livro) produto).setEditoda(itemRef.getEditoda());
                    }
                }
            }
        }
    }
}
