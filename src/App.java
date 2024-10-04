import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        MetodoOrdenamiento mO = new MetodoOrdenamiento();
        //int[] arreglo1 = {5, 1, 10, -12, 0};
        //int[] arreglo1 = {1,2, 3, 6, 8};
        //mO.sortBubbleAva(arreglo1);
        //mO.printArreglo(arreglo1);

        Scanner sc = new Scanner(System.in);

        int tamanio = 0;
        do {
            System.out.println("Ingrese el tamaño del arreglo (debe ser un entero positivo):");
            while (!sc.hasNextInt()) {
                System.out.println("Por favor, ingrese un entero válido.");
                sc.next(); 
            }
            tamanio = sc.nextInt();
            if (tamanio <= 0) {
                System.out.println("El tamaño debe ser un entero positivo.");
            }
        } while (tamanio <= 0);

        int[] arreglo2 = new int[tamanio];

        System.out.println("Ingrese los valores del arreglo:");
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Valor para la posición " + (i + 1) + ":");
            while (!sc.hasNextInt()) {
                System.out.println("Por favor, ingrese un entero válido.");
                sc.next(); // Limpiamos la entrada incorrecta
            }
            arreglo2[i] = sc.nextInt();
        }

        mO.sortBubbleAva(arreglo2);

        System.out.println("Arreglo ordenado:");
        mO.printArreglo(arreglo2);

        sc.close();
    }
}