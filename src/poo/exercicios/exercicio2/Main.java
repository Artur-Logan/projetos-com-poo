package poo.exercicios.exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Nome: ");
        funcionario.nome = sc.nextLine();
        System.out.println("Salario Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.println("Taxa: ");
        funcionario.taxa = sc.nextDouble();

        System.out.println("Funcionario: " + funcionario.nome + " , " + funcionario.salarioSemTaxa());
        System.out.println("Qual porcentagem para incluir no salario? ");

        double porcentagem = sc.nextDouble();
        funcionario.retornarSalarioAumentado(porcentagem);

        System.out.println("Informação atualizada: " + funcionario.nome + " , " + String.format("%.2f", funcionario.salarioSemTaxa()));

        sc.close();
    }
}
