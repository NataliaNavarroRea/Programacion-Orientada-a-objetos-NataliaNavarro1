package edu.natalia.navarro.reto5.ui;
import edu.natalia.navarro.reto5.Process.AdivinaLaPalabra;

import java.util.Scanner;

/**
 *  Clase que representa la interfaz de usuario del juego de adivinar palabras
 */
public class CLI {
    /**
     * Método principal que se encarga de la ejecución del juego
     * @param args Argumentos de la línea de comandos (no se utilizan en este caso)
     */

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        int option = 0;

        do {
            System.out.println("Bienvenido a adivina la palabra");
            System.out.println("Selecciona el nivel que quieras iniciar  ");
            System.out.println("1. = Sencillo (4 letras)");
            System.out.println("2. = Intermedio (8 letras)");
            System.out.println("3. = Complicado (12 letras)");
            System.out.println("0. = Salir del juego");
            option = scanner.nextInt();

            if (option != 0) {
                AdivinaLaPalabra game = new AdivinaLaPalabra(option);
                game.play();
                break;

            }
        } while (option != 0);
        System.out.println("¡Excelente racha !");
    }
}
