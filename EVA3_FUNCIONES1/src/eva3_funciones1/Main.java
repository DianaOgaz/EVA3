/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_funciones1;

import java.util.Scanner;

/**
 *
 * @author Diana Teresa Ogaz Escarpita 18550698
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
    
        Main mObjeto = new Main();
        mObjeto.Meses();
        
         System.out.println("Incerte numero de mes");
        
    }
   
    public static String Meses(int num){ 
        
         num = input.nextInt();
        
        String nMes = ("");
        
        switch (num){
                case 1:
                    nMes = ("Enero");
                    return nMes;
                case 2:
                    nMes = ("Febrero");
                    return nMes;
                case 3:
                    nMes = ("Marzo");
                    return nMes;
                case 4:
                    nMes = ("Abril");
                    return nMes;
                 case 5:
                    nMes = ("Mayo");
                    return nMes;
                case 6:
                    nMes = ("Junio");
                    return nMes;    
                case 7:
                    nMes = ("Julio");
                    return nMes;   
                case 8:
                    nMes = ("Agosto");
                    return nMes;
                case 9:
                    nMes = ("Septiembre");
                    return nMes;
                case 10:
                    nMes = ("Octubre");
                    return nMes;    
                case 11:
                    nMes = ("Noviembre");
                    return nMes;
                case 12:
                    nMes = ("Diciembre");
                    return nMes;
                
        }
    
    
    
    }  
}   
         