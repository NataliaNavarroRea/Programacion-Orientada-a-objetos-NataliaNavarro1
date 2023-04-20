package edu.natalia.navarro.reto10;
/**
 * La clase para un junior, es un empleado (trabajar), sabe programar
 */
public class JrEngineer extends Employee implements Programmer{
    @Override
    public void programar() {
        System.out.println("JrEngineer: Programa como puede");
    }
    @Override
    public void trabajar() {
        System.out.println("JrEngineer: Trabaja nervioso");
    }
}