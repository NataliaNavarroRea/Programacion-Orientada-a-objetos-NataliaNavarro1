package edu.natalia.navarro.reto10;

import edu.natalia.navarro.reto10.clases.Employee;

/**
 * Es la clase manager, que implementa la entrevista y hereda al empleado.
 */

public abstract class Manager extends Employee implements Interviewer {

    void trabajar() {
    }
    @Override
    public void interview() {
        System.out.println(" Manager: Encargado de preguntar sobre la experiencia laboral");
    }
}