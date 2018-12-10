/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diana Teresa Ogaz Escarpita 18550698
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //CONTAR DEL 1 AL 100 CON TODOS LOS CICLOS 
        int iNum =1;
        System.out.println("CICLO FOR");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " - ");
          
            
        }
        for (int i = 100; i <= 1; i--) {
            System.out.print(i+ " - ");
            
        }
        System.out.println("");
        
        
        System.out.println("CICLO WHILE");
        
        while(iNum <= 100){
            System.out.print(iNum + " - ");
        iNum++;
        }
        System.out.println("CICLO DO WHILE ");
        int iNumm = 0;
        do{
        iNumm++;
            System.out.print(iNumm + " - ");
        
        
        
        }while(iNumm <= 99);
   
        
    }
    
}
