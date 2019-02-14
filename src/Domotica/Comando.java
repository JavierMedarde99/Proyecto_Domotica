/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author javi
 */
public enum Comando {
    
    //Los tipos ENUm tienen dos caracteristicas funcionales:
    //1.-El constructor es privado
    //2.-Solo pueden instanciarse con un tipo de objeto concreto
    APAGAR_SISTEMA(0,"apagar sistema"),
    CONSULTAR_HORA(1,"Consultar la hora del sistema"),
    MODIFICAR_HORA(2,"Modifica la hora de la centralita"),
    CONSULTAR_FECHA(1,"Consultar la fecha del sistema"),
    //Garraje
    SUBIR_PUERTA_GARAJE(3,"Subir puerta del garaje"),
    BAJAR_PUERTA_GARAJE(4, "Bajar puerta del garaje"),
    //orientacion
    ORIENTACION_DORMITORIO(5,"Orientacion del dormitorio"),
    //LUZ
    ENCENDER_LUZ_DORMITORIO(6,"Encender luz dormitorio"),
    ENCENDER_LUZ_SALON(7,"Encender luz salon"),
    CONSULTAR_LUZ_SALON(8,"Consultar la luz del salon"),
    CONSULTAR_LUZ_DORMITORIO(9,"Consultar la luz del salon"),
    APAGAR_LUZ_DORMITORIO(10,"Apagar luz dormitorio"),
    APAGAR_LUZ_SALON(11,"Apagar luz salon"),
    //Persiana
    ABRIR_PERSIANA_DORMITORIO(12,"Subir dormitorio la persiana"),
    ABRIR_PERSIANA_SALON(13,"Subir salon la persiana"),
    CERRAR_PERSIANA_DORMITORIO(14,"bajar dormitorio la persiana"),
    CERRAR_PERSIANA_SALON(15,"bajar salon la persiana"),
    CONSULTAR_PERSIANA_SALON(16,"Consultar la persiana del salon"),
    CONSULTAR_PERSIANA_DORMITORIO(17,"Consultar la persiana del salon"),
    //camara
    COMENZAR_VIGILANCIA_SALON(18,"Comenzar vigilacia salon"),
    COMENZAR_VIGILANCIA_DORMITORIO(19,"Comenzar vigilacia dormitorio"),
    FINALIZAR_VIGILANCIA_SALON(20,"Finalizar vigilacia salon"),
    FINALIZAR_VIGILANCIA_DORMITORIO(21,"Finalizar vigilacia dormitorio"),
    CONSULTAR_VIGILANCIA_SALON(22,"Consultar la camara del salon"),
    CONSULTAR_VIGILANCIA_DORMITORIO(23,"Consultar la camara del salon"),
    COMPROBAR_TERRAZA(24,"consulta la terraza del salon");
    
    private int codigo;
    private String descripcion;

private Comando(int codigo,String descripcion){
    this.codigo=codigo;
    this.descripcion=descripcion;
}

public int getCodigo(){
    return this.codigo;
}
}
