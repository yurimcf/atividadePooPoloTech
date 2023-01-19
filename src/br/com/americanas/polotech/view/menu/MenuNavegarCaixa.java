package br.com.americanas.polotech.view.menu;

import br.com.americanas.polotech.model.DAO.CaixaDAO;
import br.com.americanas.polotech.model.DAO.EstoqueDAO;
import br.com.americanas.polotech.model.entity.Produto;
import br.com.americanas.polotech.view.menu.menuLivraria.MenuCaixaAdicionar;

import java.util.Scanner;

public class MenuNavegarCaixa {
    public static boolean menuCaixa() {
        Scanner src = new Scanner(System.in);
        Integer escolha;
        boolean validador = true;

        do {
            System.out.println("[Saldo Atual]:" + CaixaDAO.getSaldoEmCaixa());
            System.out.println("================================");
            System.out.println("1. Deposital saldo em Caixa");
            System.out.println("2. Adicionar Produto no Carrinho");
            System.out.println("3. Remover Produto do Carrinho");
            System.out.println("4. Mostrar Nota Fiscal");
            System.out.println("4. Finalizar Compra");
            System.out.println("5. Voltar para Inicio");
            System.out.println("================================");
            System.out.print("OPÇÃO ESCOLHIDA: ");
            escolha = src.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Deposite Dinheiro no caixa");
                    Double saldo = src.nextDouble();
                    CaixaDAO.calculaSaldo(saldo);
                    break;
                case 2:
                    MenuCaixaAdicionar.telaAdicionarNoCarrinho();
                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    break;
            }
        } while (validador);


        return true;
    }
}
