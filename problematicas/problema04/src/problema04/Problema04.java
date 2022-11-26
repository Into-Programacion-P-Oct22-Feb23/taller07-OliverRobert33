
//Problema04 (use while)
//Generar, imprimir y obtenga el resultado de la serie:
//1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - 1/15
package problema04;

/**
 *
 * @author Oliver Saraguro
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //variables
        int contador = 1;
        int auxiliar = 3 ;
        String mensaje = "1";
        
        while(auxiliar <= 15){
            //
            if (auxiliar == 3 || auxiliar == 7 || auxiliar == 11 || 
                    auxiliar == 15){
                mensaje = mensaje + " " + "-" + contador + "/" + auxiliar;
                
            } else {
                mensaje = mensaje + " " + "+" + contador+ "/" + auxiliar;
            }
        auxiliar = auxiliar + 2;
        }     
        System.out.printf("%s\n", mensaje);
    }
    
}
