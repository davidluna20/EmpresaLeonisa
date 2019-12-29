package io.jomosquera.personalsoft.empresaLeonisa;

public class Producto {
    private  String CIU;
    private  double precio;
    private Categoria categoria;

    public Producto() {
    }

    public Producto(String ciu, int precio, String tipPrenda, String talla, String color, String material ){
        categoria = new Categoria(tipPrenda, talla, color, material);
        this.CIU = ciu;
        this.precio = precio;
    }

    public String getCIU() {
        return CIU;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
