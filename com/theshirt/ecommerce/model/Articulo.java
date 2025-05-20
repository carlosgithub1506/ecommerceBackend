package com.theshirt.ecommerce.model;

public class Articulo {

    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private String categoria;
    private String marca;
    private boolean activo; 

    public Articulo(int id){
        this.id = id;
        this.nombre = "sin nombre";
        this.descripcion = "sin descripcion";
        this.precio = 00;
        this.categoria = "categoria";
        this.marca = "marca";
        this.activo = false; 

    }

    public int getId(){
        return this.id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio ;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String mostrarDatos(){

        StringBuilder sb = new StringBuilder();
        sb.append("\n <----- Datos del producto -----> \n");
        sb.append("Id: ").append(this.id).append("\n");
        sb.append("Nombre: ").append(this.nombre).append("\n");
        sb.append("Descripcion: ").append(this.descripcion).append("\n");
        sb.append("Precio: ").append(this.precio).append("\n");
        sb.append("Categoria: ").append(this.categoria).append("\n");
        sb.append("Marca: ").append(this.marca).append("\n");
        sb.append("Activo: ").append(this.activo).append("\n");
        
        return sb.toString();
    }




}
