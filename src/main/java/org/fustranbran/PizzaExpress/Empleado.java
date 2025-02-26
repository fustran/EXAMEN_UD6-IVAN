package org.fustranbran.PizzaExpress;



public class Empleado extends PizzaExpress implements AccionesPedido {

    private static final String ID_EMPLEADO = "EMP";
    private static int empleados = 0;

    private String id_empleado; // EMP001, EMP002
    private String nombre;


    public Empleado(String nombre) {
        this.nombre = nombre;
        empleados++;
        this.id_empleado = generarIdEmpleado();
    }

    private String generarIdEmpleado() {
        return ID_EMPLEADO + String.format("%03d", empleados);
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void siguienteEstado(Pedido pedido) {

    }

    public void entregarPedido(Pedido pedido) {

    }
    @Override
    public void obtenerDetalles() { //de abstract class
        System.out.printf("Empleado " + id_empleado + ": " + nombre);
    }

    @Override
    public void cancelar(Pedido pedido) { // de interfaz Accciones pedido

    }
}
