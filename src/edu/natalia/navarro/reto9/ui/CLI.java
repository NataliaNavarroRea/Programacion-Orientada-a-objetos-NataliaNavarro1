package edu.natalia.navarro.reto9.ui;
import edu.natalia.navarro.reto9.process.Pelota;
import java.util.Scanner;

/**
 * Esta clase representa la interfaz de línea de comandos para interactuar con una pelota.
 */

public class CLI {

    /**
     * Este es el punto de entrada de la aplicación.
     */
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario información sobre la pelota
        System.out.println("Ingrese el color de la pelota:");
        String color = scanner.nextLine();
        System.out.println("Ingrese la rapidez inicial de la pelota:");
        int rapidez = scanner.nextInt();
        System.out.println("Ingrese el poder inicial de la pelota:");
        int poder = scanner.nextInt();

        // Crear una pelota con la información del usuario
        Pelota pelota = new Pelota(color, rapidez, poder);

        // Mostrar información sobre la pelota creada
        System.out.println("Pelota creada con los siguientes valores:");
        System.out.println("Color: " + pelota.getColor());
        System.out.println("Rapidez: " + pelota.getRapidez());
        System.out.println("Poder: " + pelota.getPoder());

        // Preguntar si el usuario desea disminuir la rapidez de la pelota
        System.out.println("¿Desea disminuir la rapidez de la pelota? (y/n)");
        String respuesta = scanner.next();
        if (respuesta.equalsIgnoreCase("y")) {
            pelota.disminuirRapidez();
            System.out.println("La rapidez ha disminuido a: " + pelota.getRapidez());
        }

        // Preguntar si el usuario desea aumentar el poder de la pelota
        System.out.println("¿Desea aumentar el poder de la pelota? (y/n)");
        respuesta = scanner.next();
        if (respuesta.equalsIgnoreCase("y")) {
            pelota.aumentarPoder();
            System.out.println("El poder ha aumentado a: " + pelota.getPoder());
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
