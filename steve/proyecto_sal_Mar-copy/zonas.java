
/**
 * Write a description of class zonas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class zonas{   
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int afectacion;
        String ciudad;
        int cont = 0;
        int cont1 = 0;
        String nombre;
        int sal_mar;
        System.out.println("digite nombre paciente");
        nombre = sc.next();
        System.out.println("presenta sintomas 1 = si o 2 = no? ");
        afectacion = sc.nextInt();
        System.out.println("digite consumos diario de sal de mar entre  1 a 10 siendo 10 alto consumo siendo 1 casi nada");
        sal_mar = sc.nextInt();
        if (sal_mar>6) {
            System.out.println("su nivel de sal marina esta niveles optimos");
            if (afectacion==2) {
                System.out.println("esta en condiciones optimas de salud");
                System.out.println("es de bogota?");
                ciudad = sc.next();
                if (ciudad.equals("si")) {
                    cont = +1;
                } else {
                    cont1 = +1;
                }
            }
            else
            {
                System.out.println("es de bogota?");
                ciudad = sc.next();
                if (ciudad.equals("si")) {
                    cont = +1;
                } else {
                    cont1 = +1;
                }
            }
        } else {
            System.out.println("su nivel de consumo de sal marina estan muy bajos");
            if (afectacion==1) {
                System.out.println("sus niveles de salud son malos debido al poco consumo de sal marina");
                System.out.println("es de bogota?");
                ciudad = sc.next();
                if (ciudad.equals("si")) {
                    cont = +1;
                } else {
                    cont1 = +1;
                }
            }
        }
        if (cont > cont1){
            System.out.println("la zona mas afectada es bogota");
        } else {
            System.out.println("los alrededores de bogota estan mas afectados");
        }
    }
}
   

