package io.jomosquera.personalsoft.empresaLeonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoriaTest {

    Categoria categoria;

    @Before
    public void setup(){
        categoria = new Categoria("Bra", "10", "Negro", "Terciopelo");
    }

    @Test
    public void getTipPrendaTest() {
        Assert.assertEquals("El Tipo de Prenda no es el esperado", "Bra", categoria.getTipPrenda());
    }

    @Test
    public void getTallaTest() {
        Assert.assertEquals("La Talla no es la esperada", "10", categoria.getTalla());
    }

    @Test
    public void getColorTest() {
        Assert.assertEquals("El Color no es el esperado", "Negro", categoria.getColor());
    }

    @Test
    public void getMaterialTest() {
        Assert.assertEquals("El Material no es el esperado", "Terciopelo", categoria.getMaterial());
    }
}