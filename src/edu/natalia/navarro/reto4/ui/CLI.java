
package edu.natalia.navarro.reto4.ui;
import edu.natalia.navarro.reto4.process.AnalisisDeVentas;
/**
 En esta clase representa una interfaz de línea de comando para análisar de ventas.
 */
public class CLI {

    /**
     Imprime el trimestre que más se vende de cada sabor en un arreglo de máximo de ventas por sabor y un arreglo de nombres de sabores.
     @param maximasVentasPorSabor arreglo de máximo de ventas por sabor
     @param sabores un arreglo de nombres de sabores
     */
    public static void imprimirMaxVentasPorSabor(int[] maximasVentasPorSabor, String[] sabores) {
        for (int i = 0; i < sabores.length; i++) {
            System.out.println("El trimestre que más vende " + sabores[i] + " es: " + obtenerTrimestre(maximasVentasPorSabor[i]) + ".");
        }
    }
    /**
     Imprime el trimestre que más vende en general en una matriz de ventas.
     @param trimestreMaxVentasTotal el índice del trimestre que más vende en general
     */
    public static void imprimirTrimestreMaxVentasTotal(int trimestreMaxVentasTotal) {
        System.out.println("El trimestre que más producto vende es: " + obtenerTrimestre(trimestreMaxVentasTotal) + ".");
    }
    /**
     Convierte el índice de un trimestre a su nombre en formato "MMM-YYY".
     @param trimestre el índice del trimestre (0 para ene-feb-mar, 1 para abr-may-jun, etc.)
     @return el nombre del trimestre en formato "MMM-YYY" (por ejemplo, "ene-feb-mar")
     */
    public static String obtenerTrimestre(int trimestre) {
        switch (trimestre) {
            case 0:
                return "ene-feb-mar";
            case 1:
                return "abr-may-jun";
            case 2:
                return "jul-agos-sep";
            case 3:
                return "oct-nov-dic";
            default:
                return "trimestre inválido";
        }
    }
    /**
     Función que llama la función principal de la clase AnalisarVentas.
     */
    public static void main() {
        AnalisisDeVentas.main();
    }
}
