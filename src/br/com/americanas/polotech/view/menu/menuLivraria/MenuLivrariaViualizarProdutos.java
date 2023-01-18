package br.com.americanas.polotech.view.menu.menuLivraria;

import br.com.americanas.polotech.model.BEAN.EstoqueMetodos;

import java.util.Scanner;

public class MenuLivrariaViualizarProdutos {

    public static boolean visualiarTipoDeProduto() {
        boolean continua = true;
        Integer escolha;
        Scanner scr = new Scanner(System.in);
        boolean validador;
        do {
            validador = true;
            continua = true;
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
                    EstoqueMetodos.exibirTipo(1);
                    break;
                case 2:
                    EstoqueMetodos.exibirTipo(2);
                    break;
                case 3:
                    EstoqueMetodos.exibirTipo(3);
                    break;
                case 4:
                    EstoqueMetodos.exibirTipo(4);
                    break;
                case 5:
                    EstoqueMetodos.exibirTipo(5);
                    break;
                case 6:
                    EstoqueMetodos.exibirTodos();
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