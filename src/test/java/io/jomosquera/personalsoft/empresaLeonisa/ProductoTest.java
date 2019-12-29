package io.jomosquera.personalsoft.empresaLeonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductoTest {
    Producto producto;

    @Before
    public void setUp() throws Exception {
        producto = new Producto("123", 2500,"otro","M","azul","terciopelo");

    }

    @Test
    public void getCIUTest() {
        Assert.assertEquals("El CIU no es el esperado", "123", producto.getCIU());
    }

    @Test
    public void getPrecioTest() {
        Assert.assertEquals("El Precio no es el esperado", 2500, producto.getPrecio(),0);
    }

    @Test
    public void setPrecioTest() {
        producto.setPrecio(500);
        Assert.assertEquals("El Precio no es el esperado", 500, producto.getPrecio(),0);
    }
}





