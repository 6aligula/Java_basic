import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GeneradorNumerosAleatorios {
    /**
     * Escribe un programa que genere números enteros aleatorios entre 0 y 100 hasta
        que salga el número “50” y que los almacene en un ArrayList. El programa debe
        ser capaz de pasar todos los números pares a las primeras posiciones del
        ArrayList (del 0 en adelante) y todos los números impares a las celdas restantes.
        Utiliza auxiliares si es necesario.
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        // Genera números aleatorios hasta que salga el 50
        int numero;
        do {
            numero = random.nextInt(101); // Números entre 0 y 100
            numeros.add(numero);
        } while (numero != 50);

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        // Separa los números en pares e impares
        for (int n : numeros) {
            if (n % 2 == 0) {
                pares.add(n);
            } else {
                impares.add(n);
            }
        }

        // Agrega primero los pares y luego los impares al ArrayList original
        numeros.clear();
        numeros.addAll(pares);
        numeros.addAll(impares);

        
        // Imprime el ArrayList resultante
        System.out.println(numeros + "\n logitud: " + numeros.size() + "\n  pares: " + pares.size() + "\n  impares: " + impares.size());
        //System.out.println(Collections.sort(numeros));
    }
}
