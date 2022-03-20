package poo.exemplos.entities;

public class ProdutoDoEstoque {

    String nome;
    private double preço;
    private int quantidade;

    public ProdutoDoEstoque(String nome, double preço, int quantidade){
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    public ProdutoDoEstoque(String nome, double preço){
        this.nome = nome;
        this.preço = preço;
    }

    //pq sobrecarga é necessario

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPreço(double preço){
        this.preço = preço;
    }

    public double getPreço(){
        return preço;
    }

    public int getQuantidade(){
        return quantidade;
    }

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
