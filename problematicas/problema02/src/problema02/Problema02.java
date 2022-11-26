/*
Generar e imprimir la siguiente serie:
2
6
12
20
30
42
56
72
90
110
 */

package problema02;

/**
 *
 * @author Oliver Saraguro
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 2;
        int auxiliar = 4;
        String salida = "";
        
        while(contador <= 110){
            salida = salida + contador + "\n";
            
            contador = contador + auxiliar;
            auxiliar = auxiliar + 2;
        }
        
        System.out.printf("%s\n", salida);
        
    }
    
}
