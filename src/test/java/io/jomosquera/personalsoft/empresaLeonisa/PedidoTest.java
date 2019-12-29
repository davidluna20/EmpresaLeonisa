package io.jomosquera.personalsoft.empresaLeonisa;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;
import java.util.ArrayList;

public class PedidoTest {

    private Pedido pedidosLeonisa;
    private Pedido pedidosLeo;
    private Pedido pedidosTeen;
    private Leonisa leonisa;
    private Leo leo;
    private Teen teen;

    private ArrayList<Object> pedidos = new ArrayList<Object>();

    @Before
    public void setUp() throws Exception {

        pedidosLeonisa = new Pedido(10);
        pedidosLeo = new Pedido(3);
        pedidosTeen = new Pedido(50);

        leonisa = new Leonisa("1234EF", 35000, "Boxer", "S", "Rojo", "Terciopelo");
        leo = new Leo("RUC1234", 15000, "Camiseta", "S", "Azul", "Terciopelo");
        teen = new Teen("AFB00123", 25000, "Bra", "34C", "Amarillo", "Terciopelo");

        pedidos.add(leonisa);
        pedidos.add(leo);
        pedidos.add(teen);
    }

    @Test
    public void asignarProductoLeonisaTest() {
        boolean asignadoLeonisa = pedidos.contains(leonisa);
        Assert.assertTrue("No se ha asignado un producto 'Leonisa' al pedido", asignadoLeonisa);
    }

    @Test
    public void AsignarProductoLeoTest() {
        boolean asignadoLeo = pedidos.contains(leo);
        Assert.assertTrue("No se ha asignado un producto 'Leo' al pedido", asignadoLeo);
    }

    @Test
    public void AsignarProductoTeenTest() {
        boolean asignadoTeen = pedidos.contains(teen);
        Assert.assertTrue("No se ha asignado un producto 'Teen' al pedido", asignadoTeen);
    }

    @Test
    public void totalCompra() {

    }

    @Test
    public void testTotalCompra() {
    }

    @Test
    public void testTotalCompra1() {
    }
}