package edu.natalia.navarro.reto10;

/**
 * La clase de los seniors hereda a los juniors, ya que lo que un junior sabe, también lo sabe un senior.
 * Implementa la interfaz de Interviewr ya que el senior también se encarga de entrevistar
 */

public class SrEngineer extends JrEngineer implements Interviewer {
    @Override
    public void programar() {
        System.out.println("Programa como le gusta");
    }
    @Override
    public void interview() {
        System.out.println("Es el encargado de preguntar las cosas técnicas");
    }
    @Override
    public void trabajar() {
        System.out.println("Trabaja con tremenda seguridad");
    }
}