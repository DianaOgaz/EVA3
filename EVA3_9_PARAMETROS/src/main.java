/*
 * Paso por valor --> copia de datos
Paso por referencia --> La direccion ram
 */

/**
 *
 * @author Diana Ogaz 18550698
 */
public class main { //tipo de dato abstracto

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(new main());
        int x;
        main mObjeto = new main();
        UnaClase ucObjeto2 = new UnaClase();
        System.out.println(ucObjeto2);
        
        
        ///
        int iValor = 5;
        incrementa(iValor);
        System.out.println("El valor es " + iValor);
        
        Valor vObjetoValor = new Valor();
        vObjetoValor.iValor = 5;
        incrementa(vObjetoValor);
        
        System.out.println("El valor 2 es " + vObjetoValor.iValor);
        
    }

public static void incrementa(int iVal)
{
iVal++;

}

public static void incrementa(Valor vValor)
{
vValor.iValor++;

}
    
}



class UnaClase
{

}
class Valor 
{
    int iValor;
}