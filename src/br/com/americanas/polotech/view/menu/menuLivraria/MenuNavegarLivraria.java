package br.com.americanas.polotech.view.menu.menuLivraria;

import java.util.Scanner;

public class MenuNavegarLivraria {
    public static boolean navegarLivratia() {
        Scanner src = new Scanner(System.in);
        Integer escolha;
        boolean validador = true;

        do {
            System.out.println("================================");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Visualizar Produtos Disponiveis");
            System.out.println("3. Excluir Produto");
            System.out.println("4. Alterar Produto");
            System.out.println("5. Voltar para Inicio");
            System.out.println("================================");
            System.out.print("OPÇÃO ESCOLHIDA: ");
            escolha = src.nextInt();

            switch (escolha) {
                case 1:
                    validador = MenuLibrariaAdicionar.telaAdiconar();
                    break;
                case 2:
                    validador = MenuLivrariaViualizar.telaVisualizar();
                    break;
                case 3:
                    validador = MenuLivrariaExcluir.telaExcluir();
                    break;
                case 4:
                    validador = MenuLivrariaAlterar.telaAlterar();
                    break;
                case 5:
                    validador = false;
                    break;
                default:
                    System.out.println("Escolha um Número de 1 a 5");
            }
        } while (validador);
        return true;
    }
}
