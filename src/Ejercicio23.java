import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        do {
            try{
                System.out.println("Número 1: ");
                int n1 = sc.nextInt();

                System.out.println("Numero 2: ");
                int n2 = sc.nextInt();

                double division = (double)n1 / (double)n2;

                if(n2 == 0){
                    throw new ArithmeticException("División por cero");
                } else {
                    System.out.println(n1 + "/" + n2 + " = " + division);
                    salir = true;
                }
            } catch (ArithmeticException e){
                System.out.println("\nNo se puede hacer la operación --> " + e.getMessage());
            }
        } while (!salir);
    }
}
