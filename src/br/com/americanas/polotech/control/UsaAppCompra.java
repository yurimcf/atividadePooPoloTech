package br.com.americanas.polotech.control;
/*
No exemplo a seguir você deve implementar o sistema de uma livraria.
Primeira etapa Regras de Implementação O sistema deve ser capaz de cadastrar os seguintes produtos: livros, jogos, filmes, álbuns de música e brinquedos.

Livros: Devem ter nome, id, preço, gêneros, escritor, editora .
Jogos: Devem ter nome, id, preço, distribuidora, gêneros e estúdio
Filmes: Devem ter nome, id, preço, estúdio, diretores, gêneros e produtores
Álbuns de música: Devem ter nome, id, preço, músicos/bandas, gêneros e selos
Brinquedos: Devem ter nome, id, preço e tipo.

Além disso nosso sistema deve possuir um caixa. Este caixa deve ter a informação de dinheiro
que está presente nele.
Algumas funcionalidades do sistema:
Você deve ser capaz de adicionar(check), ver(check), alterar e remover(check) qualquer produto do sistema.
Você deve ser capaz de ver quantos itens de um tipo específico existem no estoque.
Você deve ser capaz de ver a listagem completa dos itens em estoque.
Você deve ser capaz de ver a listagem dos itens em estoque por categoria(tipo de item).
Você deve ser capaz de realizar a operação de compra, ao realizar esta operação
os produtos comprados são removidos do estoque e o dinheiro pago deve ser adicionado ao caixa.
 */

import br.com.americanas.polotech.model.BEAN.EstoqueMetodos;
import br.com.americanas.polotech.model.entity.*;
import br.com.americanas.polotech.view.MenuInicial;

public class UsaAppCompra {
    public static void main(String[] args) {
        EstoqueMetodos.inserirProduto(new Jogo("Zelda", 299.99, 10, "Nintendo", "Aventura", "Nintendo"));
        EstoqueMetodos.inserirProduto(new Livro("Livro 1", 9.99, 10, "Ficção", "Escritor1", "Editora1"));
        EstoqueMetodos.inserirProduto(new Filme("Filme 1 o retorno", 25.00, 10, "Warner Bros", "Diretor1", "Terror", "Produtor1"));
        EstoqueMetodos.inserirProduto(new Livro("Livro 2", 19.99, 10, "Aventura", "Escritor2", "Editora1"));
        EstoqueMetodos.inserirProduto(new Livro("Livro 3", 35.99, 10, "Ação", "Escritor3", "Editora2"));
        EstoqueMetodos.inserirProduto(new Jogo("Mario", 150.00, 10, "Nintendo", "Aventura", "Nintendo"));
        EstoqueMetodos.inserirProduto(new Jogo("Overwatch", 890.00, 10, "Microsoft", "FPS", "Blizard"));
        EstoqueMetodos.inserirProduto(new AlbumDeMusica("Musica1", 0.50, 100, "Compositor1", "Pop", "Sony"));
        EstoqueMetodos.inserirProduto(new Filme("Filme 1", 25.00, 10, "Warner Bros", "Diretor3", "Horror", "Produtor2"));
        EstoqueMetodos.inserirProduto(new AlbumDeMusica("Musica2", 0.70, 100, "Compositor1", "Indie", "Emi"));
        EstoqueMetodos.inserirProduto(new Brinquedo("Barbie", 400.00, 2, "Boneco"));

        //EstoqueMetodos.exibirTodos();

        // deu certo
//        boolean verifica = EstoqueMetodos.removerProduto(3);
//        if (verifica =! false) {
//            System.out.println("Produto Excluido");
//        } else {
//            System.out.println("Erro ao excluir");
//        }

        //acho que funciona ok
//        EstoqueMetodos.alterarProduto(5,new Livro("Machamdo de Assis",24.99, 10,"Romance","Dom Casmurro","EditoraTop"));
//        EstoqueMetodos.exibirTodos();

        boolean iniciar = true;
        boolean validador = true;

        while (validador != false) {
            if (iniciar) {
                iniciar = MenuInicial.menuInicial();
                if (!iniciar) {
                    System.out.println("Saindo da Livraria");
                    validador = false;
                }
            }
        }
    }
}
