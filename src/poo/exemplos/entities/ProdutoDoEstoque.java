package poo.exemplos.entities;

public class ProdutoDoEstoque {

    public String nome;
    public double preço;
    public int quantidade;

    public double valorTotalEmEstoque(){
        return preço * quantidade;
    }

    public void adicionarProdutos(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return nome
                + " , $ " +
                String.format("%.2f", preço) + " , " +
                quantidade + " unidades, Total: $ " +
                String.format("%.2f", valorTotalEmEstoque());
    }

}
