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
        ArrayList<Carta> cartasSeleccionadas = new ArrayList<>();
        Set<Carta> cartasUnicas = new HashSet<>();

        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        Random random = new Random();

        while (cartasUnicas.size() < 10) {
            int numero = random.nextInt(12) + 1;
            String palo = palos[random.nextInt(palos.length)];
            Carta nuevaCarta = new Carta(numero, palo);

            // Asegurarse de que no se repite ninguna carta
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
