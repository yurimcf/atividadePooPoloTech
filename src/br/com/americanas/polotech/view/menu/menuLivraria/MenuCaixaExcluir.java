package br.com.americanas.polotech.view.menu.menuLivraria;

import br.com.americanas.polotech.model.DAO.CaixaDAO;

import java.util.Scanner;

public class MenuCaixaExcluir {

    public static void telaRemoverDoCarrinho() {
        boolean continua = true;
        Integer escolha;
        Scanner sc = new Scanner(System.in);
        boolean resp;
        do {
            System.out.println("================================");
            System.out.println("1. Remover 1 Item");
            System.out.println("2. Remover Todos os Itens");
            System.out.println("3. Voltar");
            System.out.println("================================");
            System.out.print("OPÇÃO ESCOLHIDA: ");
            escolha = sc.nextInt();

            CaixaDAO.impressaoPrevia();
            Integer idPesq;
            switch (escolha) {
                case 1:
                    System.out.println("Digite o Código do Produto");
                    idPesq = sc.nextInt();
                    resp = CaixaDAO.removerUmItem(idPesq);
                    if (resp == true) {
                        System.out.println("Um item Removido");
                    } else {
                        System.out.println("Produto não encontrado");
                    }
                    break;
                case 2:
                    System.out.println("Digite o Código do Produto");
                    idPesq = sc.nextInt();
                    resp = CaixaDAO.removerTodos(idPesq);
                    if (resp == true) {
                        System.out.println("Todos os itens removidos");
                    } else {
                        System.out.println("Produto não encontrado");
                    }
                    break;
                case 3:
                    continua = false;
                    break;
                default:
                    System.out.println("Escolha uma Opção valida 1 a 3");
                    break;
            }
        }while(continua);

    }
}
