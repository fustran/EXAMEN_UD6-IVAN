package org.fustranbran.PizzaExpress;

import java.util.ArrayList;

public class Pedido extends PizzaExpress{

    private Cliente cliente;
    private ArrayList<CartaPizzas> listaPizzas = new ArrayList<>();
    private Estado estadoPedido;


    public void aplicarDescuento() {

    }


    @Override
    public void obtenerDetalles() {

    }
}
