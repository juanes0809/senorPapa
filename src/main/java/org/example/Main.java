package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ENTRADAS
        Scanner leerDato= new Scanner(System.in);
        String nombreCliente;
        String cedulaCliente;
        String correoCliente;
        String tipoCombo;
        int precioCombo1;
        int precioCombo2;
        int cantidadCombo;
        int valorDescuento;
        double valorIVA;


        System.out.println("¿Cual es el nombre del ciente?: ");
        nombreCliente= leerDato.nextLine();

        System.out.println("¿Cual es la cedula del cliente?: ");
        cedulaCliente= leerDato.nextLine();

        System.out.println("¿Cual es el correo del cliente?: ");
        correoCliente= leerDato.nextLine();

        System.out.println("¿Que tipo de combo deseas?: ");
        tipoCombo= leerDato.nextLine();

        


    }
}