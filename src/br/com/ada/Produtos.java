package br.com.ada;

public class Produtos {
    
    String produtoNome;
    int produtoPreço;
    int produtoId;
    private int caixaLivraria = 1000;
    
   

    public void visualizarCaixa() {
        System.out.println("---------------------------");
        System.out.println("O caixa contém " + this.caixaLivraria + " R$");
        System.out.println("---------------------------");
    }

    

}
