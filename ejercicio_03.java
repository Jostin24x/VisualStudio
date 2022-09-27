import java.util.Scanner;
public class ejercicio_03 {
    public static void main(String[] args){
        //GABRIEL CHAUCA JOSTHEN ARIAN
        try (Scanner digitar = new Scanner (System.in)) {
            int suma=0;
            
            for (int i=0; i<5; i++){
                System.out.println("Introduce el numero:");
                int n = digitar.nextInt();
                suma = suma + n;
            }
            System.out.println("La suma es:" +suma);
        }
    } 
}
