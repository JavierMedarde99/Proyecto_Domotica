/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author javi
 */
public class vista {

//Identificar las distintas acciones que realiza el
//usuario en la centralita

    private static Scanner teclado = new Scanner (System.in);
public static Comando menu(){
    System.out.println("Bienvenido a la Centralita");
    System.out.println("---------------------------");
    System.out.println("1.-Apagar sistema");
    System.out.println("2.-Consultar hora");
    int opcion= teclado.nextInt();
    switch(opcion){
        case 1:
            return Comando.CONSULTAR_HORA;
    }
    return Comando.APAGAR_SISTEMA;
}    
}
