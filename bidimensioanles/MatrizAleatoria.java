import java.util.Random;

public class MatrizAleatoria {
    public static void main(String[] args) {
        // Dimensiones de la matriz
        int filas = 5;
        int columnas = 8;

        // Crear matriz de 5x8
        int[][] matriz = new int[filas][columnas];

        // Instancia de la clase Random para generar números aleatorios
        Random random = new Random();

        // Rellenar matriz con números aleatorios del 1 al 50
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // Generar número aleatorio del 1 al 50 y asignarlo a la matriz
                matriz[i][j] = 1 + random.nextInt(50);
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz generada de 5x8 con números aleatorios del 1 al 50:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }
}
