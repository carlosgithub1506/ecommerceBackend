package com.theshirt.ecommerce;
import java.util.Scanner;

import com.theshirt.ecommerce.InputValidate.InputHelper;
import com.theshirt.ecommerce.repository.ProductoDAO;

public class Inicio {
    
    
    public static void main(String[] args) {
        
    Boolean continuar = true;
    Scanner scanner = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    sb.append("\n<----- Menu de arcticulos ----->\n");
    sb.append("1. Crear un articulo nuevo \n");
    sb.append("2. Consultar articulo \n");
    sb.append("3. Listar articulo \n");
    sb.append("4. Modificar articulo \n");
    sb.append("5. Borrar un articulo \n");
    sb.append("0. Salir \n");
    sb.append("Ingrese una opcion:");
    String opcion;

    while (continuar) {
            InputHelper.imprimirMensaje();
            InputHelper.imprimirMensaje(sb.toString());
            opcion = scanner.nextLine().trim();
            
            if(opcion.equals("1")){

                ProductoDAO.crearProducto(Data1.getListaProductos());

            }else if (opcion.equals("2")){
                
                ProductoDAO.mostrarUnProducto(Data1.getListaProductos());

            }else if (opcion.equals("3")){
             
                ProductoDAO.mostrarProductos(Data1.getListaProductos());

            }else if (opcion.equals("4")){
                ProductoDAO.modificarProducto(Data1.getListaProductos());

            }else if (opcion.equals("5")){
                ProductoDAO.borrarProducto(Data1.getListaProductos());
            }
            else if (opcion.equals("0")){
                continuar = false;
                InputHelper.imprimirMensaje("Saliendo del programa!!!!");

            }else{
                System.out.println("Ingrese una opcion correcta");
            }

            InputHelper.pausarYLimpiarConsola();;

        
    }

    scanner.close();

    }


}
