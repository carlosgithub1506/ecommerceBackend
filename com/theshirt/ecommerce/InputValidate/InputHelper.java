
package com.theshirt.ecommerce.InputValidate;


import java.util.Scanner;


public class InputHelper {
    

    private static Scanner scanner = new Scanner(System.in);
    

    public static Object inputInt(String mensaje1, String mensaje2){
        
        // Solicitar dato numero entero y usa otro metodos para validar el tipo de dato
        Object retorno = null;
        int contador = 3;
        boolean validacion;
        imprimirMensaje(mensaje1);

        while (contador > 0) { 
            contador --;
            String dato = scanner.nextLine();
            validacion = ValidateEntrada.validarInt(dato);
            if (validacion == true){
                retorno = Integer.parseInt(dato);
                break;
            }else if (contador > 0) {
                imprimirMensaje(mensaje2 + "intentos restantes " + contador + ": ");
            }else{
                imprimirMensaje("El numero no se pudo validar  correctamente ");
            }
        }
   
        return retorno; 


    } 

    public static Object inputDouble(String mensaje1, String mensaje2){

        // Solicitar dato numero double y usa otro metodos para validar el tipo de dato

        Object retorno = null;
        int contador = 3;
        boolean validacion;
        imprimirMensaje(mensaje1);

        while (contador > 0) { 
            contador --;
            String dato = scanner.nextLine();
            validacion = ValidateEntrada.validarDouble(dato);
            if (validacion == true){
                retorno = Double.parseDouble(dato);
                break;
            }else if (contador > 0) {
                imprimirMensaje(mensaje2 + "intentos " + contador + ": ");
            }else{
                imprimirMensaje("El numero no se pudo validar  correctamente \n");
            }
        }
   
        return retorno; 

    } 

    public static Object inputString (String mensaje1, String mensaje2){

        // Solicitar dato String y usa otro metodos para validar el tipo de dato

        Object retorno = null;
        int contador = 3;
        boolean validacion;
        imprimirMensaje(mensaje1);

        while (contador > 0) { 
            contador --;
            String dato = scanner.nextLine();
            validacion = ValidateEntrada.validarStr(dato);
            if (validacion == true){
                retorno = dato;
                break;
            }else if (contador > 0) {
                imprimirMensaje(mensaje2 + "intentos " + contador + ": ");
            }else{
                imprimirMensaje("El String no se pudo validar  correctamente \n");
            }
        }
   
        return retorno; 

    }

    public static <T extends Enum<T>> T entradaTiposPorEnum(Class<T> enumClass, String  mensaje, String mensaje2){

        // solicita una opcion para asignar dato por enum

        T retorno = null;
        int contador = 3;
        T validacion;
        String dato;
        StringBuilder sb = new StringBuilder();
        T[] valoresEnum = enumClass.getEnumConstants(); 

        if (enumClass.isEnum() && valoresEnum.length > 0 && mensaje.length() > 0 && mensaje2.length() > 0){

            sb.append(mensaje).append("\n");        
            for (T valor : enumClass.getEnumConstants()) {
                sb.append("- " + valor).append("\n");  
            }

            if (sb.length() > 0 && sb.charAt(sb.length() -1 ) == '\n'){
                
                sb.deleteCharAt(sb.length() - 1);      
                sb.append(": ");
                imprimirMensaje(sb.toString());

                while (contador > 0) { 
                    contador --;
                    dato = scanner.nextLine();
                    validacion = ValidateEntrada.validarTiposPorEnum(enumClass, dato);
                    if (validacion != null){
                        retorno = validacion;
                        break;
                    }else if (contador > 0) {
                        imprimirMensaje(mensaje2 + "Intentos " + contador + ": ");
                    }else{
                        imprimirMensaje("El Dato no se pudo validar  correctamente \n");
                    }
                }
            } 
        }
   
        return retorno;
    }

    public static void pausarYLimpiarConsola() {
        System.out.println("\nPresione ENTER para continuar...");
        scanner.nextLine();

        // Limpiar consola con códigos ANSI (Linux / VSCode Terminal)
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    

     public static void imprimirMensaje(){
        System.out.print("\n");
    }

    public static void imprimirMensaje(String mensaje){
        System.out.print(mensaje);
    }



}


