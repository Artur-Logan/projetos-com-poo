package poo.exemplos.aplicacao;

import poo.exemplos.entities.ProdutoDoEstoque;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaEstoque {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ProdutoDoEstoque produtoDoEstoque = new ProdutoDoEstoque();

        System.out.println("Entre com os dados do produto: ");
        System.out.print("Nome: ");
        produtoDoEstoque.nome = sc.nextLine();
        System.out.print("Preço: ");
        produtoDoEstoque.preço = sc.nextDouble();
        System.out.print("Quantidade: ");
        produtoDoEstoque.quantidade = sc.nextInt();

        produtoDoEstoque.toString();

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
