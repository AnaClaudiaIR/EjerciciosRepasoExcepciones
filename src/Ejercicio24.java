import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            boolean salir = false;

            do {
                System.out.println("Nombre del fichero: ");
                String fichero = sc.nextLine();

                try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                    String line;
                    int contador = 0;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                        contador++;
                    }
                    System.out.println("\nEl archivo tiene " + contador + " líneas.");
                    salir = true;
                } catch (FileNotFoundException e){
                    System.out.println("No se ha encontrado el fichero --> " + e.getMessage());
                } catch (IOException e){
                    System.out.println("Error al leer el fichero --> " + e.getMessage());
                }
            } while (!salir);
    }
}

