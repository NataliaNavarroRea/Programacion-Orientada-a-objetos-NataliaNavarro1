package edu.natalia.navarro.reto10;

import edu.natalia.navarro.reto10.clases.Employee;

/** Esta es la clase de recursos humanos, que es entrevistar, hacer uso de la interfaz
 *
 */

public abstract class HR extends Employee implements Interviewer {

    void trabajar() {
        System.out.println("Recursos humanos: Trabaja intentando no ser lo peor de la empresa");
        System.out.println("Recursos humanos: Trabaja intentando no ser lo peor de la empresa");
    }

    @Override
    public void interview() {
        System.out.println("Recursos humanos: El encargado de preguntarte sobre ti y sobre la empresa");
    }

}