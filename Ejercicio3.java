import java.util.Scanner;
public class Ejercicio3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar edad
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            // Solicitar altura
            System.out.print("Ingrese su altura en metros: ");
            double altura = scanner.nextDouble();

            // Validar que los datos sean positivos
            if (edad <= 0 || altura <= 0) {
                System.out.println("Error: La edad y la altura deben ser valores positivos.");
            } else {
                // Verificar si cumple los requisitos
                if (edad >= 18 && altura >= 1.60) {
                    System.out.println("Cumple con los requisitos para el cuartel.");
                } else {
                    System.out.println("No cumple con los requisitos para el cuartel.");
                }
            }

        }
    }

