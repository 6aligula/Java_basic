import java.util.Scanner; // Importamos la clase Scanner para leer desde la consola

public class DiasDelMes {
    public static void main(String[] args) {
        // Array con el número de días de cada mes
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner

        System.out.println("Introduce el número de mes (1 para Enero, ..., 12 para Diciembre): ");
        int mes = scanner.nextInt(); // Leemos el número de mes

        // Verificamos que el mes sea válido (entre 1 y 12)
        if (mes < 1 || mes > 12) {
            System.out.println("Mes no válido. Por favor, introduce un número entre 1 y 12.");
        } else {
            // Mostramos el número de días del mes seleccionado
            System.out.println("El mes número " + mes + " tiene " + diasMes[mes - 1] + " días.");
        }
        
        scanner.close(); // Cerramos el scanner
    }
}

//con metodos:
// import java.util.Scanner; // Importamos la clase Scanner para leer desde la consola

// public class DiasDelMes {
//     public static void main(String[] args) {
//         int[] diasMes = crearArrayDiasMes(); // Creamos y obtenemos el array con los días de cada mes
//         int mes = obtenerMesUsuario(); // Obtenemos el mes del usuario

//         if (mesValido(mes)) {
//             mostrarDiasMes(mes, diasMes); // Mostramos los días del mes seleccionado
//         } else {
//             System.out.println("Mes no válido. Por favor, introduce un número entre 1 y 12.");
//         }
//     }

//     // Método para crear y devolver un array con el número de días de cada mes
//     public static int[] crearArrayDiasMes() {
//         return new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//     }

//     // Método para pedir al usuario que introduzca el mes y devolverlo
//     public static int obtenerMesUsuario() {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Introduce el número de mes (1 para Enero, ..., 12 para Diciembre): ");
//         int mes = scanner.nextInt();
//         scanner.close(); // Cerramos el scanner después de usarlo
//         return mes;
//     }

//     // Método para mostrar el número de días del mes
//     public static void mostrarDiasMes(int mes, int[] diasMes) {
//         System.out.println("El mes número " + mes + " tiene " + diasMes[mes - 1] + " días.");
//     }

//     // Método para verificar si el mes es válido
//     public static boolean mesValido(int mes) {
//         return mes >= 1 && mes <= 12;
//     }
// }
