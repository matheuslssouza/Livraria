package br.com.ada;

import java.util.*;

public class Metodos {
    Produtos produtos = new Produtos();
    ArrayList<Album> listAlbum = new ArrayList();
    ArrayList<Brinquedo> listBrinquedo = new ArrayList();
    ArrayList<Filme> listFilme = new ArrayList();
    ArrayList<Jogo> listJogo = new ArrayList();
    ArrayList<Livro> listLivro = new ArrayList();
    Scanner scanner = new Scanner(System.in);

    public int caixaLivraria = 1000;

    public Integer unicoId = 0;

    public void imprimirMenu() {
        System.out.println("-------------------------------------------");
        System.out.println("                LIVRARIA MATJESS           ");
        System.out.println("                   OPÇÕES                  ");
        System.out.println("           1 - Adicionar Produtos          ");
        System.out.println("           2 - Remover Produtos            ");
        System.out.println("           3 - Alterar Preço do Produto    ");
        System.out.println("           4 - Listar Produtos             ");
        System.out.println("           5 - Comprar Produtos            ");
        System.out.println("           6 - Caixa                       ");
        System.out.println("           7 - Fechar Programa             ");
        System.out.println("-------------------------------------------");
    }

    public void iniciarPrograma() {

        boolean start = true;
        while (start) {

            imprimirMenu();

            int opcoesMenu = scanner.nextInt();
            scanner.nextLine();

            switch (opcoesMenu) {
                case 1:
                    tipoProduto();
                    break;

                case 2:
                removerProduto();
                    break;

                case 3:
                    alterarPreço();
                    break;

                case 4:
                    listarProdutos();
                    break;

                case 5:
                comprarProduto();
                    break;

                case 6:
                    System.out.println("O caixa contém: " + caixaLivraria + " R$");
                    break;

                case 7:
                    start = false;
                    break;

            }

        }
    }

    public void tipoProduto() {

        System.out.println("-------------------------------------------");
        System.out.println("              1 - Album de Música          ");
        System.out.println("              2 - Brinquedo                ");
        System.out.println("              3 - Filme                    ");
        System.out.println("              4 - Jogo                     ");
        System.out.println("              5 - Livro                    ");
        System.out.println("              6 - Voltar                   ");
        System.out.println("-------------------------------------------");

        int validacaoMenu = scanner.nextInt();
        scanner.nextLine();

        switch (validacaoMenu) {
            case 1:
                inicializadorAlbum();
                break;

            case 2:
                inicializadorBrinquedo();
                break;

            case 3:
                inicializadorFilme();
                break;

            case 4:
                inicializadorJogo();
                break;

            case 5:
                inicializadorLivro();
                break;

            case 6:
                break;
        }

    }

    public void inicializadorAlbum() {

        System.out.println("Digite as caracteristicas do album: ");

        System.out.print("Nome: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Preço: ");
        int preço = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome da Banda/Artista: ");
        String banda = scanner.nextLine();

        System.out.print("Genêro Musical: ");
        String genero = scanner.nextLine();

        System.out.print("Selo: ");
        String selo = scanner.nextLine();

        Album album = new Album(nomeProduto, preço, banda, genero, selo, unicoId);

        listAlbum.add(album);

        unicoId++;

    }

    public void inicializadorBrinquedo() {

        System.out.println("Digite as caracteristicas do Brinquedo: ");

        System.out.print("Nome: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Preço: ");
        int preço = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Tipo de Brinquedo: ");
        String tipoBrinquedo = scanner.nextLine();

        Brinquedo brinquedo = new Brinquedo(nomeProduto, preço, tipoBrinquedo, unicoId);

        listBrinquedo.add(brinquedo);

        unicoId++;

    }

    public void inicializadorFilme() {

        System.out.println("Digite as caracteristicas do Filme: ");

        System.out.print("Nome: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Preço: ");
        int preço = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Estudio: ");
        String estudio = scanner.nextLine();

        System.out.print("Diretor: ");
        String diretor = scanner.nextLine();

        System.out.print("Genero: ");
        String genero = scanner.nextLine();

        System.out.print("Produtor: ");
        String produtor = scanner.nextLine();

        Filme filme = new Filme(nomeProduto, preço, estudio, diretor, genero, produtor, unicoId);

        listFilme.add(filme);
        unicoId++;

    }

    public void inicializadorJogo() {

        System.out.println("Digite as caracteristicas do Jogo: ");

        System.out.print("Nome: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Preço: ");
        int preço = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Genero: ");
        String genero = scanner.nextLine();

        System.out.print("Estudio: ");
        String estudio = scanner.nextLine();

        Jogo jogo = new Jogo(nomeProduto, preço, genero, estudio, unicoId);
        listJogo.add(jogo);
        unicoId++;

    }

    public void inicializadorLivro() {

        System.out.println("Digite as caracteristicas do Livro: ");

        System.out.print("Nome: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Preço: ");
        int preço = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Selo: ");
        String genero = scanner.nextLine();

        System.out.print("Escritor: ");
        String escritor = scanner.nextLine();

        System.out.print("Editora: ");
        String editora = scanner.nextLine();

        Livro livro = new Livro(nomeProduto, preço, genero, escritor, editora, unicoId);
        listLivro.add(livro);
        unicoId++;

    }

