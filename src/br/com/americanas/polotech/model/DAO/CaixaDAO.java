package br.com.americanas.polotech.model.DAO;

import br.com.americanas.polotech.model.entity.*;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class CaixaDAO {
    private static Double saldoEmCaixa = 0.00;
    private static List<Produto> carrinho = new CopyOnWriteArrayList();

    public static Double getSaldoEmCaixa() {
        return saldoEmCaixa;
    }

    public static void adicionarNoCarrinho(Produto produto) {
        Produto a = new Produto(
                produto.getId(),
                produto.getNome(),
                produto.getPreco(),
                1
        );
        if (carrinho.isEmpty()) {
            carrinho.add(a);
        } else {
            for (Produto prod : carrinho) {
                if (prod.getId() == a.getId()) {
                    prod.setQtdItens(prod.getQtdItens() + 1);
                    break;
                } else if (prod.getId() == a.getId() && prod.getNome().equalsIgnoreCase(a.getNome())) {
                    carrinho.add(a);
                }
            }
        }
        exibirCarrinho();
    }

    private static void analisarItem(Produto produto) {
        for (Produto prod : carrinho) {
            if (prod.getId() == produto.getId()) {
                prod.setQtdItens(prod.getQtdItens() + 1);
            }
        }
    }

    public static void exibirCarrinho() {
        carrinho.forEach(produto -> System.out.println(produto));
    }

    public static boolean removerUmItem(Integer id) {
        carrinho.stream().filter(produto -> produto.getId() == id)
                .forEach(produto -> carrinho.remove(produto));
        return true;
    }
    public static boolean removerTodos(Integer id) {
        List<Produto> removeAll =
        carrinho.stream().filter(produto -> produto.getId() == id).
                collect(Collectors.toList());
        carrinho.removeAll(removeAll);
        return true;
    }

    public static void calculaSaldo(Double valor) {
        saldoEmCaixa += valor;
    }
}
