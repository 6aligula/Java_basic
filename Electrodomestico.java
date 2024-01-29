public class Electrodomestico {
    // Constantes
    private static final String COLOR_DEFECTO = "blanco";
    private static final char CONSUMO_ENERGETICO_DEFECTO = 'F';
    private static final double PRECIO_BASE_DEFECTO = 100;
    private static final double PESO_DEFECTO = 5;
    private static final String[] COLORES_DISPONIBLES = {"blanco", "negro", "rojo", "azul", "gris"};

    // Atributos
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    // Constructores
    public Electrodomestico() {
        this(PRECIO_BASE_DEFECTO, PESO_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, COLOR_DEFECTO);
    }

    public Electrodomestico(double precioBase, double peso) {
        this(precioBase, peso, CONSUMO_ENERGETICO_DEFECTO, COLOR_DEFECTO);
    }

    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.color = comprobarColor(color);
    }

    // Métodos get
    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    // Métodos privados para comprobación
    private char comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        if(letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return CONSUMO_ENERGETICO_DEFECTO;
        }
    }

    private String comprobarColor(String color) {
        for(String colorValido : COLORES_DISPONIBLES) {
            if(colorValido.equalsIgnoreCase(color)) {
                return colorValido;
            }
        }
        return COLOR_DEFECTO;
    }

    // Método precioFinal()
    public double precioFinal() {
        double incremento = 0;

        // Incremento por consumo energético
        switch(consumoEnergetico) {
            case 'A': incremento += 100; break;
            case 'B': incremento += 80; break;
            case 'C': incremento += 60; break;
            case 'D': incremento += 50; break;
            case 'E': incremento += 30; break;
            case 'F': incremento += 10; break;
        }

        // Incremento por tamaño
        if(peso >= 0 && peso < 20) incremento += 10;
        else if(peso >= 20 && peso < 50) incremento += 50;
        else if(peso >= 50 && peso <= 80) incremento += 80;
        else if(peso > 80) incremento += 100;

        return precioBase + incremento;
    }
}
