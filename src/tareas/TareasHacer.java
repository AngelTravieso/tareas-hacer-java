package tareas;

import java.util.*;
import constants.Constantes;
import negocio.*;

public class TareasHacer {

    static IAccionesTarea acciones = new AccionesTareaImpl();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            // Mostrar menu
            mostrarMenu();

            try {
                opcion = sc.nextInt();

                switch (opcion) {
                    case Constantes.SALIR -> // Cerrar consola (salida)
                        cerrarConsola(sc);
                    case Constantes.AGREGAR -> // Agregar Tarea
                        agregar();
                    case Constantes.LISTAR -> // Listar Tareas
                        listar();
                    case Constantes.ACTUALIZAR -> // Actualizar Tarea
                        actualizar();
                    case Constantes.ELIMINAR -> // Eliminar Tarea
                        eliminar();
                    default -> // Opcion no valida
                        System.out.println("Opcion no valida");
                }

            } catch (InputMismatchException ex) {
                ex.printStackTrace(System.out);

            }

        } while (opcion < 0 || opcion > 4);

    }

    // Mostrar menu
    public static void mostrarMenu() {
        System.out.println("--- Gestion de Tareas ---\n");
        System.out.println("1. Agregar Tarea");
        System.out.println("2. Listar Tareas");
        System.out.println("3. Actualizar Tarea");
        System.out.println("4. Eliminar Tarea \n");
        System.out.println("0. Salir\n");
        System.out.print("Opcion: ");
    }

    // Cerrar la consola
    public static void cerrarConsola(Scanner sc) {
        System.out.println("\n¡Programa finalizado!");
        sc.close();

    }

    // Agregar Tarea
    public static void agregar() {
        System.out.println("agregando");
    }

    // Listar Tareas
    public static void listar() {
        System.out.println("listando");
    }

    // Actualizar Tarea
    public static void actualizar() {
        System.out.println("actualizando");
    }

    // Eliminar Tarea
    public static void eliminar() {
        System.out.println("eliminando");
    }
}
