
/**
 * Write a description of class zonaspoo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class zonaspoo
{

   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        zonasClasspoo zonas = new zonasClasspoo();
        System.out.println("digite nombre paciente");
        zonas.nombre = sc.next();
        System.out.println("presenta sintomas 1 = si o 2 = no? ");
        zonas.afectacion = sc.nextInt();
        System.out.println("digite consumos diario de sal de mar entre  1 a 10 siendo 10 alto consumo siendo 1 casi nada");
        zonas.sal_mar = sc.nextInt();
        if (zonas.sal_mar>6) {
            System.out.println("su nivel de sal marina esta niveles optimos");
            if (zonas.afectacion==2) {
                System.out.println("esta en condiciones optimas de salud");
                System.out.println("es de bogota?");
                zonas.ciudad = sc.next();
                if (zonas.ciudad.equals("si")) {
                    zonas.cont = +1;
                } else {
                    zonas.cont1 = +1;
                }
            }
            else
            {
                System.out.println("es de bogota?");
                zonas.ciudad = sc.next();
                if (zonas.ciudad.equals("si")) {
                    zonas.cont = +1;
                } else {
                    zonas.cont1 = +1;
                }
            }
        } else {
            System.out.println("su nivel de consumo de sal marina estan muy bajos");
            if (zonas.afectacion==1) {
                System.out.println("sus niveles de salud son malos debido al poco consumo de sal marina");
                System.out.println("es de bogota?");
                zonas.ciudad = sc.next();
                if (zonas.ciudad.equals("si")) {
                    zonas.cont = +1;
                } else {
                    zonas.cont1 = +1;
                }
            }
        }
        if (zonas.cont > zonas.cont1){
            System.out.println("la zona mas afectada es bogota");
        } else {
            System.out.println("los alrededores de bogota estan mas afectados");
        }
    }
   


}
