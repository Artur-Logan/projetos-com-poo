package poo.exercicios.exercicio1;

public class Retangulo {
    double a;
    double b;

    public double areaDoRetangulo(){
    return a * b ;
    }

    public double perimetroDoRetangulo(){
        return a + b + a + b;
    }

    public double diagonalDoRetangulo(){
        double d = 0;
        d = (a * a) + (b * b);
        return Math.sqrt(d);
    }

}
