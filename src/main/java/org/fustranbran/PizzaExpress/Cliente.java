package org.fustranbran.PizzaExpress;

public class Cliente extends PizzaExpress implements AccionesPedido{

    private String nombre;
    private int descuento; // 20% por defecto

    public Cliente(String nombre) {

        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }


    public void pedir() {

    }

    public void pagar() {

    }

    public void recoger() {

    }


    @Override
    public void obtenerDetalles() { // De la clase abstracta

    }

    @Override
    public void cancelar(Pedido pedido) { //de interfaz AccionesPedido

    }
}