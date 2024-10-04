import java.util.Scanner;

public class Entrada {
    private Scanner scanner;

    public Entrada(Scanner scanner) {
        this.scanner = scanner;
    }

    public int LeerEnteros(String mensaje, boolean permitirNegativos) {
        int valor;
        do {
            System.out.println(mensaje);
            while (!scanner.hasNextInt()) {
                System.out.println("Ingrese correctamente un número entero:");
                scanner.next();
            }
            valor = scanner.nextInt();
            if (!permitirNegativos && valor <= 0) {
                System.out.println("El tamaño debe ser un entero positivo.");
            }
        } while (!permitirNegativos && valor <= 0);

        return valor;
    }

    public int[] leerArreglo(int tamanio) {
        int[] arreglo = new int[tamanio];
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < tamanio; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ingrese correctamente un número entero:");
                scanner.next();
            }
            arreglo[i] = scanner.nextInt();
        }
        return arreglo;
    }
}
