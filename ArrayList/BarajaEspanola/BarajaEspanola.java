
/*
 * Realiza un programa que escoja al azar 10 cartas de la baraja española (10 objetos
de la clase Carta (numero, palo, nombre)). Emplea un objeto de la clase ArrayList
para almacenarlas y asegúrate de que no se repite ninguna.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BarajaEspanola {
    public static void main(String[] args) {
        // Crea una lista dinámica para almacenar las cartas seleccionadas
        ArrayList<Carta> cartasSeleccionadas = new ArrayList<>();

        // Crea un conjunto para asegurar que las cartas sean únicas (sin duplicados)
        //En Java, un Set es una colección que no permite elementos duplicados. Esto significa que cada objeto Carta 
        //puede aparecer en el conjunto cartasUnicas como máximo una vez, garantizando la unicidad de los elementos 
        //dentro de esta colección
        Set<Carta> cartasUnicas = new HashSet<>();

        // Define un arreglo con los nombres de los palos de la baraja española
        String[] palos = { "Oros", "Copas", "Espadas", "Bastos" };

        // Crea un generador de números aleatorios
        Random random = new Random();

        // Inicia un bucle que continúa hasta que se seleccionan 10 cartas únicas
        while (cartasUnicas.size() < 10) {
            // Genera un número al azar entre 1 y 12 para la carta
            int numero = random.nextInt(12) + 1;

            // Elige un palo al azar de los disponibles en el arreglo de palos
            String palo = palos[random.nextInt(palos.length)];

            // Crea una nueva carta con el número y palo seleccionados
            Carta nuevaCarta = new Carta(numero, palo);

            // Intenta añadir la nueva carta al conjunto de cartas únicas
            // Si la carta no estaba previamente en el conjunto, la añade también a la lista
            // de cartas seleccionadas
            if (cartasUnicas.add(nuevaCarta)) {
                cartasSeleccionadas.add(nuevaCarta);
            }
        }

        // Imprimir las cartas seleccionadas
        System.out.println("10 cartas seleccionadas al azar:");
        for (Carta carta : cartasSeleccionadas) {
            System.out.println(carta);
        }
    }
}
