package edu.natalia.navarro.reto10;


    /**
     * En esta clase se encarga de los CEOs, que a su vez son managers, es la que hereda la clase
     */



    public class CEO extends Manager {

        /**
         El nombre de la corporación que dirige el CEO.
         */
        public int nombreCorporacion;
        /**
         El valor de la corporación que dirige el CEO.
         */
        public int valorCorporacion;
        /**
         El porcentaje de participación que tiene el CEO
         */
        public int porcentajeCorporacion;
        public CEO(String nombre, int edad, String RFC) {
            super(nombre, edad, RFC);
        }

        public CEO() {

        }
    }