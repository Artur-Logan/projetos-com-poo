package poo.exercicios.sobrecarga;

import poo.exercicios.sobrecarga.util.Conta;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o numero da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Entre com o seu nome: ");
        String nome = sc.next();

        System.out.println("Deseja fazer um deposito inicial? (1 = sim /2 = nao)");
        int resposta = sc.nextInt();

        Conta conta = new Conta(nome, numeroConta);

        if (resposta == 1){
            conta.depositar(true);
        }

        conta.depositar(false);

        conta.sacar();

        sc.close();
    }
}
