package poo.exercicios.membrosEstaticos;

import poo.exercicios.membrosEstaticos.util.Conversor;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o valor do dolar?");
        Conversor.precoDolar = sc.nextDouble();
        System.out.println("Quantos dolares deseja?" );
        Conversor.dolaresAdquiridos = sc.nextDouble();
        System.out.printf("Valor a pagar em reias: %.2f%n", Conversor.calculo());


        sc.close();
    }
}
