package org.fustranbran.PizzaExpress;

public class Empleado extends PizzaExpress implements  AccionesPedido{

    private String id_empleado; // EMP001, EMP002
    private String nombre;



    public void siguienteEstado(Pedido pedido) {

    }

    public void entregarPedido(Pedido pedido) {

    }
    @Override
    public void obtenerDetalles() { //de abstract class

    }

    @Override
    public void cancelar(Pedido pedido) { // de interfaz Accciones pedido

    }
}
