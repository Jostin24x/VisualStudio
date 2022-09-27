import java.util.Scanner;
public class ejercicio_04_1 {
    public static void main(String[] args){
        try (Scanner tri = new Scanner (System.in)) {
            int b=0, h=0;
            int l=0, m=0, n=0;
            int P=0, A=0;
            
            System.out.println("AREA DEL TRIANGULO");
            System.out.println("Ingrese el valor de la base:");
            b=tri.nextInt();
            System.out.println("Ingrese el valor de la altura:");
            h=tri.nextInt();
            A=(b*h)/2;
            System.out.println("El Area es: "+A);
            System.out.println("================================");
            System.out.println("PERIMETRO DEL TRIANGULO");
            System.out.println("Ingrese el valor del lado 1");
            l=tri.nextInt();
            System.out.println("Ingrese el valor del lado 2");
            m=tri.nextInt();
            System.out.println("Ingrese el valor del lado 3");
            n=tri.nextInt();
            P=l+m+n;
            System.out.println("El Perimetro es: "+P);
        }
    }
}