    public void alterarPreço() {
        System.out.println("Para alterar o produto digite o Id: ");
        int verificadorId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite um novo valor: ");
        int novoPreço = scanner.nextInt();
        scanner.nextLine();
       
        for (Album item : listAlbum) {
            if (item.produtoId == verificadorId) {

                item.produtoPreço = novoPreço;
            }
            ;
        }

        for (Brinquedo item : listBrinquedo) {
            if (item.produtoId == verificadorId) {

                item.produtoPreço = novoPreço;
            }
            ;
        }

        for (Filme item : listFilme) {
            if (item.produtoId == verificadorId) {

                item.produtoPreço = novoPreço;
            }
            ;
        }

        for (Jogo item : listJogo) {
            if (item.produtoId == verificadorId) {

                item.produtoPreço = novoPreço;
            }
            ;
        }

        for (Livro item : listLivro) {
            if (item.produtoId == verificadorId) {

                item.produtoPreço = novoPreço;
            }
            ;
        }
        

    }

    public void listarProdutos() {
        System.out.println("-------------------------------------------");
        System.out.println("              Tipos de Listagem:           ");
        System.out.println("              1 - Lista de Albuns          ");
        System.out.println("              2 - Lista de Brinquedos      ");
        System.out.println("              3 - Lista de Filmes          ");
        System.out.println("              4 - Lista de Jogos           ");
        System.out.println("              5 - Lista de Livros          ");
        System.out.println("              6 - Listar todos produtos    ");
        System.out.println("              7 - Voltar                   ");
        System.out.println("-------------------------------------------");

        int validacaoMenu = scanner.nextInt();
        scanner.nextLine();

        switch (validacaoMenu) {
            case 1:
                if (listAlbum.size() == 0) {
                    System.out.println("Não existem produtos nesta lista! ");
                    break;
                }
                for (Album item : listAlbum) {
                    item.caracteristicasAlbum();
                }

                break;

            case 2:
                if (listBrinquedo.size() == 0) {
                    System.out.println("Não existem produtos nesta lista! ");
                    break;
                }
                for (Brinquedo item : listBrinquedo) {
                    item.caracteristicasBrinquedo();

                }
                break;

            case 3:
                if (listFilme.size() == 0) {
                    System.out.println("Não existem produtos nesta lista! ");
                    break;
                }
                for (Filme item : listFilme) {
                    item.caracteristicasFilme();

                }
                break;

            case 4:
                if (listJogo.size() == 0) {
                    System.out.println("Não existem produtos nesta lista! ");
                    break;
                }
                for (Jogo item : listJogo) {
                    item.caracteristicasJogo();

                }
                break;

            case 5:

                if (listLivro.size() == 0) {
                    System.out.println("Não existem produtos nesta lista! ");
                    break;
                }
                for (Livro item : listLivro) {
                    item.caracteristicasLivro();

                }
                break;

            case 6:
                System.out.println("Todos os produtos listados são: ");
                for (Album item : listAlbum) {
                    item.caracteristicasAlbum();
                }
                for (Brinquedo item : listBrinquedo) {
                    item.caracteristicasBrinquedo();

                }

                for (Filme item : listFilme) {
                    item.caracteristicasFilme();

                }

                for (Jogo item : listJogo) {
                    item.caracteristicasJogo();

                }
                for (Livro item : listLivro) {
                    item.caracteristicasLivro();

                }
                break;
            case 7:
                iniciarPrograma();
                break;
        }

    }

    public void removerProduto(){
        System.out.println("Digite o id do produto que deseja remover: ");
        int verificadorId = scanner.nextInt();
        for (Album item : listAlbum) {
            if (item.produtoId == verificadorId) {

                listAlbum.remove(item);
                break;
            }
            
        }

        for (Brinquedo item : listBrinquedo) {
            if (item.produtoId == verificadorId) {

                listBrinquedo.remove(item);
                break;
            }
            
        }

        for (Filme item : listFilme) {
            if (item.produtoId == verificadorId) {

                listFilme.remove(item);
                break;
            }
            
        }

        for (Jogo item : listJogo) {
            if (item.produtoId == verificadorId) {

                listJogo.remove(item);
                break;
            }
            
        }

        for (Livro item : listLivro) {
            if (item.produtoId == verificadorId) {

                listLivro.remove(item);
                break;
            }
            ;
        }
    }

    
    public void comprarProduto(){
        System.out.println("Digite o id do produto que deseja comprar: ");
        
        int verificadorId = scanner.nextInt();
        for (Album item : listAlbum) {
            if (item.produtoId == verificadorId) {
               caixaLivraria = caixaLivraria + item.produtoPreço;
               listAlbum.remove(item);
               System.out.println("Produto " + item.produtoNome + " comprado com sucesso!" );
               return;
            }
            
        }

        for (Brinquedo item : listBrinquedo) {
            if (item.produtoId == verificadorId) {
                caixaLivraria = caixaLivraria + item.produtoPreço;
                listBrinquedo.remove(item);
                System.out.println("Produto " + item.produtoNome + " comprado com sucesso!" );
                return;
            }
            
        }

        for (Filme item : listFilme) {
            if (item.produtoId == verificadorId) {
                caixaLivraria = caixaLivraria + item.produtoPreço;
                listFilme.remove(item);
                System.out.println("Produto " + item.produtoNome + " comprado com sucesso!" );
                return;
            }
            
        }

        for (Jogo item : listJogo) {
            if (item.produtoId == verificadorId) {
                caixaLivraria = caixaLivraria + item.produtoPreço;
                listJogo.remove(item);
                System.out.println("Produto " + item.produtoNome + " comprado com sucesso!" );
                return;
            }
            
        }

        for (Livro item : listLivro) {
            if (item.produtoId == verificadorId) {
                caixaLivraria = caixaLivraria + item.produtoPreço;
                listLivro.remove(item);
                System.out.println("Produto " + item.produtoNome + " comprado com sucesso!" );
                return;
            }
            ;
        }

        System.out.println("Id de produto não encontrado!");
        comprarProduto();
    }


}
