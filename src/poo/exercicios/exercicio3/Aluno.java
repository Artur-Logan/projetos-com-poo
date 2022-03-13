package poo.exercicios.exercicio3;

public class Aluno {

    String nome;
    double nota1;
    double nota2;
    double nota3;
    double resultado;

    public double calculoDasNotas() {
        return resultado = nota1 + nota2 + nota3;
    }

    public void exibirResultado() {

        if(nota1 > 30.00){
            System.out.println("NOTA INVALIDA PARA PRIMEIRO BIMESTRE!!!");
            return;
        }

        if(nota2 > 35.00){
            System.out.println("NOTA INVALIDA PARA SEGUNDO BIMESTRE!!!");
            return;
        }

        if(nota3 > 35.00){
            System.out.println("NOTA INVALIDA PARA TERCEIRO BIMESTRE!!!");
            return;
        }

        double pontosNecessarios = 0.0;
        double resultadoCalculo = calculoDasNotas();

        if(resultadoCalculo >= 60.00 ){
            System.out.println("FINAL GRADE = " + resultadoCalculo);
            System.out.println("PASS");
        }

        if(resultadoCalculo < 60.00){
            pontosNecessarios = 60.00 - resultadoCalculo;
            System.out.println("FINAL GRADE = " + resultadoCalculo);
            System.out.println("FAILED");
            System.out.println("MISSING " + pontosNecessarios);
        }
    }
}
