import java.util.Scanner;
public class ejercicio_09 {
    public static void main(String[] args){
        //GABRIEL CHAUCA JOSTHEN ARIAN
        try (Scanner prom = new Scanner (System.in)) {
            double pi=3.14159265;
            double r=8.9, r2=6.7, r3=7.9;
            
            System.out.println("AREA 1");
            double A1= pi*(r*r);
            System.out.println("El area 1 es: "+A1);
            System.out.println("================================");
            System.out.println("AREA 2");
            double A2= pi*(r2*r2);
            System.out.println("El area 2 es: "+A2);
            System.out.println("================================");
            System.out.println("AREA 3");
            double A3= pi*(r3*r3);
            System.out.println("El area 3 es: "+A3);
            System.out.println("================================");
            double suma = A1+A2+A3;
            System.out.println("La suma de las Areas es: "+suma);
         } 
    }
}
