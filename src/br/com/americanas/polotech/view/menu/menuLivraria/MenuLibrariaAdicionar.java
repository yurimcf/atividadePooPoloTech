package br.com.americanas.polotech.view.menu.menuLivraria;

import br.com.americanas.polotech.model.BEAN.EstoqueMetodos;
import br.com.americanas.polotech.model.entity.AlbumDeMusica;

import java.util.Scanner;

public class MenuLibrariaAdicionar {
    public static boolean telaAdiconar() {
        boolean continua = true;
        Integer escolha;
        Scanner scr = new Scanner(System.in);
        boolean validador;
        do {
            validador = true;
            System.out.println("================================");
            System.out.println("1. Adicionar Album de Musica");
            System.out.println("2. Adicionar Brinquedo");
            System.out.println("3. Adicionar Filme");
            System.out.println("4. Adicionar Jogo");
            System.out.println("5. Adicionar Livro");
            System.out.println("6. Voltar");
            System.out.println("================================");
            System.out.print("OPÇÃO ESCOLHIDA: ");
            escolha = scr.nextInt();

            switch (escolha) {
                case 1:
                    while (continua) {
                        System.out.println("================================");
                        scr.nextLine();
                        System.out.println("Nome do Album?");
                        String nome = scr.nextLine();

                        System.out.println("Preço");
                        Double preco = Double.parseDouble(scr.nextLine());

                        System.out.println("Quantidade comprada");
                        Integer qtdItem = scr.nextInt();

                        System.out.println("Compositor");
                        scr.nextLine();
                        String compositor = scr.nextLine();

                        System.out.println("Genero");
                        String genero = scr.nextLine();

                        System.out.println("Selos");
                        String selos = scr.nextLine();
                        System.out.println("================================");

                        AlbumDeMusica albumDeMusica = new AlbumDeMusica(nome, preco, qtdItem, compositor, genero, selos);
                        EstoqueMetodos.inserirProduto(albumDeMusica);
                        System.out.println("Adicionar outra muscia? [S/N]");
                        String resp = scr.nextLine();
                        if (resp.equalsIgnoreCase("n")) {
                            continua = false;
                        }
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    validador = false;
                    break;
                default:
                    System.out.println("Escolha uma opção valida");
                    break;
            }

        } while (validador);
        return true;
    }
}
