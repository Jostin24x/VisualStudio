import java.util.Scanner;
public class ejercicio_10 {
    public static void main(String[] args){
        //GABRIEL CHAUCA JOSTHEN ARIAN
        try (Scanner prom = new Scanner (System.in)) {
            double pi=3.14159265;
            double r=18.9, r2=16.7, r3=71.9, r4=4.6, r5=6.7;
            double r6=5.6, r7=4.7, r8=10;
            
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
            System.out.println("AREA 4");
            double A4= pi*(r4*r4);
            System.out.println("El area 4 es: "+A4);
            System.out.println("================================");
            System.out.println("AREA 5");
            double A5= pi*(r5*r5);
            System.out.println("El area 5 es: "+A5);
            System.out.println("================================");
            System.out.println("AREA 6");
            double A6= pi*(r6*r6);
            System.out.println("El area 6 es: "+A6);
            System.out.println("================================");
            System.out.println("AREA 7");
            double A7= pi*(r7*r7);
            System.out.println("El area 7 es: "+A7);
            System.out.println("================================");
            System.out.println("AREA 8");
            double A8= pi*(r8*r8);
            System.out.println("El area 8 es: "+A8);
            System.out.println("================================");
            double suma = A1+A2+A3+A4+A5+A6+A7+A8;
            System.out.println("La suma de las Areas es: "+suma);
         } 
    }
}
