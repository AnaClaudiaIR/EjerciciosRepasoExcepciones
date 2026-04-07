import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio25 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("enteros.txt"))) {
            List<Integer> numeros = new ArrayList<>();
            String linea;
            while ((linea = br.readLine()) != null) {
                    if (!linea.isEmpty()) {
                        try {
                            numeros.add(Integer.parseInt(linea));
                        } catch (NumberFormatException e) {
                            System.out.println("Carácter no númerico: " + linea);
                        }
                    }
                }
            System.out.println("\nNúmeros");
            for (Integer i : numeros) {
                System.out.print(i.toString()+" ");
            }
            int suma = 0;
            int max = numeros.getFirst();
            int min = numeros.getFirst();
            for (int i : numeros) {
                suma += i;
                if (max < i) {
                    max = i;
                }
                if (min > i) {
                    min = i;
                }
            }
            System.out.println(" ");
            System.out.println("\nSuma: " + suma);
            System.out.println("Máximo: " + max);
            System.out.println("Mínimo: " + min);

            } catch (IOException e) {
            System.out.println("Error al leer el archivo --> " +e.getMessage());
        }
    }
}
