package br.com.ada;

public class Livro extends Produtos {
   
    String generoLivro;
    String escritorLivro;
    String editoraLivro;

    public Livro(String nomeProduto, int preço, String genero, String escritor, String editora, int unicoId){
      
        this.produtoNome = nomeProduto;
        this.produtoPreço = preço;
        this.generoLivro = genero;
        this.escritorLivro = escritor;
        this.editoraLivro = editora;
        this.produtoId = unicoId;
     }

     public void caracteristicasLivro() {
        System.out.println("------------------------------");
        System.out.println("Produto Id: " + this.produtoId);
        System.out.println("Nome: " + this.produtoNome);
        System.out.println("Preço: " + this.produtoPreço);
        System.out.println("Genero: " + this.generoLivro);
        System.out.println("Escritor: " + this.escritorLivro);
        System.out.println("Editora: " + this.editoraLivro);
        System.out.println("------------------------------");
     }
}
