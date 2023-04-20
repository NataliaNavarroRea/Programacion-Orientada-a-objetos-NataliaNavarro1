package edu.natalia.navarro.reto10;

/**
 * Es la clase manager, que implementa la entrevista y hereda al empleado.
 */

public class Manager extends Employee implements Interviewer {
    @Override
    void trabajar() {
    }
    @Override
    public void interview() {
        System.out.println(" Manager: Encargado de preguntar sobre la experiencia laboral");
    }
}