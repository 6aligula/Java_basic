public class TestElectrodomesticos {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        // Inicializar con diferentes tipos de electrodomésticos
        electrodomesticos[0] = new Electrodomestico();
        electrodomesticos[1] = new Electrodomestico(200, 20);
        electrodomesticos[2] = new Electrodomestico(300, 60, 'A', "negro");
        // ... otros electrodomésticos ...

        double precioTotal = 0;
        for(Electrodomestico electrodomestico : electrodomesticos) {
            if(electrodomestico != null) {
                precioTotal += electrodomestico.precioFinal();
            }
        }

        System.out.println("Precio total de los electrodomésticos: " + precioTotal);
    }
}