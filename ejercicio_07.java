import java.util.Scanner;
public class ejercicio_07 {
    public static void main(String[] args){
        //GABRIEL CHAUCA JOSTHEN ARIAN
        try (Scanner prom = new Scanner (System.in)) {
            int suma1=0;
            int suma2=0;
        
            for (int i=1; i<6; i++){
            System.out.println("Introduce el numero:");
            int n = prom.nextInt();
            suma1 = suma1 + n;
            }
            for (int i=6; i<11; i++){
            System.out.println("Introduce el numero:");
            int n = prom.nextInt();
            suma2 = suma2 + n;
            }
            int total = suma1*suma2;
            System.out.println("La suma es:" +total);

         } 
    }
}