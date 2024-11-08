import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ingreso;

        System.out.print("Ingrese un numero entero: ");
        ingreso = scanner.nextLine();

        try {
            int numero = Integer.parseInt(ingreso);
            System.out.println("El numero es: " + numero);
        }
        catch (NumberFormatException e) {
            System.out.println("Intentaste ingresar algo distinto a un numero entero!");
        } finally {
            scanner.close();
        }
    }
}