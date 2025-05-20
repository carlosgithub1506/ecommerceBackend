package com.theshirt.ecommerce.InputValidate;

public class ValidateEntrada {


    public static boolean validarInt(String dato){

        // valida tipo de dato int

        boolean retorno;
        try {
            Integer.parseInt(dato);
            retorno = true;           
        } catch (Exception e) {
            retorno = false;   
        }

        return retorno;

    }

    public static boolean validarDouble(String dato){

        // valida tipo de dato double

        boolean retorno;
        try {
            Double.parseDouble(dato);
            retorno = true;           
        } catch (Exception e) {
            retorno = false;   
        }

        return retorno;
      
    }

    public static boolean validarStr(String dato){

        // valida tipo de String

        boolean retorno = false;
        if (dato != null && !dato.trim().isEmpty() && dato.matches("[a-zA-Z]+") && dato.length() >= 4) retorno = true;           

        return retorno;
    }

    public static <T extends Enum<T>> T validarTiposPorEnum(Class<T> enumClass, String dato){
        
        // valida la opcion de un enum

        T retorno;
        try {

            dato =  dato.trim().toUpperCase();
            retorno = Enum.valueOf(enumClass, dato);
            
        } catch (Exception e) {
            retorno = null;
        }
        
        return retorno;


    }

}
