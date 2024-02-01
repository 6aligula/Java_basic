
import java.util.Scanner;

public class NotasAlumnos {
    /*
     * Necesitamos crear un programa para almacenar las notas de 4 alumnos
        (llamados “Alumno1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las
        notas por teclado y luego el programa mostrará la nota mínima, máxima y media
        de cada alumno.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAlumnos = 4;
        int numeroAsignaturas = 5;
        double[][] notas = new double[numeroAlumnos][numeroAsignaturas];

        // Introducir notas por teclado
        for (int i = 0; i < numeroAlumnos; i++) {
            System.out.println("Introduciendo notas para Alumno " + (i + 1) + ":");
            for (int j = 0; j < numeroAsignaturas; j++) {
                System.out.print("Asignatura " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble(); // Asume que el usuario introduce valores válidos
            }
        }

        // Calcular y mostrar la nota mínima, máxima y media de cada alumno
        for (int i = 0; i < numeroAlumnos; i++) {
            double min = notas[i][0];
            double max = notas[i][0];
            double suma = 0;
            for (int j = 0; j < numeroAsignaturas; j++) {
                if (notas[i][j] < min) {
                    min = notas[i][j]; // Actualiza min si se encuentra una nota menor
                }
                if (notas[i][j] > max) {
                    max = notas[i][j]; // Actualiza max si se encuentra una nota mayor
                }
                suma += notas[i][j];
            }
            double media = suma / numeroAsignaturas;
            System.out.println("Alumno " + (i + 1) + ": Min = " + min + ", Max = " + max + ", Media = " + media);
        }
        
        scanner.close();
    }
}
