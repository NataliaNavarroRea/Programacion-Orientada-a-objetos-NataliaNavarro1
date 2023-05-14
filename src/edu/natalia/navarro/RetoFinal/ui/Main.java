package edu.natalia.navarro.RetoFinal.ui;

import edu.natalia.navarro.RetoFinal.Process.Jugador;
import edu.natalia.navarro.RetoFinal.Process.Mago;
import edu.natalia.navarro.RetoFinal.Process.Villavirtual;

/**
 * clase que representa el juego
 */

public class Main {
    public static void main(String[] args) {
        Mago mago = new Mago();
        Jugador jugador = new Jugador();
        Villavirtual villa = new Villavirtual(mago, jugador);

        while (!mago.haPerdidoPoder() && !jugador.haPerdidoVida()) {
            jugador.construirCasa(villa);
            jugador.rescatarHada(villa);
            jugador.verificarNivelVida();
        }

        /**
         * Verificar el resultado del juego
         */
        if (mago.haPerdidoPoder()) {
            System.out.println("¡El mago ha perdido todo su poder! Has ganado el juego.");
        } else if (jugador.haPerdidoVida()) {
            System.out.println("¡El jugador ha perdido toda su vida! Has perdido el juego.");
        }
    }
}