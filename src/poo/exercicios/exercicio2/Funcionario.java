package poo.exercicios.exercicio2;

public class Funcionario {
    String nome;
    double salarioBruto;
    double taxa;

    public double salarioSemTaxa(){
        return salarioBruto - taxa;
    }

    public void retornarSalarioAumentado(double porcentagem){
        salarioBruto += salarioBruto * porcentagem / 100.00;
    }

}
