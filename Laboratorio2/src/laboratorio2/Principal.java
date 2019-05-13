package laboratorio2;

import java.util.Scanner;
import laboratorio2.Variables;

/**
 *
 * @author vysery98
 */
public class Principal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // lectura de datos

        Variables.reporte = ""; // salida

        Variables.reporte = String.format("%s%s\n\n", Variables.reporte, "Repor"
                + "te Gastos de Padres de familia"); // acumulador de salida

        // 1er ciclo while para padres de familia
        while (Variables.salida == true) {

            System.out.println("Datos del padre Nº" + Variables.contador1);
            System.out.print("\nNombres del padre de familia: ");
            Variables.nombres = scan.nextLine();
            System.out.print("Apellidos del padre de familia: ");
            Variables.apellidos = scan.nextLine();
            System.out.print("Sueldo semanal: $");
            Variables.sueldo = scan.nextDouble();
            System.out.print("¿Cuántos hijos tiene?: ");
            Variables.numHijos = scan.nextInt();

            Variables.reporte = String.format("%s%s%d\n\nNombre de Padre de fam"
                    + "ilia: %s %s\nSueldo Semanal: $%.2f \nNúmero de hijos: %d"
                    + "\n\nReporte de Gastos\nPersona \tPasaje  \tBar\t\tSalida"
                    + "s\n", Variables.reporte, "Reporte ", Variables.contador1,
                    Variables.nombres, Variables.apellidos, Variables.sueldo,
                    Variables.numHijos); // acumulador de salida

            // 2do ciclo while según la cantidad de hijos ingresada
            while (Variables.contador2 <= Variables.numHijos) {

                System.out.println("\nDatos del hijo Nº" + Variables.contador2);
                System.out.print("Gasto semanal en pasajes: $");
                Variables.gastoPasajes = scan.nextDouble();
                System.out.print("Gasto semanal en bares: $");
                Variables.gastoBar = scan.nextDouble();
                System.out.print("Gasto semanal en salidas: $");
                Variables.gastoSalidas = scan.nextDouble();

                /* 
                se calcula el total de gastos en Pasajes, Bar y Salidas para 
                saber si el sueldo del padre de familia alcanza o le falta.
                 */
                Variables.totalPasajes = Variables.totalPasajes
                        + Variables.gastoPasajes;
                Variables.totalBar = Variables.totalBar + Variables.gastoBar;
                Variables.totalSalidas = Variables.totalSalidas
                        + Variables.gastoSalidas;

                Variables.reporte = String.format("%sHijo %d: \t%.2f\t\t\t%.2f"
                        + "\t\t%.2f\n", Variables.reporte, Variables.contador2,
                        Variables.gastoPasajes, Variables.gastoBar,
                        Variables.gastoSalidas); // acumulador de salida

                Variables.contador2++;
                // contador2 = contador2 + 1 (aumento contador)

            }

            Variables.gastoTotal = Variables.totalPasajes
                    + Variables.totalBar + Variables.totalSalidas;

            // cálculo del Total
            Variables.Total = Variables.sueldo - Variables.gastoTotal;

            // mensaje: segun el sueldo -> alcanza o falta dinero semanal
            if (Variables.Total >= 0) {
                Variables.factibilidad = "le alcanza el dinero semanal, para su"
                        + "s gastos";
            } else {
                Variables.factibilidad = "le falta el dinero semanal, para sus"
                        + " gastos";
            }

            Variables.reporte = String.format("%sTotales \t%.2f\t\t\t%.2f"
                    + "\t\t%.2f\n", Variables.reporte, Variables.totalPasajes,
                    Variables.totalBar, Variables.totalSalidas);
            // acumulador de salida

            Variables.reporte = String.format("%sEl padre de familia %s %s %s\n"
                    + "\nFin reporte %d\n\n", Variables.reporte, Variables.nombres,
                    Variables.apellidos, Variables.factibilidad,
                    Variables.contador1); // acumulador de salida

            Variables.contador1++;
            // contador1 = contador1 + 1 (aumento contador)

            // reinicio de las variables numéricas para nuevo ingreso de datos
            Variables.contador2 = 1;
            Variables.totalPasajes = 0;
            Variables.totalBar = 0;
            Variables.totalSalidas = 0;
            scan.nextLine(); // limpieza del buffer
            
            // para continuar ingresando datos o detenerse
            System.out.println("\n¿Continuar introduciendo datos? (\"n\" para s"
                    + "alir).");
            Variables.opc = scan.nextLine();

            if (Variables.opc.equals("n")) {
                Variables.salida = false;
            }

        }

        // salida
        System.out.printf("%s", Variables.reporte);

    }

}
