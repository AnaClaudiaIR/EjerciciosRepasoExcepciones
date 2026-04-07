import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int numero = 0;
       do {
           try {
               System.out.println("Número: ");
               numero = sc.nextInt();

               System.out.println("Número: "+ numero);
               salir = true;

           } catch (InputMismatchException e) {
               System.out.println("Error: Introduce un número válido --> " + e.getMessage());
               sc.nextLine();
           }
       } while (!salir);
        sc.close();
    }
}
