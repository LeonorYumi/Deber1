import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Registro de clientes------");
        String cedula, nombre, telefono, email;
        System.out.printf("Ingrese La cedula: ");
        cedula =scanner.nextLine();
        System.out.printf("Ingrese Los nombres: ");
        nombre = scanner.nextLine();
        System.out.printf("Ingrese el telefono: ");
        telefono = scanner.nextLine();
        System.out.printf("Ingrese el email: ");
        email = scanner.nextLine();

        if (cedula.isEmpty() || nombre.isEmpty() || telefono.isEmpty() || email.isEmpty()) {
            System.out.println("Los campos no pueden estar vacios.");
        }else{
            System.out.println("====Ficha del cliente ======");
            System.out.println("Cedula: "+cedula);
            System.out.println("Nombre: "+nombre);
            System.out.println("Telefono: "+telefono);
            System.out.println("Email: "+email);
        }
    }
}

