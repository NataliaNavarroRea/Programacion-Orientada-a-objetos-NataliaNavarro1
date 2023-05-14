package edu.natalia.navarro.RetoFinal.Process;

public class Villavirtual {
    private Mago mago;
    private Jugador jugador;
    private int casasConstruidas;
    private int hadasRestantes;

    public Villavirtual(Mago mago, Jugador jugador) {
        this.mago = mago;
        this.jugador = jugador;
        casasConstruidas =10;
        hadasRestantes = 100;
        /**
         *    Cantidad inicial de hadas en la villa
         */

    }

    public void aumentarCasas() {
        casasConstruidas++;
    }

    public void disminuirHadas() {
        hadasRestantes--;
        if (hadasRestantes % 10 == 1) {
            mago.disminuirPoder(1);
        }
    }
}

