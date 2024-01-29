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

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Carta carta = (Carta) obj;
        return numero == carta.numero && palo.equals(carta.palo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, palo);
    }
}
