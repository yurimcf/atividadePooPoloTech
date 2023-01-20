package br.com.americanas.polotech.view.menu.menuLivraria.telasCaixa;

import br.com.americanas.polotech.model.DAO.CaixaDAO;

import java.util.Scanner;

public class MenuNavegarCaixa {
    public static boolean menuCaixa() {
        Scanner sc = new Scanner(System.in);
        Integer escolha;
        boolean validador = true;

        do {
            System.out.println("[Saldo Atual]:" + CaixaDAO.getSaldoEmCaixa());
            System.out.println("================================");
            System.out.println("1. Deposital saldo em Caixa");
            System.out.println("2. Adicionar Produto no Carrinho");
            System.out.println("3. Remover Produto do Carrinho");
            System.out.println("4. Mostrar Carrinho de Compras");
            System.out.println("5. Finalizar Compra");
            System.out.println("6. Voltar para Inicio");
            System.out.println("================================");
            System.out.print("OPÇÃO ESCOLHIDA: ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("================================");
                    System.out.println("Deposite Dinheiro no caixa");
                    Double saldo = sc.nextDouble();
                    CaixaDAO.adicionarSaldo(saldo);
                    break;
                case 2:
                    MenuCaixaAdicionar.telaAdicionarNoCarrinho();
                    break;
                case 3:
                    MenuCaixaExcluir.telaRemoverDoCarrinho();
                    break;
                case 4:
                    System.out.println("=========================================================");
                    System.out.println("[ID][Nome]                      [Valor/U][Qtd]");
                    CaixaDAO.exibirCarrinho();
                    System.out.println("[Valor Total]: " + CaixaDAO.precoTotal());
                    System.out.println("=========================================================");
                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("Finalizar compra? [S/N]");
                    String resp = sc.nextLine();
                    if (resp.equalsIgnoreCase("s")) {
                        boolean compraSituacao = CaixaDAO.finalizaCompra();
                        if (compraSituacao) {
                            System.out.println("================================");
                            System.out.println("Compra Realizada com sucesso");
                        } else {
                            System.out.println("================================");
                            System.out.println("Saldo insuficiente");
                            System.out.println("Deposite dinheiro em caixa por favor");
                        }
                    }
                    break;
                case 6:
                    validador =false;
                    break;
                default:
                    System.out.println("Escolha um opção Valida 1 a 5");
                    break;
            }
        } while (validador);
        return true;
    }
}
