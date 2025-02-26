package org.fustranbran.PizzaExpress;

public class ComprobarEstadoPedido extends Exception {

    public ComprobarEstadoPedido() {
        super("ERROR: El pedido aún no está LISTO....");
    }
}
