package edu.natalia.navarro.reto9.segundo.process;

import java.util.Random;

/**
 * La clase Helper representa a un ayudante con características aleatorias.
 * Las características incluyen número de ojos, color de piel, altura, nivel de creación, nivel de reparación y nivel destructivo.
 */
public class Helper {
    private int numOjos;
    private String colorPiel;
    private String altura;
    private int nivelCreacion;
    private int nivelReparacion;
    private int nivelDestructivo;

    /**
     * Crea una instancia de Helper con características aleatorias.
     * Las características incluyen:
     * - Número de ojos: 1 o 2
     * - Color de piel: amarilla o morada
     * - Altura: alto o mediano
     * - Nivel de creación: un número aleatorio entre 1 y 5
     * - Nivel de reparación: un número aleatorio entre 1 y 5
     * - Nivel destructivo: un número aleatorio entre 1 y 5
     */
    public Helper() {
        Random random = new Random();
        this.numOjos = random.nextInt(2) + 1;
        this.colorPiel = (random.nextBoolean()) ? "amarilla" : "morada";
        this.altura = (random.nextBoolean()) ? "alto" : "mediano";
        this.nivelCreacion = random.nextInt(5) + 1;
        this.nivelReparacion = random.nextInt(5) + 1;
        this.nivelDestructivo = random.nextInt(5) + 1;
    }

    // Getters y setters

    /**
     * Obtiene el número de ojos del ayudante.
     *
     * @return el número de ojos del ayudante.
     */
    public int getNumOjos() {
        return numOjos;
    }

    /**
     * Establece el número de ojos del ayudante.
     *
     * @param numOjos el nuevo número de ojos del ayudante.
     */
    public void setNumOjos(int numOjos) {
        this.numOjos = numOjos;
    }

    /**
     * Obtiene el color de piel del ayudante.
     *
     * @return el color de piel del ayudante.
     */
    public String getColorPiel() {
        return colorPiel;
    }

    /**
     * Establece el color de piel del ayudante.
     *
     * @param colorPiel el nuevo color de piel del ayudante.
     */
    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    /**
     * Obtiene la altura del ayudante.
     *
     * @return la altura del ayudante.
     */
    public String getAltura() {
        return altura;
    }

    /**
     * Establece la altura del ayudante.
     *
     * @param altura la nueva altura del ayudante.
     */
    public void setAltura(String altura) {
        this.altura = altura;
    }

    /**
     * Obtiene el nivel de creación del ayudante.
     *
     * @return el nivel de creación del ayudante.
     */
    public int getNivelCreacion() {
        return nivelCreacion;
    }

    /**
     * Establece el nivel de creación del ayudante.
     *
     * @param nivelCreacion el nuevo nivel de creación del ayudante.
     */
    public void setNivelCreacion(int nivelCreacion) {
        this.nivelCreacion = nivelCreacion;
    }

    /**
     * Obtiene el nivel de reparación del ayudante.
     *
     * @return el nivel de reparación del ayudante.
     */
    public int getNivelReparacion() {
        return nivelReparacion;
    }

    /**
     * Establece el nivel de reparación del ayudante.
     *
     * @param nivelReparacion el nuevo nivel de reparación del ayudante.
     */
    public void setNivelReparacion(int nivelReparacion) {
        this.nivelReparacion = nivelReparacion;
    }

    /**
     * Obtiene el nivel destructivo del ayudante.
     *
     * @return el nivel destructivo del ayudante.
     */
    public int getNivelDestructivo() {
        return nivelDestructivo;
    }

    /**
     * Establece el nivel destructivo del ayudante.
     *
     * @param nivelDestructivo el nuevo nivel destructivo del ayudante.
     */
    public void setNivelDestructivo(int nivelDestructivo) {
        this.nivelDestructivo = nivelDestructivo;
    }

    /**
     * Retorna una cadena de caracteres que representa al ayudante.
     *
     * @return una cadena de caracteres que representa al ayudante.
     */
    @Override
    public String toString() {
        return "Número de ojos: " + numOjos +
                ", Color de piel: " + colorPiel +
                ", Altura: " + altura +
                ", Nivel de creación: " + nivelCreacion +
                ", Nivel de reparación: " + nivelReparacion +
                ", Nivel destructivo: " + nivelDestructivo;
    }
}

