package br.com.americanas.polotech.view.menu;

import br.com.americanas.polotech.view.menu.menuLivraria.telasCaixa.MenuNavegarCaixa;
import br.com.americanas.polotech.view.menu.menuLivraria.telasCaixa.MenuNavegarLivraria;

import java.util.Scanner;

public class MenuInicial {
    private static Double dinheiroEmCaixa = 0.0;

    public static boolean menuInicial() {
        Scanner src = new Scanner(System.in);
        Integer escolha;
        boolean validador = true;

        do {
            System.out.println();
            System.out.println("======Bem vindo a Livraria======");
            System.out.println("================================");
            System.out.println("1. Entrar no Caixa");
            System.out.println("2. Entrar no Estoque da Livraria");
            System.out.println("3. Sair da Livraria");
            System.out.println("================================");
            System.out.print("OPÇÃO ESCOLHIDA: ");
            escolha = src.nextInt();

            switch (escolha) {
                case 1:
                    validador = MenuNavegarCaixa.menuCaixa();
                    break;
                case 2:
                    validador = MenuNavegarLivraria.navegarLivratia();
                    break;
                case 3:
                    validador = false;
                    break;
                case 4:
                    System.out.println("Escolha uma opção de 1 a 3");
                    break;
            }
        } while (validador);
        src.close();
        return false;
    }
}
