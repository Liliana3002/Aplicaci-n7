/*Construir un programa que dado un número total de horas 
devuelva el número de semanas, días y horas equivakentes.
Por ejemplo, dado dado un total de 100o horas, 
debe mostrar 5 semanas, 6 días y 16 horas*/
package appli_eje7;

import java.util.Scanner;

public class Appli_Eje7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horasT, semas, dias, horas; //Se declara las variables
        
        //Entrada de dayos
        System.out.println("Digite el número de horas: ");
        horasT = entrada.nextInt();
        
        //Cálculo de semanas, días y horas de la información ingresada
        semas = horasT/168;
        dias = horasT%168/24;
        horas = horasT%24;
        
        //Mostrar los resultados obtenidos
        System.out.println("\nEl equivalente es: ");
        System.out.println("Semanas: "+semas);
        System.out.println("Días: "+dias);
        System.out.println("Horas: "+horas);
    }
    
}
