package org.fustranbran.PizzaExpress;

public class Cliente extends PizzaExpress implements AccionesPedido{

    private String nombre;
    private int descuento; // 20% por defecto



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