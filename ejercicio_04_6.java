import java.util.Scanner;
public class ejercicio_04_6 {
    public static void main(String[] args){
        try (Scanner tri = new Scanner (System.in)) {
            int B, b, h;
            int l, m, n, o;
            int P, A;
            
            System.out.println("AREA DEL TRAPECIO");
            System.out.println("Ingrese el valor de la base mayor:");
            B=tri.nextInt();
            System.out.println("Ingrese el valor de la base menor:");
            b=tri.nextInt();
            System.out.println("Ingrese el valor de la altura:");
            h=tri.nextInt();
            A=(h*(B+b))/2;
            System.out.println("El Area es: "+A);
            System.out.println("================================");
            System.out.println("PERIMETRO DEL TRAPECIO");
            System.out.println("Ingrese el valor del lado 1");
            l=tri.nextInt();
            System.out.println("Ingrese el valor del lado 2");
            m=tri.nextInt();
            System.out.println("Ingrese el valor del lado 3");
            n=tri.nextInt();
            System.out.println("Ingrese el valor del lado 4");
            o=tri.nextInt();
            P=l+m+n+o;
            System.out.println("El Perimetro es: "+P);
        }
    }
}
