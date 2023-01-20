package br.com.americanas.polotech.control;
/*
No exemplo a seguir você deve implementar o sistema de uma livraria.
Primeira etapa Regras de Implementação O sistema deve ser capaz de cadastrar os seguintes produtos: livros, jogos, filmes, álbuns de música e brinquedos.

Livros: Devem ter nome, id, preço, gêneros, escritor, editora. --> CHECK
Jogos: Devem ter nome, id, preço, distribuidora, gêneros e estúdio --> CHECK
Filmes: Devem ter nome, id, preço, estúdio, diretores, gêneros e produtores. --> CHECK
Álbuns de música: Devem ter nome, id, preço, músicos/bandas, gêneros e selos. --> CHECK
Brinquedos: Devem ter nome, id, preço e tipo. --> CHECK

Além disso nosso sistema deve possuir um caixa. Este caixa deve ter a informação de dinheiro
que está presente nele. --> (CHECK)
Algumas funcionalidades do sistema:
Você deve ser capaz de adicionar --> (CHECK),
ver --> (CHECK),
alterar -->(Preço e qtdEstoque (check)) e
remover --> (CHECK) qualquer produto do sistema.
Você deve ser capaz de ver quantos itens de um tipo específico existem no estoque.  --> (CHECK)

Você deve ser capaz de ver a listagem completa dos itens em estoque. --> (check)
Você deve ser capaz de ver a listagem dos itens em estoque por categoria(tipo de item). --> (CHECK)
Você deve ser capaz de realizar a operação de compra, ao realizar esta operação --> (Check)
os produtos comprados são removidos do estoque e o dinheiro pago deve ser adicionado ao caixa.
 */

import br.com.americanas.polotech.model.DAO.EstoqueDAO;
import br.com.americanas.polotech.model.entity.*;
import br.com.americanas.polotech.view.menu.MenuInicial;

public class UsaAppCompra {
    public static void main(String[] args) {
        EstoqueDAO.inserirProduto(new Jogo("GOD:Ragnarok", 299.99, 3, "Sony", "Ação e Aventura", "Santa Monica"));
        EstoqueDAO.inserirProduto(new Livro("As Cronicas", 55.0, 3, "Aventura", "Escritor0", "Editora9"));
        EstoqueDAO.inserirProduto(new Filme("Tin tin", 24.99, 3, "Warner Bros", "Diretor1", "Ação e Aventura", "Produtor1"));
        EstoqueDAO.inserirProduto(new Livro("Bulsola de Ouro", 39.99, 3, "Aventura", "Escritor2", "Editora1"));
        EstoqueDAO.inserirProduto(new Livro("Código Limpo", 99.99, 3, "Universitário", "Robert Cecil Martin", "Alta Books"));
        EstoqueDAO.inserirProduto(new Jogo("Red Dead Redemption 2", 239.99, 3, "Sony", "Ação e Aventura", "RockStar"));
        EstoqueDAO.inserirProduto(new Jogo("God Of War", 69.99, 3, "Sony", "Ação e Aventura", "Santa Monica"));
        EstoqueDAO.inserirProduto(new AlbumDeMusica("Special", 16.50, 3, "Lizzo", "Hip hop", "Sony"));
        EstoqueDAO.inserirProduto(new Filme("Todo mundo em Pânico", 25.00, 3, "Warner Bros", "Diretor3", "Horror", "Produtor2"));
        EstoqueDAO.inserirProduto(new AlbumDeMusica("Harry's House", 15.50, 3, "Harry Styles", "Funk pop", "Columbia"));
        EstoqueDAO.inserirProduto(new Brinquedo("Barbie", 200.00, 3, "Boneco"));

        boolean iniciar = true;
        boolean fechar = false;

        while (fechar != true) {
            if (iniciar) {
                iniciar = MenuInicial.menuInicial();
                if (!iniciar) {
                    System.out.println("Saindo da Livraria");
                    fechar = true;
                }
            }
        }
    }
}
