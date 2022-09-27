import java.util.Scanner;
public class ejercicio_06 {
    public static void main(String[] args){
        //GABRIEL CHAUCA JOSTHEN ARIAN
        try (Scanner nota = new Scanner (System.in)) {
            double a,b,c,d,e;
            double prom;
            System.out.println("Ingrese las 5 calificaciones");
            a = Double.parseDouble(nota.nextLine());
            b = Double.parseDouble(nota.nextLine());
            c = Double.parseDouble(nota.nextLine());
            d = Double.parseDouble(nota.nextLine());
            e = Double.parseDouble(nota.nextLine());
            prom = (a+b+c+d+e)/5;
            System.out.println("El promedio de las 5 calificaciones es: "+prom);
            if ((prom>=10)) {
                    System.out.println("El alumno aprobo el curso");
            } else {
                    System.out.println("El alumno no aprobo el curso");
            }

         } 
    }
}