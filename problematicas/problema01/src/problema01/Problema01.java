/*
Problema01 (use ciclo do-while)
Generar una solución que permita ingresar jugadores de fútbol; por cada 
jugador se debe solicitar 
-nombre el jugador
-Posición en el campo de juego
-Edad
-Estatura
El ciclo de ingreso de información deberá terminar cuando el usuario lo decida. 
Se debe imprimir el siguiente reporte (usar una cadena de acumulación):
Listado de Jugadores
1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
4. Ángel Mena -Delantero-, edad 32, estatura 1.75
5. Michael Estrada -Delantero-, edad 27, estatura 1.93
Listado de Edades
32
24
19
32
27
Promedio de edades:  26.8
Promedio de estaturas: 1.87
*/
package problema01;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Oliver Saraguro
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
     
        // variables
        String nombre_jugador;
        String posicion_jugador;
        int edad;
        String edades = "";
        double estatura;
        boolean bandera = true;
        String salida = "";
        double suma1 = 0;
        double suma2 = 0;
        double promedio_edades;
        double promedio_estatura;
        int contador = 0;
        int salir;
           
        do{
            contador = contador +1;
            
            //Aqui se pide que Ingrese Informacion del Jugador.
            System.out.println("Ingrese el nombre del Jugador: ");
            nombre_jugador = entrada.nextLine();
            
            System.out.println("Ingrese la posicion de juego del Jugador: ");
            posicion_jugador = entrada.nextLine(); //Limpieza de buffer
            
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            edades = edades + edad + "\n";
            
        //Se acumula las edades en la variable suma1.
            suma1 = suma1 + edad;
            
            System.out.println("Ingrese la estatura del Jugador: ");
            estatura = entrada.nextDouble();
            //Se acumula las estaturas en la variable suma2.
            suma2 = suma2 + estatura;
        
            //Esta variable sirve para almacenar los datos de cada jugador
        salida = String.format("%s%d. %s -%s-, edad: %d, estatura: %s\n",
                salida,
                contador,
                nombre_jugador,
                posicion_jugador,
                edad,
                estatura);
       
        // Esto sirve para decirle al Usuario si quiere seguir ingresando datos
        // o ya quiere culminar el proceso.
            System.out.println("Ingrese '000' si desea terminar el proceso: ");
            salir = entrada.nextInt();
            
        //Esta condicion sirve si el usuario ingreso 000 para salir, bandera 
        // cambiara a falsa y terminara el proceso.
            if (salir == 000) {
                bandera = false;
            }
            
        // se limpia el buffer, pues el primer valor que se solicita al inicio 
        //del ciclo es una cadena    
            entrada.nextLine(); 
            
        }while(bandera);
                 
        // En este se saca el promedio total de todas las edades y estaturas 
        // ingresadas en el sistema.
        promedio_edades = (double)suma1 / contador;
        promedio_estatura = (double)suma2 / contador;
        
        System.out.printf("Listado de Jugadores\n%s"
                + "Listado de edades \n%s\n"
                + "Promedio de edades: %.2f\n"
                + "Promedio estaturas: %.2f\n", 
                salida,
                edades,
                promedio_edades,
                promedio_estatura);
    }
    
}
