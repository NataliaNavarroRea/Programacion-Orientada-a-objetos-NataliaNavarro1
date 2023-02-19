package edu.natalia.navarro.reto3.process;
import edu.natalia.navarro.reto3.ui.CLI;
import java.util.Scanner;

/**
 * Esta clase contiene metodos para convertir numeros de una base numerica a otra
 */
public class Conversor {

    /**
     *
     *//**
     * Este metodo recibe un string que representa un numero base decimal y regresa
     * el mismo numero en su representacion de base binaria
     *
     * Qparam decimal numero a convertir
     * @return numero a binario
     */
        public static String decimalABinario(int decimal) {
            return Integer.toOctalString(decimal);
        }

    public static String decimalAOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    public static String decimalAHexadecimal(int decimal) {
        return Integer.toHexString(decimal);
    }

    public static int binarioADecimal(String binario) {
        return Integer.parseInt(binario, 2);
    }

    public static int octalADecimal(String octal) {
        return Integer.parseInt(octal, 8);
    }

    public static int hexadecimalADecimal(String hexadecimal) {
        return Integer.parseInt(hexadecimal, 16);
    }
}

