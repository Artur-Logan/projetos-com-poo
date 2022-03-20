package poo.exemplos.entities;

import java.util.Date;

public class Ordem {
    private Date data;
    private ProdutoDoEstoque produtoDoEstoque;

    public Ordem (Date data, ProdutoDoEstoque produtoDoEstoque){
        this.data = data;
        this.produtoDoEstoque = produtoDoEstoque;
        this.produtoDoEstoque.nome = "Tv";
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ProdutoDoEstoque getProdutoDoEstoque() {
        return produtoDoEstoque;
    }

    public void setProdutoDoEstoque(ProdutoDoEstoque produtoDoEstoque) {
        this.produtoDoEstoque = produtoDoEstoque;
    }
}
