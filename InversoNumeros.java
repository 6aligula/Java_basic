// import java.util.Scanner; // Importamos la clase Scanner para leer desde la consola

// public class InversoNumeros {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada
//         int[] numeros = new int[10]; // Creamos un array de enteros para almacenar los 10 números

//         // Pedimos al usuario que introduzca 10 números
//         for (int i = 0; i < 10; i++) {
//             System.out.println("Introduce el número " + (i + 1) + ": ");
//             numeros[i] = scanner.nextInt(); // Guardamos cada número en el array
//         }

//         System.out.println("Los números en orden inverso son: ");
//         // Recorremos el array en orden inverso para mostrar los números
//         for (int i = 9; i >= 0; i--) {
//             System.out.print(numeros[i] + " ");
//         }

//         scanner.close(); // Cerramos el scanner
//     }
// }


//Con metodos:
import java.util.Scanner; // Importamos la clase Scanner para leer desde la consola

public class InversoNumeros {
    public static void main(String[] args) {
        int[] numeros = leerNumeros(); // Llamamos al método para leer los números
        mostrarInverso(numeros); // Llamamos al método para mostrar los números en orden inverso
    }

    // Método para leer 10 números del teclado y devolverlos en un array
    public static int[] leerNumeros() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        scanner.close();
        return numeros;
    }

    // Método para mostrar los números de un array en orden inverso
    public static void mostrarInverso(int[] numeros) {
        System.out.println("Los números en orden inverso son: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
