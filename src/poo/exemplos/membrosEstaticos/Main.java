package poo.exemplos.membrosEstaticos;

import poo.exemplos.membrosEstaticos.util.Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");

        double raio = sc.nextDouble();
        double c = Calculadora.circunference(raio);
        double v = Calculadora.volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);

        System.out.printf("Volume: %.2f%n", v);

        System.out.printf("Pi valor: %.2f%n", Calculadora.PI);

        sc.close();
    }


}