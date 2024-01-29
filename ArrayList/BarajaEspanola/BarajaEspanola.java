
/*
 * Realiza un programa que escoja al azar 10 cartas de la baraja española (10 objetos
de la clase Carta (numero, palo, nombre)). Emplea un objeto de la clase ArrayList
para almacenarlas y asegúrate de que no se repite ninguna.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Comparator;

public class BarajaEspanola {
    public static void main(String[] args) {
        ArrayList<Carta> cartasSeleccionadas = new ArrayList<>();
        Set<Carta> cartasUnicas = new HashSet<>();

        String[] palos = { "Oros", "Copas", "Espadas", "Bastos" };
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

        // Ordenar las cartas seleccionadas
        cartasSeleccionadas.sort(new CartaComparator());

        // Imprimir las cartas ordenadas
        System.out.println("10 cartas seleccionadas al azar y ordenadas:");
        for (Carta carta : cartasSeleccionadas) {
            System.out.println(carta);
        }

    }

    public static class CartaComparator implements Comparator<Carta> {
        private final static List<String> ordenPalos = Arrays.asList("Bastos", "Copas", "Espadas", "Oros");

        @Override
        public int compare(Carta c1, Carta c2) {
            int paloCompare = Integer.compare(ordenPalos.indexOf(c1.getPalo()), ordenPalos.indexOf(c2.getPalo()));
            if (paloCompare != 0) {
                return paloCompare;
            } else {
                // Asumiendo que el As es 1, y Sota, Caballo, Rey son 10, 11, 12 respectivamente
                return Integer.compare(c1.getNumero(), c2.getNumero());
            }
        }
    }

}
