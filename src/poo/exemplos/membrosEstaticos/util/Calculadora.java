package poo.exemplos.membrosEstaticos.util;

public class Calculadora {

    public static final double PI = 3.14159;

    public static double circunference(double raio){
        return 2 * PI * raio;
    }

    public static double volume(double raio){
        return 4.0 * PI * raio * raio * raio /3;
    }

}
