package org.fustranbran.PizzaExpress;

import java.util.ArrayList;

public class Pedido extends PizzaExpress{

    public Pedido(ArrayList<CartaPizzas> listaPizzas, Estado estadoPedido, Cliente cliente) {
        this.listaPizzas = listaPizzas;
        this.estadoPedido = estadoPedido;
        this.cliente = cliente;
    }

    private Cliente cliente;
    private ArrayList<CartaPizzas> listaPizzas = new ArrayList<>();
    private Estado estadoPedido;


    public ArrayList<CartaPizzas> getListaPizzas() {
        return listaPizzas;
    }

    public void setListaPizzas(ArrayList<CartaPizzas> listaPizzas) {
        this.listaPizzas = listaPizzas;
    }

    public Estado getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(Estado estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public void aplicarDescuento() {

    }

    @Override
    public void obtenerDetalles() {

    }
}
