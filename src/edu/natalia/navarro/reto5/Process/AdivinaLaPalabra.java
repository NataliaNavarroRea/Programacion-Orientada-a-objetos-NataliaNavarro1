package edu.natalia.navarro.reto5.Process;

import java.util.Random;
import java.util.Scanner;
/**
 * Presenta un proceso de adivinar las palabras, contiene la lógica y los datos del juego
 * Representa un juego para adivinar una palabra.
 */

public class AdivinaLaPalabra {
    private String[] NivelSencillo = {"coca", "cafe", "casa", "gato", "jugo", "arpa", "zapo", "azul","amor","bici","cena"};
    private String[] NivelIntermedio = {"elefante","radiante","mamifero","amarillo","langosta", "telefono","calentar"};
    private String[] NivelComplicado = {"enciclopedia", "organizacion","arquitectura","tranquilidad","espectacular", "enfermedades"};

    private String[] PalabrasDisponibles;
    private String PalabraDisponible;
    private char[] LetrasAdivinadas;

/**
 * Constructor de la clase JuegoAdivinaPalabra
 * @param level Nivel del juego (1 para fácil, 2 para intermedio, 3 para avanzado)
 */
public AdivinaLaPalabra (int level) {
    switch (level) {
        case 1:
            PalabrasDisponibles = NivelSencillo;
            break;
        case 2:
            PalabrasDisponibles = NivelIntermedio;
            break;
        case 3:
            PalabrasDisponibles = NivelComplicado;
            break;
        default:
            System.out.println("Opción invalida");
            break;
    }
}
/**
 * En este metodo es la inicializacion del juego
 */

public void play() {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    boolean playing = true;

    while (playing) {
        int wordIndex = random.nextInt(PalabrasDisponibles.length);
        PalabraDisponible = PalabrasDisponibles [wordIndex];
        LetrasAdivinadas = new char[PalabraDisponible.length()];
        for (int i = 0; i < LetrasAdivinadas.length; i++) {
            LetrasAdivinadas[i] = 'X';
        }
        boolean guessed = false;
        int tries = 0;
        while (!guessed) {
            System.out.println("La palabra que se adivina es: ");
            System.out.println(LetrasAdivinadas);
            System.out.println("Introduce una letra: ");
            String input = scanner.next();
            char letter = input.charAt(0);
            if (letter == '0') {
                playing = false;
                break;
            }
            if (!Character.isLetter(letter)) {
                System.out.println("Introduce el carácter válido");
                continue;
            }
            boolean found = false;
            for (int i = 0; i < PalabraDisponible.length(); i++) {
                if (Character.toLowerCase(letter) == Character.toLowerCase(PalabraDisponible.charAt(i))) {
                    found = true;
                    LetrasAdivinadas[i] = letter;
                }
            }
            if (!found) {
                tries++;
                System.out.println("¡Comienza de nuevo!");
            }
        }
    }
}
}
