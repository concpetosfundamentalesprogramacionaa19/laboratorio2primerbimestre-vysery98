package laboratorio2;

import java.util.Scanner;

/**
 *
 * @author vysery98
 */
public class Principal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // para lectura de datos

        System.out.println("\\_____EJERCICIO 1_____/");

        // función a realizar
        System.out.println("f(x)= 2x^3 + 2x - 7");

        do {
            System.out.print(Variables.menu + "\nIngrese una opcion: ");
            Variables.opt = scan.nextInt();

            switch (Variables.opt) {

                case 1: // Solo un Valor

                    System.out.println("TABLA DE VALORES");

                    // entrada de datos
                    System.out.print("Ingrese el número a asignar a 'x'=");
                    Variables.varInd = scan.nextInt();

                    // proceso
                    Variables.varDep = (2 * Math.pow(Variables.limInf, 3)
                            + (2 * Variables.limInf) - 7);

                    // salida
                    System.out.printf("NaN = Not a Number (resultado imposible"
                            + " de calcular).\nx\t|\tf(x)\n%d\t|\t%.2f\n",
                            Variables.varInd, Variables.varDep);

                    break;

                case 2: // Más de un valor

                    System.out.println("TABLA DE VALORES");

                    // entrada de datos
                    System.out.print("Ingrese el número desde el que desea "
                            + "empezar:");
                    Variables.limInf = scan.nextInt();

                    System.out.print("Ingrese el número hasta donde calcular "
                            + "la tabla:");
                    Variables.limSup = scan.nextInt();

                    // Cálculo del límite para los arreglos tanto de x como de y
                    if (Variables.limInf == Variables.limSup) {

                        Variables.lim = 1;

                    } else {

                        Variables.lim = Math.abs((Variables.limSup
                                - Variables.limInf));

                        if (Variables.lim == 0) {

                            Variables.lim = 1;

                        }

                    }

                    // declaración de arreglos
                    Variables.x = new double[Variables.lim + 1];
                    Variables.y = new double[Variables.lim + 1]; // f(x)

                    // proceso
                    for (int i = 0; i <= Variables.lim; i++) {

                        if (Variables.limInf <= Variables.lim) {
                            Variables.x[i] = (Variables.limInf);
                        }

                        Variables.y[i] = (2 * Math.pow(Variables.limInf, 3) + (2
                                * Variables.limInf) - 7);
                        Variables.limInf++;

                    }

                    // salida
                    System.out.println("NaN = Not a Number (resultado imposible"
                            + " de calcular).\nx\t|\tf(x)");
                    for (int i = 0; i <= Variables.lim; i++) {
                        System.out.printf("%.0f\t|\t%.2f\n", Variables.x[i],
                                Variables.y[i]);
                    }

                    break;

                case 3: // Cerrar

                    Variables.salir = false;
                    System.out.println("**CERRANDO**");
                    break;

                default:
                    System.out.println("Opción inválida.\nf(x)= 2x^3 + 2x - 7");
            }

        } while (Variables.salir);
    }

}
