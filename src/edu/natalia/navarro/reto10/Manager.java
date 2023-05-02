package edu.natalia.navarro.reto10;

import edu.natalia.navarro.reto10.clases.Empleado;

/**
 * Es la clase manager, que implementa la entrevista y hereda al empleado.
 */


public class Manager extends Empleado implements Entrevistador {

    /**
     El nombre de la división a la que pertenece el manager.
     */
    public String nombreDivision;
    /**
     Constructor por defecto de la clase Manager.
     */
    public Manager() {
    }
    /**
     Implementación del método entrevistar de la interfaz Entrevistador.

     */
    @Override
    public void entrevistar(){
        System.out.println("Entrevistador entrevista");
    }
    /**
     Implementación del método cobrarSueldo de la clase Empleado.

     */
    @Override
    public void cobrarSueldo() {
        System.out.println("Managers cobrar sueldo alto");
    }
    /**
     Constructor de la clase Manager que recibe el nombre y edad del empleado.

     */
    public Manager(String nombre, int edad, String RFC) {
        super(nombre, edad, RFC);
    }
}