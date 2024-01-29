// import java.util.Random; // Importamos la clase Random para generar números aleatorios

// public class ArraysNumeros {
//     public static void main(String[] args) {
//         int[] numero = new int[20]; // Array para almacenar los números aleatorios
//         int[] cuadrado = new int[20]; // Array para almacenar los cuadrados de los números
//         int[] cubo = new int[20]; // Array para almacenar los cubos de los números

//         Random rnd = new Random(); // Creamos un objeto Random para generar números aleatorios

//         // Rellenamos el array numero y calculamos cuadrado y cubo para cada elemento
//         for (int i = 0; i < numero.length; i++) {
//             numero[i] = rnd.nextInt(101); // Números aleatorios entre 0 y 100
//             cuadrado[i] = numero[i] * numero[i]; // Calculamos el cuadrado
//             cubo[i] = numero[i] * numero[i] * numero[i]; // Calculamos el cubo
//         }

//         // Mostramos los tres arrays
//         System.out.printf("%-10s %-10s %-10s\n", "Numero", "Cuadrado", "Cubo");
//         for (int i = 0; i < numero.length; i++) {
//             System.out.printf("%-10d %-10d %-10d\n", numero[i], cuadrado[i], cubo[i]);
//         }
//     }
// }

//con metodos
import java.util.Random; // Importamos la clase Random para generar números aleatorios

public class ArraysNumeros {
    public static void main(String[] args) {
        /*
         * En Java, cuando pasas un array a un método, estás pasando la referencia a ese array, no una copia del mismo.
         * Esto significa que cualquier cambio que hagas en el array dentro del método afectará al array original que se pasó.
         * Esto se conoce como "pasar por referencia". En contraste, si pasas un tipo de dato primitivo (como int, double, char, etc.),
         * estás pasando una copia del valor, conocido como "pasar por valor".
         */
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        llenarArrayAleatorio(numero);
        calcularCuadrados(numero, cuadrado);
        calcularCubos(numero, cubo);
        mostrarResultados(numero, cuadrado, cubo);
    }

    // Método para llenar un array con números aleatorios
    public static void llenarArrayAleatorio(int[] array) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(101); // Números aleatorios entre 0 y 100
        }
    }

    // Método para calcular los cuadrados de los números de un array
    public static void calcularCuadrados(int[] numero, int[] cuadrado) {
        for (int i = 0; i < numero.length; i++) {
            cuadrado[i] = numero[i] * numero[i];
        }
    }

    // Método para calcular los cubos de los números de un array
    public static void calcularCubos(int[] numero, int[] cubo) {
        for (int i = 0; i < numero.length; i++) {
            cubo[i] = numero[i] * numero[i] * numero[i];
        }
    }

    // Método para mostrar los números, sus cuadrados y cubos
    public static void mostrarResultados(int[] numero, int[] cuadrado, int[] cubo) {
        System.out.printf("%-10s %-10s %-10s\n", "Numero", "Cuadrado", "Cubo");
        for (int i = 0; i < numero.length; i++) {
            System.out.printf("%-10d %-10d %-10d\n", numero[i], cuadrado[i], cubo[i]);
        }
    }
}
