import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[4];
        double suma = 0;

        // Pedir al usuario que ingrese los números
        for (int i = 0; i < 4; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();// Guardamos cada número en el array
            suma += numeros[i];// Sumamos cada número a la suma total
        }

        // Calcular la media
        double media = suma / numeros.length;

        // Mostrar los números y la media
        System.out.println("\nLos números ingresados son:");
        for (double numero : numeros) {
            System.out.println(numero);
        }
        System.out.println("La media aritmética es: " + media);
    }
}

//version con Metodos:
// import java.util.Scanner;

// public class MediaAritmeticaConFunciones {

//     public static void main(String[] args) {
//         double[] numeros = pedirNumeros();
//         double media = calcularMedia(numeros);
//         mostrarResultados(numeros, media);
//     }

//     private static double[] pedirNumeros() {
//         Scanner scanner = new Scanner(System.in);
//         double[] numeros = new double[4];

//         for (int i = 0; i < 4; i++) {
//             System.out.print("Introduce el número " + (i + 1) + ": ");
//             numeros[i] = scanner.nextDouble();
//         }

//         return numeros;
//     }

//     private static double calcularMedia(double[] numeros) {
//         double suma = 0;
//         for (double numero : numeros) {
//             suma += numero;
//         }
//         return suma / numeros.length;
//     }

//     private static void mostrarResultados(double[] numeros, double media) {
//         System.out.println("\nLos números ingresados son:");
//         for (double numero : numeros) {
//             System.out.println(numero);
//         }
//         System.out.println("La media aritmética es: " + media);
//     }
// }

