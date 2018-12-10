/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_4_funcion;

/**
 *
 * @author Diana Teresa Ogaz Escarpita 18550698
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //PARA LLAMAR LA FUNCION --> LLAMAR FUNCION
      Main mObjeto = new Main();
     mObjeto.ImprimeMensaje("Diana");
     Math.random();
     mObjeto.ImprimeMensaje("Diana");
    }
    //PARADIGMAS DE PROGRAMACION:
    //PROGRAMACION ESTRUCTURADA
    //PROGRAMACION MODULAR, LOGICA,FUNCIONAL
    
    //OOP
    //PUBLICO PRIVADO PROTEGIDO DEFAULT
    //NIVE DE ACCESOVALOR DE RETORNO, NOMBRE DE FUNCION (ARGUMENTOS)
    //{CUERPO DE LA FUNCION}
    //funciones regresan vallr
    //procedimientos no regresan nada
    
     void ImprimeMensaje(String mensaje){
        System.out.println("Hola" + mensaje);
    }
}
