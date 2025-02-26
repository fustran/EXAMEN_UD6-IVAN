package org.fustranbran.PizzaExpress;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class AppPizzaExpress {
    public static void main(String[] args) {

        //crear 2 empleados e imprimir info obtenerDetalles()
        //iniciar pedido preguntando nombre
        //responder un nombre
        //crear new Cliente con dicho nombre
        //crear new Pedido para el Cliente creado y estado = CREANDO
        //pedir() preguntar qué le apetece hoy al Cliente y mostrar cartade pizzas
        //elegir pizza – si existe en la carta, añadir al ArrayList delpedido. Si no, saltará como inválido por no estar incluida enum
        //decir precio acumulado del pedido y preguntar si se quierenañadir más pizzas al pedido (S/N)
        //N
        //modificar estado del Pedido a RECIBIDO
        //mostrar "Pedido RECIBIDO" (Estado). Total pedido: importe.Descuento a aplicar: 20%. Total a pagar: importe-descuento
        //mostrar "Pasa por caja para pagar y recoger tu pedido cuando estéLISTO. Muchas gracias nombre"
        //avanzar estado a MONTANDO_PIZZA e imprimir
        //avanzar estado a HORNEANDO e imprimir
        //intento de entregar() pedido por alguno de los empleados
        //avanzar estado a PREPARANDO_PEDIDO e imprimir
        //avanzar estado a LISTO e imprimir
        //pagar() Pedido
        //entregar() Pedido
        //recoger()


        Scanner teclado = new Scanner(System.in);


        // Array de objetos para crear 2 empleados
        Empleado[] empleados = {
                new Empleado("Ivan"),
                new Empleado("yomismo")
        };

        System.out.println("=== BIENVENIDO A LA PIZZERIA POPEYE DE MUTXAMIEL");
        System.out.println();

        // Foreach para recorrer el array de empleados y mostrar los detalles del metodo implementado en la clase empleado.
       for (Empleado empleado : empleados) {
           empleado.obtenerDetalles();
           System.out.println();
       }

        System.out.println("Haz tu pedido");
        System.out.println("Cómo te llamas?");
        String nombre = teclado.nextLine().trim();

        //Creacion del objeto de tipo cliente con los datos del (nombre) introducido
        Cliente cliente = new Cliente(nombre);

        //Mensaje que se muestra por pantalla mostrando el nombre almacenado en el atributo de la clase cliente
        System.out.println("¿Qué te apetece comer hoy, " + cliente.getNombre() + "?");
        System.out.println("===Carta===");


        //Foreach para recorrer el enum de las pizzas y mostrar tanto el nombre de cada pizza como su precio, cogiendo asi el precio del get creado en ese enum.
        for (CartaPizzas cartaPizzas : CartaPizzas.values()) {
            System.out.println(cartaPizzas + ": " + cartaPizzas.getPrecio());
        }


        //Aqui que comprueba que la pizza que se ha elegido este dentro del enum.
        System.out.println("===============");
        String pizza = teclado.nextLine();

        //COMPROBAR QUE LA PIZZA ESTA DENTRO DEL ENUM
        CartaPizzas pizzaElegida = CartaPizzas.valueOf(pizza);
        System.out.println("El precio actual de la cuenta es de " + pizzaElegida.getPrecio() + "€");
        System.out.println("Quieres añadir más pizzas) S/N");
        String opcion = teclado.nextLine();
        switch (opcion) {
            case "S":

                break;
            case "N":

                break;
            default:
        }


    }
}