package br.com.americanas.polotech.view.menu.menuLivraria;

import br.com.americanas.polotech.model.DAO.CaixaDAO;
import br.com.americanas.polotech.model.DAO.EstoqueDAO;
import br.com.americanas.polotech.model.entity.Produto;

import java.util.Scanner;

public class MenuCaixaAdicionar {
    public static boolean telaAdicionarNoCarrinho() {
        boolean continua = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Forneça o Código do Produto");
            Integer idProd = sc.nextInt();

            Produto prodPesq = EstoqueDAO.pesqItem(idProd);
            if (prodPesq != null) {
                System.out.println(prodPesq);
            } else {
                System.out.println("Produto não encontrodo");
            }
            System.out.println("================================");
            sc.nextLine();
            System.out.println("Adicionar ao Carrinho? [S/N]");

            String resp = sc.nextLine();
            if (resp.equalsIgnoreCase("s")) {
                CaixaDAO.adicionarNoCarrinho(prodPesq);
            }
        } while (continua);
        return true;
    }
}
