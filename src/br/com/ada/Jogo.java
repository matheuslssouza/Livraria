package br.com.ada;

public class Jogo extends Produtos {
    String nomeDistribuidora;
    String jogoGenero;
    String jogoEstudio;

    public Jogo(String nomeProduto, int preço, String genero, String estudio, int unicoId){
      
        this.produtoNome = nomeProduto;
        this.produtoPreço = preço;
        this.jogoGenero = genero;
        this.jogoEstudio = estudio;
        this.produtoId = unicoId;
  
     }

     public void caracteristicasJogo() {
        System.out.println("------------------------------");
        System.out.println("Produto Id: " + this.produtoId);
        System.out.println("Nome: " + this.produtoNome);
        System.out.println("Preço: " + this.produtoPreço);
        System.out.println("Genero: " + this.jogoGenero);
        System.out.println("Estudio: " + this.jogoEstudio);
        System.out.println("------------------------------");
     }
}
