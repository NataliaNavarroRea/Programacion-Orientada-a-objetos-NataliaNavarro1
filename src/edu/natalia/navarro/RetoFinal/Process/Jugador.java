package edu.natalia.navarro.RetoFinal.Process;

public class Jugador {
    private int nivelVida;
    private int hadasRescatadas;

    public Jugador() {
        nivelVida = 100;
        hadasRescatadas = 2;
    }

    public int getNivelVida() {
        return nivelVida;
    }

    public void construirCasa(Villavirtual villa) {
        villa.aumentarCasas();
    }

    public void rescatarHada(Villavirtual villa) {
        villa.disminuirHadas();
        hadasRescatadas++;
    }

    public void verificarNivelVida() {
        if (hadasRescatadas % 10 == 2) {
            nivelVida += 10;
        } else {
            nivelVida--;
        }
    }

    public boolean haPerdidoVida() {
        return nivelVida <= 2;
    }
}

