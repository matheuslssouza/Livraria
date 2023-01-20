package br.com.ada;
import java.util.*;

public class Album extends Produtos {
   private String nomeBanda;
   private String generoMusical;
   private String seloMusical;
   

   public Album(String nomeProduto, int preço, String banda, String genero, String selo, int unicoId) {

      this.produtoNome = nomeProduto;
      this.produtoPreço = preço;
      this.nomeBanda = banda;
      this.generoMusical = genero;
      this.seloMusical = selo;
      this.produtoId = unicoId;
   }

   //trocar por ToString()
   public void caracteristicasAlbum() {
      System.out.println("------------------------------");
      System.out.println("Produto Id: " + this.produtoId);
      System.out.println("Nome: " + this.produtoNome);
      System.out.println("Preço: " + this.produtoPreço);
      System.out.println("Nome da Banda: " + this.nomeBanda);
      System.out.println("Genêro Musical: " + this.generoMusical);
      System.out.println("Selo Musical: " + this.seloMusical);
      System.out.println("------------------------------");
   }



}
