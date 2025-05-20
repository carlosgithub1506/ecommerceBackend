package com.theshirt.ecommerce.model;

public class Producto extends Articulo {

    private Talla talla;
    private Color color;
    private CategoriaRemera tipo;

    public Producto(int id){
        super(id);
        this.talla = Talla.DESCONOCIDA;
        this.color = Color.DESCONOCIDO;
        this.tipo = CategoriaRemera.DESCONOCIDO;
    }

    public Producto(int id, String nombre) {
        this(id);
        this.setNombre(nombre);
    }

    public Producto(int id, String nombre, String descripcion) {
        this(id, nombre);
        this.setDescripcion(descripcion);
    }
    
    public Producto(int id, String nombre, String descripcion, Talla talla) {
        this(id, nombre,descripcion);
        this.talla = talla;
    }

    public Producto(int id, String nombre, String descripcion, Talla talla, Color color) {
        this(id, nombre,descripcion,talla);
        this.color = color;
    }


    public Producto(int id, String nombre, String descripcion, Talla talla, Color color, CategoriaRemera tipo) {
        this(id, nombre,descripcion,talla,color);
        this.tipo = tipo;
    }


    public Producto(int id, String nombre, String descripcion, Talla talla, Color color, CategoriaRemera tipo, double precio) {
        this(id, nombre,descripcion,talla,color, tipo);
        this.setPrecio(precio);
    }

    public Producto(int id, String nombre, String descripcion, Talla talla, Color color
                    , CategoriaRemera tipo, double precio, String categoria ) {

        this(id, nombre,descripcion,talla,color, tipo, precio);
        this.setCategoria(categoria);
    }


    public Producto(int id, String nombre, String descripcion, Talla talla, Color color
                    , CategoriaRemera tipo, double precio, String categoria, String marca ) {
                        
        this(id, nombre,descripcion,talla,color, tipo, precio, categoria);
        this.setMarca(marca);
    }

    public Producto(int id, String nombre, String descripcion, Talla talla, Color color
        , CategoriaRemera tipo, double precio, String categoria, String marca, boolean activo ) {
                        
        this(id, nombre,descripcion,talla,color, tipo, precio, categoria, marca);
        this.setActivo(activo);
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public CategoriaRemera getTipo() {
        return tipo;
    }

    public void setTipo(CategoriaRemera tipo) {
        this.tipo = tipo;
    }

    @Override
    public String mostrarDatos(){
        
        StringBuilder sb = new StringBuilder();
        sb.append(super.mostrarDatos());
        sb.append("Talla: ").append(this.talla).append("\n");
        sb.append("Color: ").append(this.color).append("\n");
        sb.append("Tipo: ").append(this.tipo).append("\n");
        return sb.toString();
        
    }
    
    
}
