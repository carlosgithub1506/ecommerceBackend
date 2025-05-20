package com.theshirt.ecommerce.repository;

import com.theshirt.ecommerce.InputValidate.*;
import com.theshirt.ecommerce.InputValidate.InputHelper.*;
import com.theshirt.ecommerce.model.*;
import java.util.ArrayList;
import java.util.List;



public class ProductoDAO {


    public static void crearProducto(List<Producto> listaProductos){

        //Metodo para crear un nuevo producto

        Object validacion;
        int id = listaProductos.size() + 1 ;
        String nombre = null;
        String descripcion = null;
        Talla talla;


        validacion = InputHelper.inputString("Ingrese un nombre sin numero o caracteres especiales: " ,
        "ingrese un nombre sin numero o caracteres especiales" );
        if (validacion != null){
            nombre = validacion.toString(); 
        }

        validacion = InputHelper.inputString("Ingrese una Descripcion sin numero o caracteres especiales: " ,
        "ingrese una Descripcion sin numero o caracteres especiales" );
        if (validacion != null){
            descripcion = validacion.toString(); 
        }

        talla = InputHelper.entradaTiposPorEnum(Talla.class, "Ingrese una de las siguientes Opciones", "Error reingrese un String ");
    

        if (nombre != null && descripcion != null && talla != null ){
            Producto remera = new Producto(id, nombre, descripcion, talla);
            listaProductos.add(remera);
            InputHelper.imprimirMensaje("Datos cargados correctamente!!! ");

        }else{
            InputHelper.imprimirMensaje("Hubo un error los datos no fueron cargados");
        }

    }


    public static void mostrarProductos(List<Producto> listaProductos){

        // Mostrar todos los productos
        if(listaProductos.isEmpty()){
            InputHelper.imprimirMensaje("No hay articulos cargados");
        }
        else{

            for (Producto producto : listaProductos) {                
                InputHelper.imprimirMensaje(producto.mostrarDatos());
            }
        }


    }

    public static Producto  mostrarUnProducto(List<Producto> listaProductos){
        
        // Mostrar un producto
        Producto retorno = null;
        Object validacion;
        boolean flag = false;
        if(!listaProductos.isEmpty()){

            validacion = InputHelper.inputInt("Ingrese un numero id: ", "Error ingrese un numero id: ");
            if (validacion != null){
                for (Producto producto : listaProductos) {
                    if(validacion.equals(producto.getId())){
                        InputHelper.imprimirMensaje(producto.mostrarDatos());
                        flag = true;
                        retorno = producto;
                        break;
                    } 
                }
            
                if (flag == false) InputHelper.imprimirMensaje("Id no existe ");
            }
        }else{
            InputHelper.imprimirMensaje("No hay articulos cargados");

        }
        return retorno;

    }

    public static void modificarProducto(List<Producto> listaProductos){

        Object producto;
        Object validacion;
        producto = mostrarUnProducto(listaProductos);
        if(producto != null){
            validacion = InputHelper.inputString("Ingrese un nombre sin numero o caracteres especiales: " ,
                                                 "ingrese un nombre sin numero o caracteres especiales" );
            if (validacion != null){
                ((Producto) producto).setNombre(validacion.toString());
    
            }

            validacion = InputHelper.inputString("Ingrese una Descripcion sin numero o caracteres especiales: " ,
            "ingrese una Descripcion sin numero o caracteres especiales" );
            if (validacion != null){
                ((Producto) producto).setDescripcion(validacion.toString()); 
            }

            validacion = InputHelper.inputDouble("Ingrese precio: " ,
            "Reingrese un numero (precio) " );
            if (validacion != null){
                ((Producto) producto).setPrecio((double) validacion); 
            }

        }
    }

    public static void borrarProducto(List<Producto> listaProductos){

        Producto validacion = mostrarUnProducto(listaProductos);
        if(validacion != null){
            
            listaProductos.remove(validacion); 
            InputHelper.imprimirMensaje("Producto eliminado");
                 
            }

    }

}
