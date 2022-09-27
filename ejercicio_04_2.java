import java.util.Scanner;
public class ejercicio_04_2 {
    public static void main(String[] args){
        try (Scanner cdr = new Scanner (System.in)) {
            int l=0;
            int P=0, A=0;
            
            System.out.println("AREA Y PERIMETRO DEL CUADRADO");
            System.out.println("Ingrese el lado:");
            l=cdr.nextInt();
            
            A=l*l;
            P=4*l;
            
            System.out.println("El Area es: "+A);
            System.out.println("El Perimetro es: "+P);
        }
    }
}