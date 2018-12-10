/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_practica6;

import java.util.Scanner;

/**
 *
 * @author Diana Teresa Ogaz Escarpita 18550698
 */
public class EVA3_PRACTICA6 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa año");
        int iAño;
        iAño = input.nextInt();
        
        int iResi4;
        int iResi100;
        int iResi400;
        
        iResi4 = iAño % 4;
        iResi100 = iAño % 100;
        iResi400 = iAño % 400;
        
        Boolean iResu;
        System.out.println(Año(iResi4,iResi100,iResi400));
}
    public static Boolean Año (int iResi4, int iResi100, int iResi400) {
        Boolean iResu;
        if (iResi4 == 0 && (!(iResi100 == 0) || iResi400 == 0)) {
            iResu = true;
        } else {
           iResu = false;
        }
        
        return iResu;
    }
}

    