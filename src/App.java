import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Entrada inputHelper = new Entrada(scanner);
        MetodoOrdenamiento sorter = new MetodoOrdenamiento();

        int tamanio = inputHelper.LeerEnteros("Ingrese el tamaño del arreglo:", false);
        int[] arreglo = inputHelper.leerArreglo(tamanio);

        int[] arregloOrdenado = sorter.sortBubble(arreglo);

        System.out.println("Arreglo ordenado:");
        sorter.printArreglo(arregloOrdenado);

        scanner.close();
    }
}
