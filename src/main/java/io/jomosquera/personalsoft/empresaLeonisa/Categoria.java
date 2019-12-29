package io.jomosquera.personalsoft.empresaLeonisa;

public class Categoria {
    private String tipPrenda;
    private String talla;
    private String color;
    private String material;

    public Categoria(){

    }

    public Categoria(String tipPrenda, String talla, String color, String material) {
        this.tipPrenda = tipPrenda;
        this.talla = talla;
        this.color = color;
        this.material = material;
    }

    public String getTipPrenda() {
        return tipPrenda;
    }

    public String getTalla() {
        return talla;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

}
