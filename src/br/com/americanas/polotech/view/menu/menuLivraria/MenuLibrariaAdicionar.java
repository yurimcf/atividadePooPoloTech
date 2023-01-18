package br.com.americanas.polotech.view.menu.menuLivraria;

import br.com.americanas.polotech.model.DAO.EstoqueDAO;
import br.com.americanas.polotech.model.entity.*;

import java.util.Scanner;

public class MenuLibrariaAdicionar {
    public static boolean telaAdiconar() {
        boolean continua = true;
        Integer escolha;
        Scanner scr = new Scanner(System.in);
        boolean validador;
        do {
            validador = true;
            continua = true;
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
                        System.out.println("Quantidade no Estoque");
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
                        EstoqueDAO.inserirProduto(albumDeMusica);
                        System.out.println("Adicionar outra muscia? [S/N]");
                        String resp = scr.nextLine();
                        if (resp.equalsIgnoreCase("n")) {
                            continua = false;
                        }
                    }
                    break;
                case 2:
                    while (continua) {
                        System.out.println("================================");
                        scr.nextLine();
                        System.out.println("Nome do Brinquedo?");
                        String nome = scr.nextLine();
                        System.out.println("Preço");
                        Double preco = Double.parseDouble(scr.nextLine());
                        System.out.println("Quantidade no Estoque");
                        Integer qtdItem = scr.nextInt();
                        System.out.println("Tipo");
                        scr.nextLine();
                        String tipo = scr.nextLine();
                        System.out.println("================================");

                        Brinquedo brinquedo = new Brinquedo(nome, preco, qtdItem, tipo);
                        EstoqueDAO.inserirProduto(brinquedo);
                        System.out.println("Adicionar outro Brinquedo? [S/N]");
                        String resp = scr.nextLine();
                        if (resp.equalsIgnoreCase("n")) {
                            continua = false;
                        }
                    }
                    break;
                case 3:
                    while (continua) {
                        System.out.println("================================");
                        scr.nextLine();
                        System.out.println("Nome do Filme?");
                        String nome = scr.nextLine();
                        System.out.println("Preço");
                        Double preco = Double.parseDouble(scr.nextLine());
                        System.out.println("Quantidade no Estoque");
                        Integer qtdItem = scr.nextInt();
                        System.out.println("Estudio");
                        scr.nextLine();
                        String estudio = scr.nextLine();
                        System.out.println("Diretor");
                        String diretor = scr.nextLine();
                        System.out.println("Gênero");
                        String genero = scr.nextLine();
                        System.out.println("Produtor");
                        String produtor = scr.nextLine();
                        System.out.println("================================");

                        Filme filme = new Filme(nome,preco,qtdItem,estudio,diretor,genero,produtor);
                        EstoqueDAO.inserirProduto(filme);
                        System.out.println("Adicionar outro Filme? [S/N]");
                        String resp = scr.nextLine();
                        if (resp.equalsIgnoreCase("n")) {
                            continua = false;
                        }
                    }
                    break;
                case 4:
                    while (continua) {
                        System.out.println("================================");
                        scr.nextLine();
                        System.out.println("Nome do Jogo?");
                        String nome = scr.nextLine();
                        System.out.println("Preço");
                        Double preco = Double.parseDouble(scr.nextLine());
                        System.out.println("Quantidade no Estoque");
                        Integer qtdItem = scr.nextInt();
                        System.out.println("Distribuidora");
                        scr.nextLine();
                        String distribuidora = scr.nextLine();
                        System.out.println("Gênero");
                        String genero = scr.nextLine();
                        System.out.println("Estudio");
                        String estudio = scr.nextLine();
                        System.out.println("================================");

                        Jogo jogo = new Jogo(nome,preco,qtdItem,distribuidora,genero,estudio);
                        EstoqueDAO.inserirProduto(jogo);
                        System.out.println("Adicionar outro Jogo? [S/N]");
                        String resp = scr.nextLine();
                        if (resp.equalsIgnoreCase("n")) {
                            continua = false;
                        }
                    }
                    break;
                case 5:
                    while (continua) {
                        System.out.println("================================");
                        scr.nextLine();
                        System.out.println("Nome do Livro?");
                        String nome = scr.nextLine();
                        System.out.println("Preço");
                        Double preco = Double.parseDouble(scr.nextLine());
                        System.out.println("Quantidade no Estoque");
                        Integer qtdItem = scr.nextInt();
                        System.out.println("Escritor");
                        scr.nextLine();
                        String escritor = scr.nextLine();
                        System.out.println("Gênero");
                        String genero = scr.nextLine();
                        System.out.println("Editoda");
                        String editoda = scr.nextLine();
                        System.out.println("================================");

                        Livro livro = new Livro(nome,preco,qtdItem,genero,escritor,editoda);
                        EstoqueDAO.inserirProduto(livro);
                        System.out.println("Adicionar outro Livro? [S/N]");
                        String resp = scr.nextLine();
                        if (resp.equalsIgnoreCase("n")) {
                            continua = false;
                        }
                    }
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
