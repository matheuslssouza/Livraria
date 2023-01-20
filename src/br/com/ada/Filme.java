package br.com.ada;

public class Filme extends Produtos {
    String nomeEstudio;
    String nomeDiretor;
    String generoFilme;
    String nomeProdutor;


    public Filme(String nomeProduto, int preço, String estudio, String diretor, String genero, String produtor, int unicoId){
      
        this.produtoNome = nomeProduto;
        this.produtoPreço = preço;
        this.nomeEstudio = estudio;
        this.nomeDiretor = diretor;
        this.generoFilme =  genero;
        this.nomeProdutor = produtor;
        this.produtoId = unicoId;
     }
     
     public void caracteristicasFilme() {
        System.out.println("------------------------------");
        System.out.println("Produto Id: " + this.produtoId);
        System.out.println("Nome: " + this.produtoNome);
        System.out.println("Preço: " + this.produtoPreço);
        System.out.println("Diretor: " + this.nomeDiretor);
        System.out.println("Genero: " + this.generoFilme);
        System.out.println("Produtor: " + this.nomeProdutor);
        System.out.println("------------------------------");
     }
}
