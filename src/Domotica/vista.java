/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domotica;

import java.util.Scanner;

/**
 *
 * @author javi
 */
public class vista {

//Identificar las distintas acciones que realiza el
//usuario en la centralita
    private static Scanner teclado = new Scanner(System.in);

    public static Comando menu() {
        int opcion;

        do {
            System.out.println("Bienvenido a la Centralita");
            System.out.println("---------------------------");
            System.out.println("1.-Apagar sistema");
            System.out.println("2.-Consultar hora");
            System.out.println("3.-Consultar fecha");
            System.out.println("4.-Consultar metros cuadrados");
            System.out.println("5.-Entrar en el dormitorio");
            System.out.println("6.-Entrar en el salon");
            System.out.println("7.-Entrar en el garaje");
            System.out.println("Inserte la opcion que dese");
            opcion = teclado.nextInt();
        } while (opcion < 0 || opcion > 8);
        switch (opcion) {
            case 1:
                return Comando.APAGAR_SISTEMA;
            case 2:
                return Comando.CONSULTAR_HORA;
            case 3:
                return Comando.CONSULTAR_FECHA;
            case 4:
                return Comando.METROS_CUADRADOS;
            case 5:
                System.out.println("Dormitorio:");
                System.out.println("1.-Consultar orientacion del dormitorio");
                System.out.println("2.-Consultar estado de la luz");
                System.out.println("3.-Encender la luz");
                System.out.println("4.-Apagar la luz");
                System.out.println("5.-Consultar estado de la persiana");
                System.out.println("6.-Subir la persiana");
                System.out.println("7.-Bajar la persiana");
                System.out.println("8.-Consultar estado de la vigilancia de la camara");
                System.out.println("9.-Empezar vigilacia de la camara");
                System.out.println("10.-Terminar vigilancia de la camara");
                System.out.println("Inserte la opcion que dese");
                int opcion2 = teclado.nextInt();
                switch (opcion2) {
                    case 1:
                        return Comando.ORIENTACION_DORMITORIO;
                    case 2:
                        return Comando.CONSULTAR_LUZ_DORMITORIO;
                    case 3:
                        return Comando.ENCENDER_LUZ_DORMITORIO;
                    case 4:
                        return Comando.APAGAR_LUZ_DORMITORIO;
                    case 5:
                        return Comando.CONSULTAR_PERSIANA_DORMITORIO;
                    case 6:
                        return Comando.ABRIR_PERSIANA_DORMITORIO;
                    case 7:
                        return Comando.CERRAR_PERSIANA_DORMITORIO;
                    case 8:
                        return Comando.CONSULTAR_VIGILANCIA_DORMITORIO;
                    case 9:
                        return Comando.COMENZAR_VIGILANCIA_DORMITORIO;
                    case 10:
                        return Comando.FINALIZAR_VIGILANCIA_DORMITORIO;
                }
                
            case 6:
                System.out.println("Salon:");
                System.out.println("1.-Ver si tiene terraza");
                System.out.println("2.-Consultar estado de la luz");
                System.out.println("3.-Encender la luz");
                System.out.println("4.-Apagar la luz");
                System.out.println("5.-Consultar estado de la persiana");
                System.out.println("6.-Subir la persiana");
                System.out.println("7.-Bajar la persiana");
                System.out.println("8.-Consultar estado de la vigilancia de la camara");
                System.out.println("9.-Empezar vigilacia de la camara");
                System.out.println("10.-Terminar vigilancia de la camara");
                System.out.println("Inserte la opcion que dese");
                int opcion3 = teclado.nextInt();
                switch (opcion3) {
                    case 1:
                        return Comando.COMPROBAR_TERRAZA;
                    case 2:
                        return Comando.CONSULTAR_LUZ_SALON;
                    case 3:
                        return Comando.ENCENDER_LUZ_SALON;
                    case 4:
                        return Comando.APAGAR_LUZ_SALON;
                    case 5:
                        return Comando.CONSULTAR_PERSIANA_SALON;
                    case 6:
                        return Comando.ABRIR_PERSIANA_SALON;
                    case 7:
                        return Comando.CERRAR_PERSIANA_SALON;
                    case 8:
                        return Comando.CONSULTAR_VIGILANCIA_SALON;
                    case 9:
                        return Comando.COMENZAR_VIGILANCIA_SALON;
                    case 10:
                        return Comando.FINALIZAR_VIGILANCIA_SALON;
                }
            case 7:
                System.out.println("Garaje:");
                System.out.println("1.-Consultar estado de la puerta");
                System.out.println("2.-Subir puerta del garaje");
                System.out.println("3.-Bajar puerta del garaje");
        System.out.println("Inserte la opcion que dese");
                int opcion4 = teclado.nextInt();
               switch (opcion4) {
                    case 1:
                        return Comando.CONSULTAR_PUERTA_GARAJE;
                    case 2:
                        return Comando.SUBIR_PUERTA_GARAJE;
                    case 3:
                        return Comando.BAJAR_PUERTA_GARAJE;
}}      return Comando.APAGAR_SISTEMA;
    }
}
