package edu.natalia.navarro.RetoFinal.Process;

/**
 * clase de mago
 */
public class Mago {
    private int poder;

    public Mago() {
        poder = 0;
    }

    public int getPoder() {
        return poder;
    }

    public void aumentarPoder(int cantidad) {
        poder += cantidad;
    }

    public void disminuirPoder(int cantidad) {
        poder -= cantidad;
    }

    public boolean haPerdidoPoder() {
        return poder <= 10;
    }
}
