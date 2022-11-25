/*
 * * Generar una solución que permita ingresar jugadores de fútbol; por cada 
    jugador se debe solicitar:
	-	Nombre el jugador
	- 	Posición en el campo de juego
	- 	Edad
		
    El ciclo de ingreso de información deberá terminar cuando el usuario lo 
    decida.Se debe imprimer el siguiente reporte 
    (usar una cadena de acumulación):

    > Listado de Jugadores
    1. Alexander Dominguez -Arquero-, edad 32
    2. Xavier Arreaga -Defensa-, edad 24
    3. Moisés Caicedo -Mediocentro-, edad 19
    4. Ángel Mena -Delantero-, edad 32
    5. Michael Estrada -Delantero-, edad 27
    Promedio de edades:  26.8
    
 */
package ejemplos07;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaReporte = "";
        String nombreJugador;
        String posicionCampo;
        
        int edad;
        boolean bandera = true;
        String salir;
        // variable acumuladoras
        int sumaEdades = 0;
        
        // contador para saber el número de iteraciones
        int contadorIteraciones = 0;
        // variables para promedio
        double promedioEdad;
        double promedioEstatura;
        cadenaReporte = String.format("%s%s\n", cadenaReporte, 
                "Listado de Jugadores");
        
        while(bandera){
            System.out.println("Ingrese el nombre del Jugador: ");
            nombreJugador = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo: ");
            posicionCampo = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
                       
            // sumo la edad a sumaEdades
            sumaEdades = sumaEdades + edad;
            
            // agrego una iteración
            contadorIteraciones = contadorIteraciones + 1; // primera(0+1=1)
            
            // Ejmplo 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
            cadenaReporte = String.format("%s%d.) %s -%s-, edad %d\n",
                    cadenaReporte,
                    contadorIteraciones,
                    nombreJugador,
                    posicionCampo,
                    edad);
            
            entrada.nextLine(); //
            System.out.println("Desea salir del ciclo; digite: si");
            salir = entrada.nextLine();
            if(salir.equals("si")){
                bandera = false;
            }
        }
        
        promedioEdad = (double)sumaEdades/contadorIteraciones;
        
        // Promedio de edades:  
        cadenaReporte = String.format("%sPromedio de edades: %.2f\n", 
                cadenaReporte, promedioEdad);
        
        // presentación de cadena final
        System.out.printf("%s\n", cadenaReporte);
        
    }
}
