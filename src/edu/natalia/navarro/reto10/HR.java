package edu.natalia.navarro.reto10;

/** Esta es la clase de recursos humanos, que es entrevistar, hacer uso de la interfaz
 *
 */

public class HR extends Employee implements Interviewer {
    @Override
    void trabajar() {
        System.out.println("Recursos humanos: Trabaja intentando no ser lo peor de la empresa");
        System.out.println("Recursos humanos: Trabaja intentando no ser lo peor de la empresa");
    }

    @Override
    public void interview() {
        System.out.println("Recursos humanos: El encargado de preguntarte sobre ti y sobre la empresa");
    }

}