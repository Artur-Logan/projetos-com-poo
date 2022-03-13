package poo.exercicios.exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Insira o nome : ");
        aluno.nome = sc.nextLine();
        System.out.println("Insira a nota do primeiro bimestre: ");
        aluno.nota1 = sc.nextDouble();
        System.out.println("Insira a nota do segundo bimestre: ");
        aluno.nota2 = sc.nextDouble();
        System.out.println("Insira a nota do terceiro bimestre: ");
        aluno.nota3 = sc.nextDouble();

        aluno.exibirResultado();

        sc.close();
    }
}
