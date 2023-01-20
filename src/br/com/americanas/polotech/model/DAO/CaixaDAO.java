package br.com.americanas.polotech.model.DAO;

import br.com.americanas.polotech.model.entity.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CaixaDAO {
    private static Double saldoEmCaixa = 0.00;

    public static Double getSaldoEmCaixa() {
        return saldoEmCaixa;
    }

    private static Map<Integer, Produto> carrinhoTemp = new HashMap<>();

    public static void adicionarNoCarrinho(Produto produto) {
        Produto carrinho = verificaTipo(produto);
        Produto prodRef = carrinhoTemp.get(produto.getId());
        if (prodRef == null) {
            carrinhoTemp.put(produto.getId(), carrinho);
        } else {
            if (prodRef.getQtdItens() == produto.getQtdItens()) {
                System.out.println("================================");
                System.out.println("Não pode adicionar mais Itens");
            } else {
                prodRef.setQtdItens(prodRef.getQtdItens() + 1);
            }
        }
        impressaoPrevia();
    }

    public static void exibirCarrinho() {
        carrinhoTemp.forEach((integer, produto) -> System.out.println(produto.imprimir()));
    }

    public static void impressaoPrevia() {
        carrinhoTemp.forEach((integer, produto) -> System.out.println(produto.imprimir()));
    }

    public static boolean removerUmItem(Integer id) {
        Produto pesq = carrinhoTemp.get(id);
        if (pesq != null) {
            if (pesq.getQtdItens() > 0) {
                pesq.setQtdItens(pesq.getQtdItens() - 1);
            }
            if (pesq.getQtdItens() == 0) {
                carrinhoTemp.remove(pesq.getId(), pesq);
            }
        }
        return true;
    }

    public static boolean removerTodos(Integer id) {
        carrinhoTemp.remove(id);
        return true;
    }

    public static void adicionarSaldo(Double valor) {
        saldoEmCaixa += valor;
    }

    public static Double precoTotal() {
        List<Produto> fList = new ArrayList<>(carrinhoTemp.values());
        List<Double> valorTotalItem = fList.stream()
                .map(produto -> produto.getQtdItens() * produto.getPreco())
                .collect(Collectors.toList());
        Double valorTotal = valorTotalItem.stream().reduce((double) 0, Double::sum);

        return valorTotal;
    }

    public static boolean finalizaCompra() {
        Double valorTotal = precoTotal();
        if (valorTotal > saldoEmCaixa) {
            return false;
        } else {
            saldoEmCaixa = saldoEmCaixa - valorTotal;
            atualizarEstoque();
            return true;
        }
    }

    private static void atualizarEstoque() {
        List<Produto> fList = new ArrayList<>(carrinhoTemp.values());
        List<Produto> estoqueList = EstoqueDAO.getListEstoque();

        Integer qtdAtualizado;
        for (int i = 0; i < fList.size(); i++) {
            for (int j = 0; j < estoqueList.size(); j++) {
                if (fList.get(i).getId() == estoqueList.get(j).getId()) {
                    Integer qtdAtual = estoqueList.get(j).getQtdItens() - fList.get(i).getQtdItens();
                    EstoqueDAO.alterarQtd(fList.get(i).getId(), qtdAtual);
                }
            }
        }
    }

    private static Produto verificaTipo(Produto produto) {
        Produto temp = null;
        if (produto instanceof AlbumDeMusica) {
            temp = new AlbumDeMusica(produto.getId(),
                    produto.getNome(), produto.getPreco(), 1);
        }
        if (produto instanceof Brinquedo) {
            temp = new Brinquedo(produto.getId(),
                    produto.getNome(), produto.getPreco(), 1);
        }
        if (produto instanceof Filme) {
            temp = new Filme(produto.getId(),
                    produto.getNome(), produto.getPreco(), 1);
        }
        if (produto instanceof Jogo) {
            temp = new Jogo(produto.getId(),
                    produto.getNome(), produto.getPreco(), 1);
        }
        if (produto instanceof Livro) {
            temp = new Livro(produto.getId(),
                    produto.getNome(), produto.getPreco(), 1);
        }
        return temp;
    }
}
