package laboratorio2;

import laboratorio2.Variables;

/**
 *
 * @author vysery98
 */
public class Variables {

    // SWITCH
    public static String menu = "Menu:\n\t"
            + "1. Calcular solo un valor.\n\t"
            + "2. Calcular más de un valor\n\t"
            + "3. SALIR.\n";

    public static boolean salir = true;

    public static int opt;

// SOLO UN VALOR
    public static int varInd; // valor de x para calcular f(x)_Variable Indepen.
    public static double varDep; // f(x)_Variable Dependiente

// MÁS DE UN VALOR
    // número menor de la tabla de valores (x)
    public static int limInf;

    // límite de la tabla de valores
    public static int limSup;

    // límite des arrays x - f(x)
    public static int lim;

    public static double x[];

    // f(x)
    public static double y[];

}
