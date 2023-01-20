package br.com.ada;
import java.util.*;

public class Brinquedo  extends Produtos{
    private String tipoBrinquedo;
    
    public Brinquedo(String nomeProduto, int preço, String brinquedo, int unicoId ){
        this.produtoNome = nomeProduto;
        this.produtoPreço = preço;
        this.tipoBrinquedo = brinquedo;
        this.produtoId = unicoId;
  
     }

     public void caracteristicasBrinquedo() {
        System.out.println("------------------------------");
        System.out.println("Produto Id: " + this.produtoId);
        System.out.println("Nome: " + this.produtoNome);
        System.out.println("Preço: " + this.produtoPreço);
        System.out.println("Tipo do Brinquedo: " + this.tipoBrinquedo);
        System.out.println("------------------------------");
     }
  
  
}
