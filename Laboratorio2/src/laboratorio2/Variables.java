package laboratorio2;

/**
 *
 * @author vysery98
 */
public class Variables { // declaración de variables a utilizar

// para la salida
    public static String reporte;
    public static String factibilidad;
    // disponibilidad de recursos (alcanza o falta)

// datos del padre de familia
    // contador de número de padre de familia y de reporte
    public static int contador1 = 1;
    public static String nombres;
    public static String apellidos;
    public static double sueldo;
        // cálculo de gastos en base al sueldo
        public static double Total; // sueldo - gastoTotal
        public static double gastoTotal = 0; // total: pasajes, bar y salidas
        public static double totalPasajes = 0; // suma de pasajes
        public static double totalBar = 0; // sumar bar
        public static double totalSalidas = 0; // suma salidas
    public static int numHijos; // cantidad de hijos

// datos de los hijos
    public static int contador2 = 1; // contador de número de hijo
    public static double gastoPasajes;
    public static double gastoBar;
    public static double gastoSalidas;

// para ciclo while
    public static String opc; // opción, si opc == n sale de while
    public static boolean salida = true; // si salida == false, termina el ciclo

}
