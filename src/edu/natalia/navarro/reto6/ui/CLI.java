package edu.natalia.navarro.reto6.ui;
import edu.natalia.navarro.reto6.Process.AdivinaLaPalabra;

import java.util.Scanner;
/**
 *  Clase que representa la interfaz de usuario del juego de adivinar palabras
 */
public class CLI {
    /**
     * Método principal que se encarga de la ejecución del juego
     * @param args Argumentos de la línea de comandos (no se utilizan en este caso)
     */
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Bienvenido a Adivina la Palabra");
            System.out.println("Selecciona el nivel a jugar");
            System.out.println("1. Sencillo");
            System.out.println("2. Intermedio");
            System.out.println("3. Difícil");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();

            AdivinaLaPalabra juego = new AdivinaLaPalabra(opcion);

            if (opcion != 0) {
                System.out.println("¡Comencemos a jugar!");
                juego.jugar();
                break;
            }

        } while (opcion != 0);

        System.out.println("¡Gracias por jugar!");
        scanner.close();
    }
}

