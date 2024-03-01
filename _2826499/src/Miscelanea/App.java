package Miscelanea;


import java.util.Scanner;
public class App {
    public static void main(String [] args){

        Scanner scr = new Scanner(System.in);
        double numero1 = 0;
        double numero2 = 0;
        double numero3 = 0;

        Data data = new Data();

        System.out.println("Miscelanea");
        System.out.println("------------------");
        System.out.println("Menú Principal");
        System.out.println("1. Operadores");
        System.out.println("2. Condicionales");
        System.out.println("3. Ciclos");
        System.out.println("4. Arreglos");
        System.out.println("99. Salir");

        //submenu Operadores
        System.out.println("Categoría Operadores");
        System.out.println("1. calcular área triángulo");
        System.out.println("2. Sumar dos números");

        System.out.println("------------------");
        System.out.println("1. Calcular el área de un triángulo");
        System.out.println("Ingrese la base:");
        numero1 =  scr.nextDouble();
        System.out.println("Ingrese la altura:");
        numero2 = scr.nextDouble();
        System.out.println("El área del triangulo es: " + data.areaTriangulo(numero1, numero2));

        //submenu Condicionales

    }
}
