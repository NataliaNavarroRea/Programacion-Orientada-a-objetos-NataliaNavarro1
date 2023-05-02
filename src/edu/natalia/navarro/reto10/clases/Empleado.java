package edu.natalia.navarro.reto10.clases;
/**
 * Es una clase abstracta que se encarga de hacer trabajar a los empleados
 */

import java.io.Serializable;
import java.util.Objects;

public abstract class Empleado implements Comparable<Empleado>, Serializable {

    /** RFC del empleado.*/
    public static String RFC = null;

    /** Edad del empleado. */
    public int edad;

    /** Sueldo del empleado. */
    public int sueldo;

    /** Registro del empleado. */
    public int registro;

    /** Teléfono del empleado. */
    public int telefono;

    /** Nombre del empleado. */
    public String nombre;

    /**
     * Crea un nuevo objeto Empleado con el nombre y la edad especificados.
     */
    public Empleado(String nombre, int edad, String RFC) {
        this.nombre = nombre;
        this.edad = edad;
        this.RFC = RFC;
    }

    /**
     * Crea un nuevo objeto Empleado sin especificar el nombre ni la edad.
     */
    public Empleado() {
    }

    /**
     * Devuelve una cadena de caracteres que representa al empleado, incluyendo su edad, sueldo,
     * registro, teléfono y nombre.
     * @return Una cadena de caracteres que representa al empleado.
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "edad=" + edad +
                ", RFC=" +  RFC +
                ", nombre='" + nombre + '\'' +
                '}';
    }
    /**
     Método que muestra un mensaje indicando que el empleado está trabajando
     */
    public void trabajar(){
        System.out.println("Empleado trabaja");
    }
    /**
     Método abstracto para calcular y cobrar el sueldo del empleado
     */
    abstract public void cobrarSueldo();
    /**
     Método que compara dos empleados basándose en su nombre

     */
    @Override
    public int compareTo(Empleado otro){
        int value = (Integer.valueOf(this.edad)).compareTo(Integer.valueOf(otro.edad));
        if(value == 0){
            return this.nombre.compareTo(otro.nombre);
        }
        return value;
    }
    /**
     Método que verifica si dos objetos son iguales

     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return edad == empleado.edad && sueldo == empleado.sueldo && registro == empleado.registro && telefono == empleado.telefono && Objects.equals(nombre, empleado.nombre);
    }
    /**
     Método que calcula el código hash del objeto
     */
    @Override
    public int hashCode() {
        return Objects.hash(edad, sueldo, registro, telefono, nombre);
    }
    /**
     Método que devuelve la edad del empleado
     */
    public int getEdad() {
        return edad;
    }
    /**
     Método que establece la edad del empleado
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     Método que devuelve el sueldo del empleado
     */
    public int getSueldo() {
        return sueldo;
    }
    /**
     Establece el sueldo del trabajador.

     */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    /**
     Obtiene el número de registro del trabajador.

     */
    public int getRegistro() {
        return registro;
    }
    /**
     Establece el número de registro del trabajador.

     */
    public void setRegistro(int registro) {
        this.registro = registro;
    }
    /**
     Obtiene el número de teléfono del trabajador.
     */
    public int getTelefono() {
        return telefono;
    }
    /**
     Establece el número de teléfono del trabajador.

     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    /**
     Obtiene el nombre del trabajador.

     */
    public String getNombre() {
        return nombre;
    }
    /**
     Establece el nombre del trabajador.

     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}