
/*
 * Realiza un programa que escoja al azar 10 cartas de la baraja española (10 objetos
de la clase Carta (numero, palo, nombre)). Emplea un objeto de la clase ArrayList
para almacenarlas y asegúrate de que no se repite ninguna.
 */
import java.util.Objects;

public class Carta {
    private int numero;
    private String palo;
    private String nombre;

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
        this.nombre = numero + " de " + palo;
    }

    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * Sobrescribe el método toString de la clase Object para proporcionar una
     * representación textual específica de una instancia de Carta.
     * Este método facilita la visualización de los atributos de la carta (número y
     * palo) en una forma legible,
     * siendo especialmente útil para imprimir directamente los objetos Carta o para
     * depuración.
     *
     * @return Una cadena de texto que representa la carta, combinando su número y
     *         palo.
     */
    @Override
    public String toString() {
        return nombre;
    }

    /**
     * Determina si otra instancia de objeto es "igual" a esta instancia de Carta.
     * Dos cartas se consideran iguales si tienen el mismo número y el mismo palo.
     * Este método es crucial para el manejo de colecciones de cartas, como sets y
     * maps,
     * permitiendo identificar y eliminar duplicados de manera efectiva.
     *
     * @param obj El objeto con el que se va a comparar la instancia actual.
     * @return true si el objeto proporcionado es una instancia de Carta con el
     *         mismo número y palo que esta carta; de lo contrario, false.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Carta carta = (Carta) obj;
        return numero == carta.numero && palo.equals(carta.palo);
    }

    /**
     * Genera un código hash para una instancia de Carta.
     * El código hash generado es consistente con el método equals, asegurando que
     * dos cartas iguales producirán el mismo código hash.
     * Esto es esencial para el correcto funcionamiento de la carta dentro de
     * colecciones que dependen de hashes, como HashSet y HashMap,
     * facilitando operaciones como la adición, eliminación y verificación de
     * existencia de cartas en estas colecciones.
     *
     * @return Un entero que representa el código hash calculado a partir del número
     *         y palo de la carta.
     */
    @Override
    public int hashCode() {
        return Objects.hash(numero, palo);
    }

}
