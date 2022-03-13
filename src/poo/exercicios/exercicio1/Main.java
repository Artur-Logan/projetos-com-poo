package poo.exercicios.exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura e a altura: ");

        Retangulo retangulo = new Retangulo();
        retangulo.a = sc.nextDouble();
        retangulo.b = sc.nextDouble();

        System.out.printf("Area: %.2f%n",  retangulo.areaDoRetangulo());
        System.out.printf("Perimetro: %.2f%n", retangulo.perimetroDoRetangulo());
        System.out.printf("Diagonal: %.2f%n", retangulo.diagonalDoRetangulo());

        sc.close();
    }
}
