
import java.util.Scanner;

public class Resultado {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el segundo: ");
        Integer seg = entrada.nextInt();
        System.out.println("Ingrese el minuto: ");
        Integer min = entrada.nextInt();
        System.out.println("Ingrese la hora: ");
        Integer hor = entrada.nextInt();
        Hora ho = new Hora(seg,min,hor);
        System.out.println("Ingrese el dia: ");
        Integer di = entrada.nextInt();
        System.out.println("Ingrese el mes: ");
        Integer mess = entrada.nextInt();
        System.out.println("Ingrese el año: ");
        Integer ani = entrada.nextInt();
        Fecha fe = new Fecha (di,mess,ani);
        Reloj rej = new Reloj(fe,ho);
        while(true){
            rej.aumentar();
            System.out.println(rej);
        }
    }
}
