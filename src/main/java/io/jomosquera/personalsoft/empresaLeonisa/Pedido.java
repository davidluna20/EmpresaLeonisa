package io.jomosquera.personalsoft.empresaLeonisa;

import java.util.Vector;

public class Pedido {
    private int cantidadUnidad;

    Vector<Object> pedidos = new Vector<Object>();

    public Pedido() {
    }

    public Pedido(int cantidadUnidad) {
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

}
