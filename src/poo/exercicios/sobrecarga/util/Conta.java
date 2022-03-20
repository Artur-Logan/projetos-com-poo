package poo.exercicios.sobrecarga.util;

import java.util.Scanner;

public class Conta {

    private Scanner sc = new Scanner(System.in);

    private String nome;
    private int numeroConta;
    private double depositoInicial;
    private double saldo = 0.0;

    public Conta(String nome, int numeroConta){
        this.nome = nome;
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getDepositoInicial() {
        return depositoInicial;
    }

    public void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    private void acrescimoDeposito(double deposito){
        this.saldo += deposito;
    }

    private void decrescimoDeposito(double saque) {
        this.saldo = this.saldo - saque - 5.00;
    }

    private void exibirDadosConta() {
        System.out.println("Dados da conta: ");
        System.out.printf("Conta " + this.numeroConta + ", Nome " + this.nome + ", Saldo na Conta " + String.valueOf( this.saldo ));
        System.out.println();
    }

    public void depositar(boolean depositoInicial){
        String msg;

        if( depositoInicial ) {
            msg = "Entre com o valor do deposito inicial: ";
        } else {
            msg = "Entre com o valor do deposito: ";
        }

        System.out.println(msg);

        double deposito = sc.nextDouble();

        this.acrescimoDeposito(deposito);

        this.exibirDadosConta();
    }

    public void sacar() {
        System.out.println("Entre com o valor de saque: ");

        double saque = sc.nextDouble();

        this.decrescimoDeposito(saque);

        this.exibirDadosConta();
    }
}
