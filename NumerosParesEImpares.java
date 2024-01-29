import java.util.Random; // Importamos la clase Random para generar números aleatorios

public class NumerosParesEImpares {
    public static void main(String[] args) {
        /*
         * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y
         * que los almacene en un array. El programa debe ser capaz de pasar todos los
         * números pares a las primeras posiciones del array (del 0 en adelante) y todos los
         * números impares a las celdas restantes. Utiliza arrays auxiliares si es necesario.
         */
        Random rnd = new Random(); // Creamos un objeto Random
        int[] numeros = new int[20]; // Array para almacenar los números aleatorios
        int[] pares = new int[20]; // Array para almacenar los números pares
        int[] impares = new int[20]; // Array para almacenar los números impares
        int contadorPares = 0, contadorImpares = 0; // Contadores para pares e impares

        // Generamos números aleatorios y clasificamos pares e impares
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(101); // Números aleatorios entre 0 y 100
            if (numeros[i] % 2 == 0) { // Si el número es par
                pares[contadorPares++] = numeros[i];
            } else { // Si el número es impar
                impares[contadorImpares++] = numeros[i];
            }
        }

        // Combinamos los arrays de pares e impares de vuelta en el array original
        /*
         * System.arraycopy(pares, 0, numeros, 0, contadorPares);

            pares: Es el array fuente desde donde queremos copiar los elementos. En este caso, contiene los números pares.
            0: Es el índice inicial en el array fuente desde donde empezaremos a copiar. 
            Estamos empezando desde el principio del array pares.

            numeros: Es el array destino donde queremos copiar los elementos. Aquí es el array original que queremos reordenar.
            0: Es el índice inicial en el array destino donde colocaremos los elementos copiados. 
            También estamos empezando desde el principio del array numeros.
            contadorPares: Es la cantidad de elementos que queremos copiar. 
            Este valor indica cuántos números pares hemos encontrado y almacenado en el array pares.
         */
        /*
         * System.arraycopy(impares, 0, numeros, contadorPares, contadorImpares);

            impares: Es el array fuente desde donde copiaremos los números impares.
            0: Empezamos desde el principio del array impares.

            numeros: De nuevo, este es nuestro array destino.

            contadorPares: Aquí es donde esta llamada difiere de la anterior. En lugar de empezar en el índice 0 del array destino, 
            comenzamos en el índice contadorPares. Esto es porque ya hemos llenado las primeras contadorPares posiciones del 
            array numeros con números pares, y queremos continuar justo después del último número par.

            contadorImpares: La cantidad de elementos impares a copiar en el array numeros.
         */
        System.arraycopy(pares, 0, numeros, 0, contadorPares);
        System.arraycopy(impares, 0, numeros, contadorPares, contadorImpares);

        // Mostramos el array resultante
        System.out.println("Array con pares primero y luego impares:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}

/*
 * System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
 * src: array fuente.
    srcPos: posición inicial en el array fuente.
    dest: array destino.
    destPos: posición inicial en el array destino.
    length: número de elementos a copiar.

 */
