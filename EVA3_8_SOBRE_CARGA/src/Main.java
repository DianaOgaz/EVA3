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
    public static void main(String[] args) {
        // TODO code application logic here
        
         System.out.println(suma(5,8));
        System.out.println(suma());
        
        System.out.println("Hola");
        System.out.println(7);
        System.out.println(true);
        System.out.println(new Main()); //objeto
        System.out.println(suma(5, 8));
    }
    
    public static int suma(int iVal1, int iVal2)
    {
        return iVal1 + iVal2;
    }
    
    public static String suma(String sCade1, String sCabe2)
    {
        return sCade1 + sCabe2;
    
        
    
    }
   
}
