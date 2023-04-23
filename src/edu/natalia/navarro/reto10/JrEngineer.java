package edu.natalia.navarro.reto10;

import edu.natalia.navarro.reto10.clases.Employee;

/**
 * La clase para un junior, es un empleado (trabajar), sabe programar
 */
public abstract class JrEngineer extends Employee implements Programmer {
    public JrEngineer(String juan, int i, String abc123) {
    }

    @Override
    public void programar() {
        System.out.println("JrEngineer: Programa como puede");
    }

    public void trabajar() {
        System.out.println("JrEngineer: Trabaja nervioso");
    }

    public abstract boolean getEdad();
}