package br.com.americanas.polotech.model.DAO;

import br.com.americanas.polotech.model.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EstoqueDAO {
    private static final List<AlbumDeMusica> listAlbumDeMusica = new ArrayList<>();
    private static final List<Brinquedo> listBrinquedos = new ArrayList<>();
    private static final List<Filme> listFilmes = new ArrayList<>();
    private static final List<Jogo> listJogos = new ArrayList<>();
    private static final List<Livro> listLivros = new ArrayList<>();

    private static List<Produto> listEstoque;

    public static List<Produto> getListEstoque() {
        listEstoque = lista();
        return listEstoque;
    }

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

    public static Produto pesqItem(Integer id) {
        juntaLista();
        for (Produto prod : listEstoque) {
            if (prod.getId() == id) {
                return prod;
            }
        }
        return null;
    }

    public static void exibirTodos() {
        juntaLista();
        for (Produto prod : listEstoque) {
            System.out.println(prod);
        }
    }

    public static void exibirPorCategoria(Integer num) {
        if (num == 1) {
            listAlbumDeMusica.forEach(albumDeMusica -> System.out.println(albumDeMusica));
        }
        if (num == 2) {
            listBrinquedos.forEach(brinquedo -> System.out.println(brinquedo));
        }
        if (num == 3) {
            listFilmes.forEach(filme -> System.out.println(filme));
        }
        if (num == 4) {
            listJogos.forEach(jogo -> System.out.println(jogo));
        }
        if (num == 5) {
            listLivros.forEach(livro -> System.out.println(livro));
        }
    }

    public static void juntaLista() {
        listEstoque = new ArrayList<>();
        Stream.of(listAlbumDeMusica, listBrinquedos, listFilmes, listJogos, listLivros)
                .forEach(listEstoque::addAll);
    }
    private static List<Produto> lista() {
        listEstoque = new ArrayList<>();
        Stream.of(listAlbumDeMusica, listBrinquedos, listFilmes, listJogos, listLivros)
                .forEach(listEstoque::addAll);
        return listEstoque;
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

    public static boolean alterarProduto(int id, Double valor) {
        juntaLista();
        if (id != -1) {
            listEstoque.forEach(produto -> {
                if (produto.getId() == id) {
                    produto.setPreco(valor);
                }
            });
        }
        return true;
    }

    public static boolean alterarQtd(int id, Integer qtd) {
        juntaLista();
        if (id != -1) {
            listEstoque.forEach(produto -> {
                if (produto.getId() == id) {
                    produto.setQtdItens(qtd);
                }
            });
        }
        return true;
    }
}