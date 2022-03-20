package poo.exemplos.aplicacao;

import poo.exemplos.entities.ProdutoDoEstoque;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaEstoque {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do produto: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preço = sc.nextDouble();

        ProdutoDoEstoque produtoDoEstoque = new ProdutoDoEstoque(nome, preço);

        produtoDoEstoque.setNome("Computer");
        System.out.println("Nome atualizado: " + produtoDoEstoque.getNome());
        produtoDoEstoque.setPreço(1200.00);
        System.out.println("Preço atualizado: " + produtoDoEstoque.getPreço());

        System.out.println();
        System.out.println("Informações do produto " + produtoDoEstoque);
        System.out.println();
        System.out.println("Entre com o numero de produtos a serem adicionadps: ");
        int quantidade = sc.nextInt();
        produtoDoEstoque.adicionarProdutos(quantidade);
        System.out.println("Informações do produto " + produtoDoEstoque);

        System.out.println();
        System.out.println("Entre com o numero de produtos a serem removidos: ");
        quantidade= sc.nextInt();
        produtoDoEstoque.removerProdutos(quantidade);

        System.out.println("Informações do produto " + produtoDoEstoque);
        System.out.println();

        sc.close();
    }
}
