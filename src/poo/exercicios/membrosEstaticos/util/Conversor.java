package poo.exercicios.membrosEstaticos.util;

public class Conversor {
    public static double precoDolar;

    public static double dolaresAdquiridos;

    public static double dolaresJurosValor;

    public static double dolaresJuros(){
        dolaresJurosValor = dolaresAdquiridos * 0.06;
        return dolaresJurosValor;
    }

    public static double calculo(){
        return dolaresJuros()  * precoDolar;
    }
}