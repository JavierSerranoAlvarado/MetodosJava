package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        String mensaje = saludar("Javier Eduardo");
        System.out.println(mensaje);
        int resultado = suma( 5 , 3);
        System.out.println(resultado);
        alerta(saludar("javier"));
         */

        /*
        System.out.println(Math.PI);
        double num1 = 13.75;
        double num2 = 23.12;
        System.out.println(Math.ceil(num1));

         */
    String mensaje1 = "Hola";
    String mensaje2 = "Adios!!";
    System.out.println(mensaje2.length()); //cantidad de caracteres en String
    System.out.println(mensaje1.compareTo(mensaje2));
    //si las cadenas son iguales devuelve un 0, si no devuelve otro numero
    System.out.println(mensaje1.equals(mensaje2));
    //equals compara dos cadenas, true o false si dos mensajes son iguales
        //equalsIgnoreCase compara dos cadenas sin importar si es mayuscula o minucula
    //toUpperCase hace el texto mayuculas
        System.out.println(mensaje1.toUpperCase());
    }

    public static String saludar(String nombre){
        return "Hola, como estas " + nombre;
    };

    public static int suma(int num1, int num2){
        return num1+num2;
    }

    public static void alerta(String mensaje){
        System.out.println(mensaje);
    }
}
