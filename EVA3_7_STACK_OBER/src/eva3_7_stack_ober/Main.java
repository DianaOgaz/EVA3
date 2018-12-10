/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_7_stack_ober;

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
        miStackOverFlow();
    }
    //RECURSIVIDAD - SE ACABA LA MEMORIA (STACK OVERFLOW)
    public static void miStackOverFlow()
    {
        System.out.println("Holiwi :3");
        miStackOverFlow(); 
    }
}
