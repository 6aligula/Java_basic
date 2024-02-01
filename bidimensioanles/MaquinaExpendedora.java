import java.util.Scanner;

public class MaquinaExpendedora {
    static String[][] nombre = {
            { "KitKat", "Chicles de fresa", "Lacasitos", "Palotes" },
            { "Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix" },
            { "Kinder Choco", "M&M'S", "Papa Delta", "Chicles de menta" },
            { "Chicles Sandia", "Crunch", "Milkybar", "KitKat Blanco" }
    };
    static double[][] precio = {
            { 1.1, 0.8, 1.5, 0.9 },
            { 1.8, 1, 1.2, 1 },
            { 1.8, 1.3, 1.2, 0.8 },
            { 1.5, 1.1, 1.1, 1.1 }
    };
    static int[][] cantidad = new int[nombre.length][nombre[0].length];
    static double ventasTotales = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inicializarCantidad(); // Inicializa la cantidad de cada golosina a 5
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    pedirGolosina(scanner);
                    break;
                case 2:
                    mostrarGolosinas();
                    break;
                case 3:
                    rellenarGolosinas(scanner);
                    break;
                case 4:
                    System.out.println("Ventas totales: " + ventasTotales);
                    System.out.println("Apagando máquina...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
        scanner.close();
    }

    public static void inicializarCantidad() {
        for (int i = 0; i < cantidad.length; i++) {
            for (int j = 0; j < cantidad[i].length; j++) {
                cantidad[i][j] = 5; // Cantidad inicial de cada golosina
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("\n*** Máquina Expendedora de Golosinas ***");
        System.out.println("1. Pedir golosina");
        System.out.println("2. Mostrar golosinas");
        System.out.println("3. Rellenar golosinas");
        System.out.println("4. Apagar máquina");
        System.out.print("Seleccione una opción: ");
    }

    public static void pedirGolosina(Scanner scanner) {
        System.out.print("Introduzca la posición de la golosina (ej. 20): ");
        String posicion = scanner.next();
        int fila = Character.getNumericValue(posicion.charAt(0));
        int columna = Character.getNumericValue(posicion.charAt(1));
        if (fila >= 0 && fila < cantidad.length && columna >= 0 && columna < cantidad[0].length) {
            if (cantidad[fila][columna] > 0) {
                cantidad[fila][columna]--;
                ventasTotales += precio[fila][columna];
                System.out
                        .println("Ha comprado: " + nombre[fila][columna] + " por " + precio[fila][columna] + " euros.");
            } else {
                System.out.println("Lo siento, no quedan más golosinas de este tipo.");
            }
        } else {
            System.out.println("Posición no válida.");
        }
    }

    public static void mostrarGolosinas() {
        System.out.println("\nListado de golosinas disponibles:");
        for (int i = 0; i < nombre.length; i++) {
            for (int j = 0; j < nombre[i].length; j++) {
                System.out.println(i + "" + j + " - " + nombre[i][j] + " - " + precio[i][j] + " euros");
            }
        }
    }

    public static void rellenarGolosinas(Scanner scanner) {
        System.out.print("Introduzca la contraseña: ");
        String contrasena = scanner.next();
        if ("Maquina2021".equals(contrasena)) {
            System.out.print("Introduzca la posición de la golosina a rellenar (ej. 20): ");
            String posicion = scanner.next();
            int fila = Character.getNumericValue(posicion.charAt(0));
            int columna = Character.getNumericValue(posicion.charAt(1));
            if (fila >= 0 && fila < cantidad.length && columna >= 0 && columna < cantidad[0].length) {
                System.out.print("Introduzca la cantidad a añadir: ");
                int cantidadAAñadir = scanner.nextInt();
                cantidad[fila][columna] += cantidadAAñadir;
                System.out.println("Golosina rellenada correctamente.");
            } else {
                System.out.println("Posición no válida.");
            }
        } else {
            System.out.println("Contraseña incorrecta.");
        }
    }
}
