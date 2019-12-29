package io.jomosquera.personalsoft.empresaLeonisa;

import java.util.Vector;

public class Pedido {
    private int cantidadUnidad;
    private String medioPago;
    private double descuento;
    private int prontoPago;

    Vector<Object> pedidos = new Vector<Object>();
    Vector<Object> total = new Vector<Object>();

    public Pedido() {
    }

    public Pedido(int cantidadUnidad, String medioPago, double descuento, int prontoPago) {
        this.cantidadUnidad = cantidadUnidad;
        this.medioPago = medioPago;
        this.descuento = descuento;
        this.prontoPago = prontoPago;
    }

    public Pedido(int cantidadUnidad){

        this.cantidadUnidad = cantidadUnidad;
    }

    public void asignarProducto(Leonisa leonisa){
        pedidos.add(leonisa);
    }

    public void asignarProducto(Leo leo){
        pedidos.add(leo);
    }

    public void asignarProducto(Teen teen){
        pedidos.add(teen);
    }

    public Object totalCompra(Leonisa leonisa,int cantidadUnidad){

        total.add(cantidadUnidad*leonisa.getPrecio());
        return total;
    }

    public Object totalCompra(Leo leo,int cantidadUnidad){

        total.add(cantidadUnidad*leo.getPrecio());
        return total;
    }

    public Object totalCompra(Teen teen,int cantidadUnidad){

        total.add(cantidadUnidad*teen.getPrecio());
        return total;
    }
}
