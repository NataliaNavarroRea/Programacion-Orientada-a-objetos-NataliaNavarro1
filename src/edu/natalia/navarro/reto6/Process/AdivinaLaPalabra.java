package edu.natalia.navarro.reto6.Process;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Presenta un proceso de adivinar las palabras, contiene la lógica y los datos del juego
 * Representa un juego para adivinar una palabra.
 */

public class AdivinaLaPalabra {
    private static final String[] PALABRAS_FACILES = {"casa", "mesa", "perro", "sol", "agua", "auto", "mano"};
    private static final String[] PALABRAS_INTERMEDIAS = {"computadora", "perfeccionista", "baloncesto", "jardineria", "historiador", "noticiero"};
    private static final String[] PALABRAS_DIFICILES = {"extraterrestre", "arqueologia", "serendipia", "espectrometro", "hipopotomonstrosesquipedaliofobia"};

    private String[] palabrasDisponibles;
    private String palabraSeleccionada;
    private char[] letrasAdivinadas;

    /**
     * Constructor de la clase AdivinaLaPalabra
     *
     * @param nivel Nivel del juego (1 para fácil, 2 para intermedio, 3 para avanzado)
     */
    public AdivinaLaPalabra(int nivel) throws IllegalArgumentException {
        switch (nivel) {
            case 1:
                palabrasDisponibles = PALABRAS_FACILES;
                break;
            case 2:
                palabrasDisponibles = PALABRAS_INTERMEDIAS;
                break;
            case 3:
                palabrasDisponibles = PALABRAS_DIFICILES;
                break;
            case 0:
                palabrasDisponibles = new String[]{};
                break;
            default:
                throw new IllegalArgumentException("Opción inválida");
        }
    }

    /**
     * En este método es el inicio del juego
     */
    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean jugando = true;

        while (jugando) {
            int indicePalabra = random.nextInt(palabrasDisponibles.length);
            palabraSeleccionada = palabrasDisponibles[indicePalabra];
            letrasAdivinadas = new char[palabraSeleccionada.length()];
            for (int i = 0; i < letrasAdivinadas.length; i++) {
                letrasAdivinadas[i] = '_';
            }

            boolean adivinada = false;
            int intentos = 0;
            while (!adivinada) {
                System.out.println("La palabra a adivinar es:");
                System.out.println(letrasAdivinadas);
                System.out.println("Ingresa una letra:");

                try {
                    String entrada = scanner.next();
                    if (entrada.equals("0")) {
                        jugando = false;
                        break;
                    }
                    char letra = entrada.charAt(0);
                    if (!Character.isLetter(letra)) {
                        System.out.println("Ingresa una letra válida");
                        continue;
                    }
                    boolean encontrada = false;
                    for (int i = 0; i < palabraSeleccionada.length(); i++) {
                        if (Character.toLowerCase(letra) == Character.toLowerCase(palabraSeleccionada.charAt(i))) {
                            encontrada = true;
                            letrasAdivinadas[i] = letra;
                        }
                    }
                    if (!encontrada) {
                        intentos++;
                        System.out.println("¡Intenta de nuevo!");

                    }
                    if (intentos == 6) {
                        System.out.println("Lo siento, perdiste. La palabra era: " + palabraSeleccionada);
                        break;
                    }
                    if (String.valueOf(letrasAdivinadas).equals(palabraSeleccionada)) {
                        System.out.println("¡Felicitaciones! Adivinaste la palabra: " + palabraSeleccionada);
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Ingresa una letra válida");
                    scanner.next();
                }
            }
            System.out.println("¿Quieres jugar de nuevo? (Ingresa 0 para salir)");
            try {
                int respuesta = scanner.nextInt();
                if (respuesta == 0) {
                    jugando = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresa una opción válida");
                scanner.next();
            }
        }

        scanner.close();
    }
}



