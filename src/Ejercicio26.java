import java.io.IOException;
import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        do {
            try {
                System.out.println("Introduce el numero: ");
                int n = sc.nextInt();

                if (n<=0) {
                    throw new IllegalArgumentException("El número debe ser mayor que 0.");
                } else {
                    int[] numeros = new int[n];
                    for (int i = 0; i < n; i++) {
                        numeros[i] = (int) (Math.random() * 50);
                    }
                    for (int i = 0; i < n; i++) {
                        System.out.print(numeros[i]+" ");
                    }
                    salir = true;
                }
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        } while(!salir);
    }
}
