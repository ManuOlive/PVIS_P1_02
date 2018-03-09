/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa08;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class HorasdeTrabajoMixto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int dias,he = 0,hs = 0,mine = 0,mins = 0,se = 0,ss = 0;
        int horas,minutos,segundos;
        int sumahe=0, sumahs=0,sumamine=0, sumamins=0,sumase=0,sumass=0;
        System.out.println("¿Cuantos dias trabajo? ");
        dias=entrada.nextInt();
        for (int i=0; i<dias;i++){
            System.out.println("Hora de entrada de este dia ");
            he=entrada.nextInt();
            sumahe=sumahe+he;
            System.out.println("Hora de salida de este dia: ");
            hs=entrada.nextInt();
            sumahs=sumahs+hs;
            System.out.println("Minuto de entrada de este dia ");
            mine=entrada.nextInt();
            sumamine=sumamine+mine;
            System.out.println("Minuto de salida de este dia ");
            mins=entrada.nextInt();
            sumamins=sumamins+mins;
            System.out.println("Segundo de entrada de este dia: ");
            se=entrada.nextInt();
            sumase=sumase+se;
            System.out.println("Segundo de salida de este dia: ");
            ss=entrada.nextInt();
            sumass=sumass+ss;
        }
        if (sumase>sumass){
            sumass=sumass+60;
            sumamins=sumamins-1;
        }
        segundos=sumass-sumase;
        if (sumamine>sumamins){
            sumamins=sumamins+60;
            sumahs=sumahs-1;        
        }
        minutos=sumamins-sumamine;
        horas=sumahs-sumahe;
        System.out.println(String.format("El tiempo es: %d %d %d",horas,minutos,segundos));
    }
    
}
