package com.theshirt.ecommerce;

import java.util.ArrayList;
import java.util.List;

import com.theshirt.ecommerce.model.CategoriaRemera;
import com.theshirt.ecommerce.model.Color;
import com.theshirt.ecommerce.model.Producto;
import com.theshirt.ecommerce.model.Talla;

public class Data1 {
    
    private static List<Producto> listaProductos = new ArrayList<>(List.of(
    new Producto(1, "Remera", "lisa", Talla.L, Color.AZUL, CategoriaRemera.MANGA_CORTA, 60.000, "Hombre", "Nike", true),
    new Producto(2, "Remera", "estampadas", Talla.S, Color.NEGRO, CategoriaRemera.MANGA_LARGA, 50.000, "Hombre", "Adidas", false),
    new Producto(3, "Remera", "Running", Talla.XL, Color.ROJO, CategoriaRemera.SIN_MANGAS, 40.000, "Mujer", "Puma", true),
    new Producto(4, "Remera", "Formal", Talla.XXL, Color.VERDE, CategoriaRemera.SIN_MANGAS, 30.000, "Mujer", "Converse", false),
    new Producto(5, "Remera", "Deportivo", Talla.M, Color.AMARILLO, CategoriaRemera.SIN_MANGAS, 20.000, "Niño","Nike", true ),
    new Producto(6, "Remera", "Deportiva", Talla.S, Color.DESCONOCIDO, CategoriaRemera.DESCONOCIDO, 10.000, "Niño", "Nike", false)
    ));

    public static List<Producto> getListaProductos(){
        // Retorna una lista con valores precargados 
        return listaProductos;
    }



}
