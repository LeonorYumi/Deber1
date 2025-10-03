import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stock, cantidad, total;
        System.out.println("Ingrese el stock del producto (plastico): ");
        stock = scanner.nextInt();
        System.out.println("Ingrese la cantidad del producto (plastico): ");
        cantidad = scanner.nextInt();
        total = stock + cantidad;
        System.out.println("El total del stock es: " + total);
    }
}

//comentario
