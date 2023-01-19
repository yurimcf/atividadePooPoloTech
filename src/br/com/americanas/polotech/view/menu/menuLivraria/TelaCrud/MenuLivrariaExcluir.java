package br.com.americanas.polotech.view.menu.menuLivraria.TelaCrud;

import br.com.americanas.polotech.model.DAO.EstoqueDAO;
import br.com.americanas.polotech.model.entity.Produto;

import java.util.Scanner;

public class MenuLivrariaExcluir {
    public static boolean telaExcluir() {
        Scanner scr = new Scanner(System.in);
        boolean validador;
        do {
            validador = true;
            System.out.println("================================");
            System.out.println("Forneça o ID do produto para Excluir");
            Integer id = scr.nextInt();
            Produto idPesq = EstoqueDAO.pesqItem(id);
            if (idPesq != null) {
                System.out.println(idPesq);
            }
            System.out.println("================================");
            scr.nextLine();
            System.out.println("Este é o item que deseja Excluir? [S/N]");
            String escola = scr.nextLine();
            if (escola.equalsIgnoreCase("S")) {
                EstoqueDAO.removerProduto(id);
                System.out.println("Produto Removido com Sucesso");
            }
            System.out.println("================================");

            System.out.println("Deseja excluir outro item? [S/N]");
            String resp = scr.nextLine();
            if (resp.equalsIgnoreCase("N")) {
                validador = false;
            }

            System.out.println("================================");
        } while (validador);
        return true;
    }
}
