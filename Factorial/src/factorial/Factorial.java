/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author Diana Teresa Ogaz Escarpita 18550698
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int NV = 5;
        int NR = CalcFact(NV);
        
        
        System.out.println("Resultado = " + NR);
        
    }
    public static int CalcFact(int NV){
       int NR = 1;
       
       for (int i = NV; i >= 1; i--){
           NR *= i;
           
       }
       return NR;
   
    }
    }

