package edu.natalia.navarro.reto10;

import edu.natalia.navarro.reto10.clases.Employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * La clase Main se utiliza para probar la funcionalidad de la jerarquía de clases Employee, Programmer, Interviewer,
 * y las clases que las extienden.
 */
public class Main {

    /**
     * El método main se utiliza para crear las instancias de los objetos necesarios y probar su funcionalidad.
     *
     * @param args Argumentos de línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        // Creamos una lista de 10 JrEngineers con nombres y edades variadas
        List<JrEngineer> jrEngineers = new ArrayList<>();
        jrEngineers.add(new JrEngineer("Juan", 23, "ABC123"));
        jrEngineers.add(new JrEngineer("Ana", 25, "DEF456"));
        jrEngineers.add(new JrEngineer("Pedro", 21, "GHI789"));
        jrEngineers.add(new JrEngineer("Laura", 22, "JKL012"));
        jrEngineers.add(new JrEngineer("Carlos", 20, "MNO345"));
        jrEngineers.add(new JrEngineer("Marta", 24, "PQR678"));
        jrEngineers.add(new JrEngineer("Diego", 23, "STU901"));
        jrEngineers.add(new JrEngineer("Lucia", 21, "VWX234"));
        jrEngineers.add(new JrEngineer("Federico", 26, "YZA567"));
        jrEngineers.add(new JrEngineer("Sofia", 22, "BCD890"));

        // Guardamos la lista en un archivo de texto
        guardarListaEnArchivo(jrEngineers, "jr_engineers.txt");

        // Leemos el archivo de texto con los empleados y los almacenamos en un ArrayList
        List<JrEngineer> jrEngineersLeidos = leerListaDesdeArchivo("jr_engineers.txt");

        // Imprimimos únicamente aquellos empleados cuya edad sea mayor a 20
        imprimirEmpleadosMayoresDeEdad(jrEngineersLeidos, 20);
    }

    /**
     * El método trabajar se utiliza para indicarle a un empleado que trabaje.
     *
     * @param employee El empleado que debe trabajar.
     */
    static void trabajar(Employee employee) {
        // Este método no hace nada, simplemente se utiliza para demostrar el uso del polimorfismo.
    }

    /**
     * El método programar se utiliza para indicarle a un programador que programe.
     *
     * @param programmer El programador que debe programar.
     */
    static void programar(Programmer programmer) {
        // Este método no hace nada, simplemente se utiliza para demostrar el uso del polimorfismo.
    }

    /**
     * El método interview se utiliza para indicarle a un entrevistador que realice una entrevista.
     *
     * @param interviewer El entrevistador que debe realizar la entrevista.
     */
    static void interview(Interviewer interviewer) {
        // Este método no hace nada, simplemente se utiliza para demostrar el uso del polimorfismo.
    }

    /**
     * Este método se utiliza para guardar una lista de JrEngineers en
     * termina el codigo
     * /**
     * un archivo de texto.
     *
     * @param jrEngineers La lista de JrEngineers a guardar.
     * @param fileName    El nombre del archivo en el que se guardarán los JrEngineers.
     */
    static void guardarListaEnArchivo(List<JrEngineer> jrEngineers, String fileName) {
        try (PrintWriter writer = new PrintWriter(new File(fileName))) {
            for (JrEngineer jrEngineer : jrEngineers) {
                writer.println(jrEngineer.getNombre() + "," + jrEngineer.getEdad() + "," + jrEngineer.getEdad());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo guardar la lista en el archivo " + fileName);
        }
    }

    /**
     * Este método se utiliza para leer una lista de JrEngineers desde un archivo de texto.
     *
     * @param fileName El nombre del archivo del que se leerán los JrEngineers.
     * @return Una lista de JrEngineers leída desde el archivo de texto.
     */
    static List<JrEngineer> leerListaDesdeArchivo(String fileName) {
        List<JrEngineer> jrEngineers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String nombre = parts[0];
                    int edad = Integer.parseInt(parts[1]);
                    String codigo = parts[2];
                    JrEngineer jrEngineer = new JrEngineer(nombre, edad, codigo);
                    jrEngineers.add(jrEngineer);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo leer la lista desde el archivo " + fileName);
        }
        return jrEngineers;
    }

    /**
     * Este método se utiliza para imprimir los datos de los empleados cuya edad es mayor a una edad dada.
     *
     * @param empleados La lista de empleados a imprimir.
     * @param edadMin   La edad mínima de los empleados a imprimir.
     */
    static void imprimirEmpleadosMayoresDeEdad(List<JrEngineer> empleados, int edadMin) {
        for (JrEngineer empleado : empleados) {
            if (empleado.getEdad() > edadMin) {
                System.out.println(empleado.toString());
            }
        }
    }
}