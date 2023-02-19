package edu.natalia.navarro.reto3.ui;

import edu.natalia.navarro.reto3.process.Conversor;

import java.util.Scanner;

public class CLI {

    public static void showmenu() {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menú");
            System.out.println("1. Convertir de decimal a binario");
            System.out.println("2. Convertir de decimal a octal");
            System.out.println("3. Convertir de decimal a hexadecimal");
            System.out.println("4. Convertir de binario a decimal");
            System.out.println("5. Convertir de octal a decimal");
            System.out.println("6. Convertir de hexadecimal a decimal");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número decimal: ");
                    int decimal = sc.nextInt();
                    System.out.println("El número decimal " + decimal + " en binario es: " + Conversor.decimalABinario(decimal));
                    break;
                case 2:
                    System.out.print("Ingrese un número decimal: ");
                    decimal = sc.nextInt();
                    System.out.println("El número decimal " + decimal + " en octal es: " + Conversor.decimalAOctal(decimal));
                case 3:
                    System.out.print("Ingrese un número decimal: ");
                    decimal = sc.nextInt();
                    System.out.println("El número decimal " + decimal + " en hexadecimal es: " + Conversor.decimalAHexadecimal(decimal));
                    break;
                case 4:
                    System.out.print("Ingrese un número binario: ");
                    String binario = sc.next();
                    System.out.println("El número binario " + binario + " en decimal es: " + Conversor.binarioADecimal(binario));
                    break;
                case 5:
                    System.out.print("Ingrese un número octal: ");
                    String octal = sc.next();
                    System.out.println("El número octal " + octal + " en decimal es: " + Conversor.octalADecimal(octal));
                    break;
                case 6:
                    System.out.print("Ingrese un número hexadecimal: ");
                    String hexadecimal = sc.next();
                    System.out.println("El número hexadecimal " + hexadecimal + " en decimal es: " + Conversor.hexadecimalADecimal(hexadecimal));
                    break;
                case 7:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
        System.out.println("¡Hasta pronto!");
        sc.close();
    }
}

