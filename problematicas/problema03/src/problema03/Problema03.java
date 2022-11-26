/*
Problema03 (use do-while)
Generar e imprimir la siguiente serie:
2
5
10
17
26
37
 */
package problema03;

/**
 *
 * @author Oliver Saraguro
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        int contador = 2;
        int auxiliar = 3;
        String salida = "";
        
        do{
            salida = salida + contador + "\n";
            contador = contador + auxiliar;
            auxiliar = auxiliar + 2;
    
        }while(contador <= 37);
        
        System.out.printf("%s\n", salida);
    }
    
}
