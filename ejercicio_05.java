import java.util.Scanner;
public class ejercicio_05 {
    public static void main(String[] args){
        
        try (Scanner por = new Scanner (System.in)) {
            int a,b,c,d,e;
            int multi;
            System.out.println("Ingrese lOs 5 numeros:");
            a = (int) Double.parseDouble(por.nextLine());
            b = (int) Double.parseDouble(por.nextLine());
            c = (int) Double.parseDouble(por.nextLine());
            d = (int) Double.parseDouble(por.nextLine());
            e = (int) Double.parseDouble(por.nextLine());
            multi = (int) (a*b*c*d*e);
                
            System.out.println("La multiplicacion de los 5 numeros es: "+multi);
        } catch (NumberFormatException e) {

            e.printStackTrace();
        }
    } 
}
