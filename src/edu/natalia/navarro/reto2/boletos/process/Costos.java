package edu.natalia.navarro.reto2.boletos.process;

public class Costos {

    /**
     * contar los boletos que se hayan adquirido con sus precios y variables.
     **/
    public static double PRECIO_CHILD = 70;
    public static double PRECIO_ADULT = 100;
    public static double PRECIO_SENIOR = 50;
    public static double PRECIO_SENIORSIN = 70;
    public static double calcularCostos(int numChild,int numAdult, int numSenior, int numSerniorsin){
        return (numChild * PRECIO_CHILD) + (numAdult * PRECIO_ADULT) + (numSenior * PRECIO_SENIOR) +
                (numSerniorsin * PRECIO_SENIORSIN);

    }
}
