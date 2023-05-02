package edu.natalia.navarro.reto10;

import edu.natalia.navarro.reto10.clases.Empleado;

/** Esta es la clase de recursos humanos, que es entrevistar, hacer uso de la interfaz
 *
 */

public class RH extends Empleado implements Entrevistador{

    /**
     El correo electrónico del empleado de RH.
     */
    public String correo;
    /**
     Constructor de la clase RH que recibe el nombre y edad del empleado.

     */
    public RH (String nombre, int edad, String RFC) {
        super(nombre, edad, RFC);
    }
    /**
     Constructor por defecto de la clase RH.
     */
    public RH() {
    }
    /**
     Implementación del método entrevistar de la interfaz Entrevistador.
     */
    @Override
    public void entrevistar(){
        System.out.println("preguntar el background");
    }
    /**
     Implementación del método cobrarSueldo de la clase Empleado.
     */
    @Override
    public void cobrarSueldo() {
        System.out.println("RH cobra sueldo bajo");
    }
}