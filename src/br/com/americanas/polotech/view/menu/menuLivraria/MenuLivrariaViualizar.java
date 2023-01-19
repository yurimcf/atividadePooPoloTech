package br.com.americanas.polotech.view.menu.menuLivraria;

import br.com.americanas.polotech.model.DAO.EstoqueDAO;

import java.util.Scanner;

public class MenuLivrariaViualizar {

    public static boolean telaVisualizar() {
        Integer escolha;
        Scanner scr = new Scanner(System.in);
        boolean validador;
        do {
            validador = true;
            System.out.println("================================");
            System.out.println("1. Visualizar Album de Musica");
            System.out.println("2. Visualizar Brinquedo");
            System.out.println("3. Visualizar Filme");
            System.out.println("4. Visualizar Jogo");
            System.out.println("5. Visualizar Livro");
            System.out.println("6. Visualizar Todos os itens No Estoque");
            System.out.println("7. Voltar");
            System.out.println("================================");
            System.out.print("OPÇÃO ESCOLHIDA: ");
            escolha = scr.nextInt();

            switch (escolha){
                case 1:
                    EstoqueDAO.exibirPorCategoria(1);
                    break;
                case 2:
                    EstoqueDAO.exibirPorCategoria(2);
                    break;
                case 3:
                    EstoqueDAO.exibirPorCategoria(3);
                    break;
                case 4:
                    EstoqueDAO.exibirPorCategoria(4);
                    break;
                case 5:
                    EstoqueDAO.exibirPorCategoria(5);
                    break;
                case 6:
                    EstoqueDAO.exibirTodos();
                    break;
                case 7:
                    validador = false;
                    break;
                default:
                    System.out.println("Escolha uma opção valida");
                    break;
            }
        }while (validador);

        return true;
    }
}
