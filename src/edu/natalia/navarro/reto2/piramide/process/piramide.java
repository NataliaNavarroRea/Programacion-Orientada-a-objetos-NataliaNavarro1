package edu.natalia.navarro.reto2.piramide.process;

import java.util.Scanner;

/**
 *Poner u numero aleatorio y va a imprimir una piramide de asteriscos y el tamaño
 *dependera en lineas del numero seleccionado.
 **/


public class piramide {

    public static Object showmenu;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño de la piramide que desea:");
        int numeroDeFilas = sc.nextInt();
        sc.close();

        System.out.println();

        for(int height = 1; height<=numeroDeFilas; height++){

            /**
             *Se denominan los espacios que se quieren tener.
             **/

            for(int whites = 1;
                whites<=numeroDeFilas-height;
                whites++){
                System.out.print(" ");
            }
            /**
             *Se denominan los asteriscos que se quieren poner.
             **/

            for(int asteriscos=1; asteriscos<=(height*2)-1; asteriscos++){

                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Que genial esta");
    }
}

