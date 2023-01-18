package br.com.americanas.polotech.view.menu.menuLivraria;

import br.com.americanas.polotech.model.DAO.EstoqueMetodos;

import java.util.Scanner;

public class MenuLivrariaAlterar {
    public static boolean telaAlterar() {
        Scanner src = new Scanner(System.in);
        Integer escolha;
        boolean validador = true;

        do {
            System.out.println("================================");
            System.out.println("1. Alterar PREÇO do Produto");
            System.out.println("2. Alterar QTD DE ESTOQUE");
            System.out.println("3. Voltar");
            System.out.println("================================");
            System.out.print("OPÇÃO ESCOLHIDA: ");
            escolha = src.nextInt();

            Integer id;
            switch (escolha) {
                case 1:
                    System.out.println("Forneça o ID do produto");
                    id = src.nextInt();
                    System.out.println("Digite o novo Valor");
                    Double valor = Double.parseDouble(src.nextLine());

                    EstoqueMetodos.alterarProduto(id, valor);
                    break;
                case 2:
                    System.out.println("Forneça o ID do produto");
                    id = src.nextInt();
                    System.out.println("Digite a Quantidade certa");
                    Integer qtd = src.nextInt();

                    EstoqueMetodos.alterarProduto(id, qtd);
                    break;
                case 3:
                    validador = false;
                    break;
                default:
                    System.out.println("Digite uma Opção Válida");
                    break;
            }
        }while (validador);
        return true;
    }
}
